import javax.swing.*;

public class TradeView {
    private JFrame mFrame;

    public TradeView(){
        // Windows Frame
        mFrame = new JFrame("TradeView");
        mFrame.setVisible(true);
    }

    public JFrame getFrame(){
        return mFrame;
    }
}

