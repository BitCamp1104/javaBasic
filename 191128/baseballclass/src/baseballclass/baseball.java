package baseballclass;

import java.util.Scanner;

public class baseball {

	private int r_num[], u_num[];
	private boolean clear;
	
	private int strike, ball;
	private int count;
	
	public void init() {
		r_num = new int[3];
		u_num = new int[3];		
		clear = false;
		count = 0;
		
		random();
	}
	
	public void random() {
		boolean _switch[] = new boolean[10];	
		int w, r;
		
		w = 0;
		while(w < 3) {
			r = (int)(Math.random() * 10);	// 0 ~ 9
			if(_switch[r] == false) {
				_switch[r] = true;		// fftff fffff
				r_num[w] = r + 1;		// 1 ~ 10
				w++;
			}
		}
		
		for (int i = 0; i < r_num.length; i++) {
			System.out.println("r_num[" + i + "] = " + r_num[i]);
		}
	}
	
	public void loop() {
		int w = 0;		
		while(w < 10) {
			count++;
			
			// user input
			userInput();
			
			// finding
			clear = finding();
			if(clear) break;
			
			System.out.println(strike + "스트라이크 " + ball + "볼입니다");
			
			w++;
		}
	}
	
	public void userInput() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			for (int i = 0; i < u_num.length; i++) {
				System.out.print((i + 1) +  "번째 수 = ");
				u_num[i] = sc.nextInt();
			}
			if(u_num[0] != u_num[1] 
					&& u_num[0] != u_num[2]
							&& u_num[1] != u_num[2]) {
				break;
			}
			System.out.println("중복된 숫자가 있습니다");
		}
	}
	
	public boolean finding() {
		strike = ball = 0;
		
		// ball
		for (int i = 0; i < r_num.length; i++) {
			for (int j = 0; j < r_num.length; j++) {
				if(r_num[i] == u_num[j] && i != j) {
					ball++;
				}
			}
		}		
		
		// strike
		for (int i = 0; i < r_num.length; i++) {
			if(r_num[i] == u_num[i]) {
				strike++;
			}
		}
		
		if(strike > 2) {
			return true;
		}		
		
		return false;
	}
	
	public void resultPrint() {
		if(clear) {
			System.out.println(count + " 회에 성공하셨습니다");
			System.out.println("Game Clear!!");
		}
		else {
			System.out.println("Game Over~");
		}
	}
	
	
}
