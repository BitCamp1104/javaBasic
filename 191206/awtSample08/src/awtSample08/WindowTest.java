package awtSample08;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener/* , ItemListener */ {

	Choice choice;
	Label label;
	
	public WindowTest() {
		
		// AWT 		- Choice
		// swing 	- JComboBox
		setLayout(new FlowLayout());
		
		choice = new Choice();
		choice.add("사과");
		choice.add("망고");
		choice.add("오렌지");
		choice.add("포도");
		choice.add("배");
		
		//choice.addItemListener(this);
		choice.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText(choice.getSelectedItem());	
			}
		});
		
		add(choice);
		
		label = new Label("---");
		add(label);		
		
		setSize(640, 480);	// 윈도우의 크기 (폭, 높이)
		setLocation(100, 0);	// 윈도우 실행위치
		setVisible(true);	// 윈도우 시각화	
		
		addWindowListener(this);
	}	
	/*
	@Override
	public void itemStateChanged(ItemEvent e) {				
		Choice ch = (Choice)e.getSource();		
		String selected = ch.getSelectedItem();		
		label.setText(selected);		
	}
	*/



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
