package chap10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextAreaEx extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7, 20); // 한줄에 20개 입력가능 x 7줄 입력창
	
	public TextAreaEx() {
		setTitle("텍스트영역 만들기  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		// 텍스트필드에 Action 리스너를 등록한다.
		tf.addActionListener(new ActionListener() { // <Enter> 키 입력시 작동하는 리스너
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n"); // 텍스트필드의 문자열을 텍스트영역에 붙임 
				t.setText(""); // 현재 텍스트필드에 입력된 내용 지우기
			}
		});
		
		setSize(300,250);
		setVisible(true);
	}
		
	public static void main(String [] args) {
		new TextAreaEx();
	}
}