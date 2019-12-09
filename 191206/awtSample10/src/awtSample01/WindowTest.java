package awtSample01;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WindowTest extends JFrame implements WindowListener, MouseListener{
	
	JTable table;
	JScrollPane scrPane;	
	
	String columnNames[] = {
			"상품번호", "상품명", "상품가격", "상품회사"
	};
	
	Object rowDatas[][] = {
			{ 1001, "맛동산", 1000, "오리온" },
			{ 1002, "초코파이", 1200, "해태" },
			{ 1003, "감자깡", 1500, "롯데" }
	};	// 데이터를 삽입하는 배열
	
	public WindowTest() {
		
		table = new JTable(rowDatas, columnNames);
		table.addMouseListener(this);
		scrPane = new JScrollPane(table);
		add(scrPane);
				
		setSize(640, 480);	// 윈도우의 크기 (폭, 높이)
		setLocation(100, 0);	// 윈도우 실행위치
		setVisible(true);	// 윈도우 시각화	
		
		addWindowListener(this);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		int rowNum = table.getSelectedRow();
		
	//	JOptionPane.showMessageDialog(null, "rowNum = " + rowNum);
		
		String item = "상품번호:" + rowDatas[rowNum][0] + "\n" + 
						"상품명:" + rowDatas[rowNum][1] + "\n" +
						"상품가격:" + rowDatas[rowNum][2] + "\n" +
						"상품회사:" + rowDatas[rowNum][3];  
		
		JOptionPane.showMessageDialog(null, item);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosing");
		System.exit(0);		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowActivated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeactivated");
	}
	
	
}





