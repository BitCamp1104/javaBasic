

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class WindowTest extends JFrame {
	
	JTextField textField;
	JTextArea textArea;
	
	JButton btn1, btn2; 
	
	public WindowTest() {
		super("간단한 예제");
		
		JPanel panel = new JPanel();
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		
		JScrollPane scrPane = new JScrollPane(textArea);
		scrPane.setPreferredSize(new Dimension(400, 300));
		
		panel.add(scrPane);
		
		JPanel botpan = new JPanel();
		
		textField = new JTextField(20);
		
		btn1 = new JButton("next insert");
		btn1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
			//	JOptionPane.showMessageDialog(null, "next insert");
				if( !textField.getText().equals("") ) {
					String msg = textField.getText() + "\n";					
					textArea.append(msg);
				}
			}
		});
		
		btn2 = new JButton("prev insert");
		btn2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {			 
			//	JOptionPane.showMessageDialog(null, "prev insert");
				
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "문장을 작성해 주십시오");
					return;
				}
				
				try {
					
					textArea.insert(textField.getText() + "\n", 
									textArea.getLineStartOffset(0));
					
				} catch (BadLocationException e1) {					 
					e1.printStackTrace();
				}
				
			}
		});
		
		botpan.add(textField);
		botpan.add(btn1);
		botpan.add(btn2);
		
		// Layout
		Container contentPane = getContentPane();
		
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(botpan, BorderLayout.SOUTH);
				
		setSize(640, 480);	// 윈도우의 크기 (폭, 높이)
		setLocation(100, 0);	// 윈도우 실행위치
		setVisible(true);	// 윈도우 시각화	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
}





