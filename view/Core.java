public class Core {

    private IFrame mFrame;
    private OrdersPanel mOrdersPanel;
    private CreateOrderPanel mCreateOrderPanel;
    private ChartPanel mChartPanel;
    private MarketWatchPanel mMarketWatchPanel;
    public Core(){
        /* Initialize Main Panel Components */
        mFrame = new IFrame();
        mOrdersPanel = new OrdersPanel();
        mCreateOrderPanel = new CreateOrderPanel();
        mChartPanel = new ChartPanel();
        mMarketWatchPanel = new MarketWatchPanel();

        /* Add Panel Views to Main Frame */
        mFrame.getFrame().add(mOrdersPanel.getPanel());
        mFrame.getFrame().add(mCreateOrderPanel.getPanel());
        mFrame.getFrame().add(mMarketWatchPanel.getPanel());
        mFrame.getFrame().add(mChartPanel.getPanel());

        /*  */
        mFrame.getFrame().setVisible(true);
    }
}
