import javax.swing.*;
import java.awt.*;

public class CreateOrderPanel extends JPanel {

    private JButton btnInstantBuy;
    private JButton btnInstantSell;
    private JLabel lblOrderLot;
    private JTextField tfOrderLot;
    public CreateOrderPanel(){
        this.setLayout(new FlowLayout());
        this.setBounds(0,0,300,100);

        btnInstantBuy = new JButton("MARKET BUY ");
        btnInstantBuy.setBackground(Color.GREEN);
        btnInstantSell = new JButton("MARKET SELL");
        btnInstantSell.setBackground(Color.RED);

        lblOrderLot = new JLabel("Order Size: ");

        tfOrderLot = new JTextField("0.01");
        tfOrderLot.setPreferredSize(new Dimension(100,20));

        this.add(btnInstantBuy);
        this.add(btnInstantSell);
        this.add(lblOrderLot);
        this.add(tfOrderLot);
    }

    public JPanel getPanel(){
        return this;
    }
}
