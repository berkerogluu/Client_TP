package com.berkerogluu.view;

public class Core {

    private IFrame _frame;
    private OrdersPanel _ordersPanel;
    private CreateOrderPanel _createOrderPanel;
    private ChartPanel _chartPanel;
    private MarketWatchPanel _marketWatchPanel;
    public Core(){
        /* Initialize Main Panel Components */
        _frame = new IFrame();
        _ordersPanel = new OrdersPanel();
        _createOrderPanel = new CreateOrderPanel();
        _chartPanel = new ChartPanel();
        _marketWatchPanel = new MarketWatchPanel();
    }

    public void init(){
        /* Add Panel Views to Main Frame */
        _frame.getFrame().add(_ordersPanel.getPanel());
        _frame.getFrame().add(_createOrderPanel.getPanel());
        _frame.getFrame().add(_marketWatchPanel.getPanel());
        _frame.getFrame().add(_chartPanel.getPanel());

        /*  */
        _frame.getFrame().setVisible(true);
    }

    public IFrame getIFrame(){
        return _frame;
    }

    public OrdersPanel getOrderPanel(){
        return _ordersPanel;
    }

    public CreateOrderPanel getCreateOrderPanel(){
        return _createOrderPanel;
    }

    public MarketWatchPanel getMarketWatchPanel(){
        return _marketWatchPanel;
    }

    public ChartPanel getChartPanel(){
        return _chartPanel;
    }
}
