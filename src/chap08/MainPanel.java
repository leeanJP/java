package chap08;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    public MainPanel(){
        setBackground(Color.ORANGE);
    }

    public  MainPanel(int r, int g , int b){
        super();
        setBackground(new Color(r,g,b));
    }



}
