package chap08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JToolBar {
    public ToolBar(MainPanel mainPanel){
        final JButton redButton = new JButton("Red");
        final JButton blueButton = new JButton("Blue");
        //이벤트 리스너
        redButton.addActionListener(new ColorButtonListener(mainPanel, Color.RED));
        blueButton.addActionListener(new ColorButtonListener(mainPanel, Color.BLUE));
        add(redButton);
        add(blueButton);
    }
}
class ColorButtonListener implements ActionListener{
    private MainPanel mainPanel;
    private Color color;

    public ColorButtonListener(MainPanel mainPanel, Color color){
        this.mainPanel = mainPanel;
        this.color = color;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(color.toString()+" Button clicked");
        mainPanel.setBackground(color);
    }
}

