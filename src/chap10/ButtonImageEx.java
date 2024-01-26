package chap10;

import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
	public ButtonImageEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// 3 개의 이미지를 읽어들인다.
		ImageIcon normalIcon = new ImageIcon("src/chap10/images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("src/chap10/images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("src/chap10/images/pressedIcon.gif");
		
		// 3개의 아이콘을 가진 버튼 컴포넌트 생성
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);// pressedIcon용 이미지 등록
		btn.setRolloverIcon(rolloverIcon);// rolloverIcon용 이미지 등록
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new ButtonImageEx();
	}
}