package MathGame;

import javax.swing.*;
import java.awt.*;

public class Structure extends JFrame {
    private JFrame BigOne;
    public void run(){
        BigOne = buildUp();
    }
    public JFrame buildUp(){
        BigOne = new JFrame("2 players math game");
        BigOne.setLayout(new CardLayout());
        BigOne.setSize(500,600);
        BigOne.setVisible(true);
        return BigOne;
    }
}
