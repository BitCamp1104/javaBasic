package awtSample07;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class WindowTest extends Frame implements WindowListener, ItemListener {

	Checkbox cb1, cb2, cb3, cb4, cb5, cb6;
	Label label1, label2;
	
	JRadioButton rb;
	
	public WindowTest() {
		/*
			Check Box (취미)
			Radio Button
			
			AWT : radio -> checkbox
			swing : JRadioButton
		*/
		
		CheckboxGroup cbg1 = new CheckboxGroup();
		// cb1, cb2, cb3 	<- 1 group
		cb1 = new Checkbox("사과", cbg1, true);
		cb2 = new Checkbox("배", cbg1, false);
		cb3 = new Checkbox("바나나", cbg1, false);
		
		CheckboxGroup cbg2 = new CheckboxGroup();
		// cb4, cb5 		<- 2 group
		cb4 = new Checkbox("남성", cbg2, true);
		cb5 = new Checkbox("여성", cbg2, false);
		
		// cb6		<- check box
		cb6 = new Checkbox("exit");		
		
		label1 = new Label("label1");
		label2 = new Label("label2");
		
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(cb6);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		cb6.addItemListener(this);
		
		add(label1);
		add(label2);
		
		setLayout(new FlowLayout());
		setSize(640, 480);	// 윈도우의 크기 (폭, 높이)
		setLocation(100, 0);	// 윈도우 실행위치
		setVisible(true);	// 윈도우 시각화	
		
		addWindowListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
	//	JOptionPane.showMessageDialog(null, "첵크");
		Object obj = e.getSource();
		Checkbox cb = (Checkbox)obj;
				
		if(obj == cb6) {	// check box
			cb = (Checkbox)obj;
			if(cb.getState()) {
				JOptionPane.showMessageDialog(null, "첵크되었음");
				System.exit(0);				
			}else {
				JOptionPane.showMessageDialog(null, "첵크취소 되었음");
			}
		}else if(obj == cb1 || obj == cb2 || obj == cb3){			
			if(cb.getState()) {
				label1.setText( cb.getLabel() );				
			}			
		}else if(obj == cb4 || obj == cb5){			
			if(cb.getState()) {
				label2.setText( cb.getLabel() );				
			}			
		}
		
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
