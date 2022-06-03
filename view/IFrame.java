import javax.swing.*;
import java.awt.*;

public class IFrame extends JFrame {


    public IFrame(){

        // Initialize Frame
        this.setTitle("Trading Application - [ICMARKETS_OPENAPI:20049660:DEMO]");
        this.setSize(new Dimension(1200,800));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
    }

    public JFrame getFrame(){
        return this;
    }
}
