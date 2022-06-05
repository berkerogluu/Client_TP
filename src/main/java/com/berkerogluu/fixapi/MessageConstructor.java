package com.berkerogluu.fixapi;

import java.nio.charset.StandardCharsets;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageConstructor {

    public enum SessionMessageType {
        Logon,
        Logout,
        Heartbeat,
        TestRequest,
        Resend,
        Reject,
        SequenceReset
    }

    public enum ApplicationMessageType{
        MarketDataRequest,
        MarketDataIncrementalRefresh,
        NewOrderSingle,
        OrderStatusRequest,
        ExecutionReport,
        BusinessMessageReject,
        RequestForPosition,
        PositionReport
    }

    public enum SessionQualifier{
        QUOTE,
        TRADE
    }

    private String _host;
    private String _username;
    private String _password;
    private String _senderCompID;
    private String _senderSubID;
    private String _targetCompID;

    public MessageConstructor (String host, String username, String password, String senderCompID, String senderSubID, String targetCompID){
        _host = host;
        _username = username;
        _password = password;
        _senderCompID = senderCompID;
        _senderSubID = senderSubID;
        _targetCompID = targetCompID;
    }

    public String LogonMessage(SessionQualifier qualifier, int messageSequenceNumber, int heartBeatSeconds, boolean resetSeqNum){
        StringBuilder body = new StringBuilder();

        //
        body.append("98=0|");

        //
        body.append("108=" + heartBeatSeconds + "|");

        //
        if(resetSeqNum){
            body.append("141=Y|");
        }

        //
        body.append("553=" + _username + "|");
        body.append("554=" + _password + "|");

        String header = ConstructHeader(qualifier, SessionMessageCode(SessionMessageType.Logon), messageSequenceNumber, body.toString());
        String headerAndBody = header + body;
        String trailer = ConstructTrailer(headerAndBody);
        String headerAndMessageAndTrailer = header + body + trailer;

        return headerAndMessageAndTrailer.replace("|", "\u0001");
    }

    private String ConstructHeader(SessionQualifier qualifier, String type, int messageSequenceNumber, String bodyMessage){
        StringBuilder header = new StringBuilder();

        //
        header.append("8=FIX.4.4|");

        StringBuilder message = new StringBuilder();

        //
        message.append("35=" + type + "|");

        //
        message.append("49=" + _senderCompID + "|");

        //
        message.append("56=" + _targetCompID + "|");

        //
        message.append("57=" + qualifier.toString() + "|");

        //
        message.append("50=" + _senderSubID + "|");

        //
        message.append("34=" + messageSequenceNumber + "|");

        //
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HH:mm:ss");
        dateFormat.format(new Date(), new StringBuffer(), new FieldPosition(0));
        message.append("52=" + dateFormat + "|");

        //
        int length = message.length() + bodyMessage.length();
        header.append("9=" + length + "|");
        header.append(message);

        return header.toString();
    }

    private static String padLeftLoopSB(String input, char padChar, int padUpTo){
        StringBuilder sb = new StringBuilder();
        for (int toPrepend=padUpTo-input.length(); toPrepend>0; toPrepend--) {
            sb.append(padChar);
        }
        sb.append(input);
        return sb.toString();
    }

    private String ConstructTrailer(String message){
        //
        String trailer = "10=" + CalculateChecksum(message.replace("|", "\u0001"));
        trailer = padLeftLoopSB(trailer, '0', 3);

        return trailer;
    }

    private int CalculateChecksum(String dataToCalculate){
        byte[] byteToCalculate = dataToCalculate.getBytes(StandardCharsets.US_ASCII);
        int checksum = 0;

        List<Byte> list = new ArrayList<Byte>();
        for(byte chData : byteToCalculate){
            checksum += chData;
        }
        return checksum % 256;
    }

    private String SessionMessageCode(SessionMessageType type){
        switch (type){
            case Heartbeat:
                return "0";

            case Logon:
                return "A";

            case Logout:
                return "5";

            case Reject:
                return "3";

            case Resend:
                return "2";

            case SequenceReset:
                return "4";

            case TestRequest:
                return "1";

            default:
                return "0";
        }
    }
}
