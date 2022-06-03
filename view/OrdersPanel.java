import javax.swing.*;
import java.awt.*;

public class OrdersPanel extends JPanel {

    private JTable tblOrdersList;
    private JLabel lblAccountInfo;
    private JButton btnCloseOrder;
    public OrdersPanel(){
        this.setLayout(new BorderLayout());
        this.setBounds(0,600,1200,160);

        String data[][]={{"101","17:52 02/02/1999","Sell", "0.01", "GBPUSD", "1.31560", "1.31200", "1.31900", "-0.60", "0.00", "15.60"},
                {"101","17:52 02/02/1999","Sell", "0.01", "GBPUSD", "1.31560", "1.31200", "1.31900", "-0.60", "0.00", "15.60"},
                {"101","17:52 02/02/1999","Sell", "0.01", "GBPUSD", "1.31560", "1.31200", "1.31900", "-0.60", "0.00", "15.60"},
                {"101","17:52 02/02/1999","Sell", "0.01", "GBPUSD", "1.31560", "1.31200", "1.31900", "-0.60", "0.00", "15.60"},
                {"101","17:52 02/02/1999","Sell", "0.01", "GBPUSD", "1.31560", "1.31200", "1.31900", "-0.60", "0.00", "15.60"},
                {"101","17:52 02/02/1999","Sell", "0.01", "GBPUSD", "1.31560", "1.31200", "1.31900", "-0.60", "0.00", "15.60"},
                {"101","17:52 02/02/1999","Sell", "0.01", "GBPUSD", "1.31560", "1.31200", "1.31900", "-0.60", "0.00", "15.60"},
                {"101","17:52 02/02/1999","Sell", "0.01", "GBPUSD", "1.31560", "1.31200", "1.31900", "-0.60", "0.00", "15.60"},
                {"101","17:52 02/02/1999","Sell", "0.01", "GBPUSD", "1.31560", "1.31200", "1.31900", "-0.60", "0.00", "15.60"},
                {"101","17:52 02/02/1999","Sell", "0.01", "GBPUSD", "1.31560", "1.31200", "1.31900", "-0.60", "0.00", "15.60"}};
        String column[]={"Order ID","Open Time","Type", "Size", "Symbol", "Open Price", "TP", "SL", "Commission", "Swap", "Profit"};
        tblOrdersList = new JTable(data,column);
        lblAccountInfo = new JLabel("Balance: 10000.00 USD | Equity: 10000.00 USD | Free Margin: 10000.00 USD | Unrealized Profit: 0.00 USD");
        btnCloseOrder = new JButton("[Close Order]");

        this.add(new JScrollPane(tblOrdersList), BorderLayout.CENTER);
        this.add(lblAccountInfo, BorderLayout.SOUTH);
        this.add(btnCloseOrder,BorderLayout.NORTH);

    }

    public JPanel getPanel(){
        return this;
    }
}
