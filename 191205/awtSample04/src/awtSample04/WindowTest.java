package awtSample04;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener {

	public WindowTest() {
		
		// Panel == 종이위에 종이
		setLayout(new GridLayout(2, 1));
		
		// label -> 위 부분
	//	Label label = new Label("label");
	//	add(label);
		
		myPanel myP = new myPanel();
		add(myP);
		
		// Panel
		Panel panel = new Panel();
		panel.setBackground(Color.gray);
		panel.setLayout(new GridLayout(1, 2));
		add(panel);
		
		Label label1 = new Label("label 1");
		panel.add(label1);
		
		Button button = new Button("button");
		panel.add(button);
		
		setSize(640, 480);
		setLocation(0, 0);
		
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
