package awtSample03;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener {

	public WindowTest() {
		super("layout");
		
	//	setLayout(new FlowLayout());
	//	setLayout(new GridLayout(3, 1));
		setLayout(null);
				
		// label1
		Label label1 = new Label("레이블1 입니다");
		label1.setBackground(new Color(255, 0, 0));
		label1.setSize(150, 30);
		label1.setLocation(100, 100);
		add(label1);
		
		// label2
		Label label2 = new Label("레이블2 입니다");
		label2.setBackground(new Color(0, 255, 0));
		label2.setBounds(100, 200, 200, 100);
		add(label2);	
		
		Button button = new Button();
		button.setLabel("버튼");
		button.setBounds(100, 350, 200, 100);
		add(button);
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		addWindowListener(this);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
