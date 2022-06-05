package com.berkerogluu.fixapi;

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
}
