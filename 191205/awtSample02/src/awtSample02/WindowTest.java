package awtSample02;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener {

	public WindowTest() {
		super("label");
		
		setTitle("레이블");
		
	//	setSize(640, 480);
	//	setLocation(0, 0);				
		
		setBounds(0, 0, 640, 480);
		setVisible(true);
		
		addWindowListener(this);
		
		Label label = new Label();
		label.setText("여기가 레이블입니다");
		add(label);
		
		Label label1 = new Label("추가 레이블입니다");
		add(label1);
		
		System.out.println("WindowTest WindowTest()");
		
		JOptionPane.showMessageDialog(null, "WindowTest WindowTest() 실행");
		
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
