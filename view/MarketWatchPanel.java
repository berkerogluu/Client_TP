import javax.swing.*;
import java.awt.*;

public class MarketWatchPanel extends JPanel {

    private JTable tblMarketWatch;
    public MarketWatchPanel(){
        this.setLayout(new BorderLayout());
        this.setBounds(0,100,300,540);

        String data[][]={{"USDJPY", "1.27100", "1.27107", "7"}};
        String column[]={"Symbol", "Ask", "Bid", "Spread"};
        tblMarketWatch = new JTable(data,column);

        this.add(new JScrollPane(tblMarketWatch), BorderLayout.CENTER);
    }

    public JPanel getPanel(){
        return this;
    }

    public JTable getMarketWatchTable(){
        return tblMarketWatch;
    }
}
