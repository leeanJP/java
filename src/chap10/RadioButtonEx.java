package chap10;

import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("라디오버튼 만들기  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ButtonGroup g = new ButtonGroup();  // 버튼 그룹 객체 생성
		
		// 라디오버튼 3 개 생성
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리");
		
		// 버튼 그룹에 3개의 라디오버튼 삽입
		g.add(apple);
		g.add(pear);
		g.add(cherry);

		// 컨텐트팬에 3 개의 라디오버튼 삽입
		c.add(apple); c.add(pear); c.add(cherry);

		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new RadioButtonEx();
	}
}