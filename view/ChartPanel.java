import javax.swing.*;
import java.awt.*;

public class ChartPanel extends JPanel {
    public ChartPanel(){
        this.setLayout(new BorderLayout());
        this.setBounds(300,0, 900, 640);
        this.setBackground(Color.BLUE);
    }

    public JPanel getPanel(){
        return this;
    }
}
