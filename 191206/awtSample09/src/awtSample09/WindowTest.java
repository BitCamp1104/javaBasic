package awtSample09;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener {

	Image img = null;
	Image pngImg = null;
	
	public WindowTest() {
		
		setLayout(null);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		img = tk.getImage("house.jpg");
	//	img = tk.getImage("d:\\tmp\\pig.png");
	//	img = tk.getImage("\\\\192.168.3.3\\공유\\경치.gif");
		
		pngImg = tk.getImage("bird.png");
				
		img.getWidth(this);
		img.getHeight(this);
				
		setSize(640, 480);	
		setLocation(100, 0);	
		setVisible(true);	
		
		addWindowListener(this);
	}
	
	@Override
	public void paint(Graphics g) {		
		super.paint(g);
		
		int imgWidth = img.getWidth(this);
		int imgHeight = img.getHeight(this);
		setSize(imgWidth, imgHeight);			
		
		g.drawImage(img, 0, 0, this);
		
		g.drawImage(pngImg, 200, 200, this);
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

