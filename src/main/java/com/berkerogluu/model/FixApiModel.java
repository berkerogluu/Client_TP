package com.berkerogluu.model;

import com.berkerogluu.fixapi.MessageConstructor;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class FixApiModel {

    private int _pricePort = 5201;
    private int _tradePort = 5202;

    private String _host = "h51.p.ctrader.com";
    private String _username = "8253104";
    private String _password = "Adana3301";
    private String _senderCompID = "demo.icmarkets.8253104";
    private String _senderSubID = "QUOTE";

    private String _targetCompID = "cSERVER";

    private int _messageSequenceNumber = 1;
    private int _testRequestID = 1;

    private Socket _priceClient;
    private Socket _tradeClient;
    private DataInputStream _inputPrice;
    private DataOutputStream _outputPrice;
    private DataInputStream _inputTrade;
    private DataOutputStream _outputTrade;

    private MessageConstructor _messageConstructor;

    public FixApiModel() {
        try {
            _priceClient = new Socket(_host, _pricePort);
            _inputPrice = new DataInputStream(_priceClient.getInputStream());
            _outputPrice = new DataOutputStream(_priceClient.getOutputStream());

            _tradeClient = new Socket(_host, _tradePort);
            _inputTrade = new DataInputStream(_tradeClient.getInputStream());
            _outputTrade = new DataOutputStream(_tradeClient.getOutputStream());
        }catch (Exception e){
            e.printStackTrace();
        }

        _messageConstructor = new MessageConstructor(_host, _username, _password, _senderCompID, _senderSubID, _targetCompID);
    }

    private String SendPriceMessage(String message){
        return  SendMessage(message, _inputPrice, _outputPrice);
    }

    private String SendTradeMessage(String message){
        return  SendMessage(message, _inputTrade, _outputTrade);
    }

    private String SendMessage(String message, DataInputStream i, DataOutputStream o){

        String result = null;
        try {
            byte[] byteArray = message.getBytes(StandardCharsets.US_ASCII);
            o.write(byteArray);
            System.out.println(new String(byteArray));
            result = i.readUTF();
            System.out.println(result);
            _messageSequenceNumber++;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public void logon(){
        System.out.println(SendPriceMessage(_messageConstructor.LogonMessage(MessageConstructor.SessionQualifier.QUOTE, _messageSequenceNumber, 30, false)));
    }

}
