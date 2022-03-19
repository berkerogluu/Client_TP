import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class TradeView extends JFrame{
    private static ResourceBundle mBundle;

    public TradeView(){
        // -Language Support-
        // Locale.setDefault(new Locale("en_US"));
        Locale.getDefault();
        mBundle = ResourceBundle.getBundle("TradeView");

        // Frame
        this.setTitle(mBundle.getString("Title"));
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }

    public JFrame getFrame(){
        return this;
    }
}

