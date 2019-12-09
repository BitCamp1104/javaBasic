package randomNumber;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
		  	
			random -> 1개	1 ~ 100
			
			------------------------------- loop 기회는 10번
			75
			입력 >> 50
			message:너무 작습니다
			입력 >> 70
			message:너무 작습니다
			입력 >> 90
			message:너무 큽니다
			-------------------------------
			결과
		*/
		Scanner sc = new Scanner(System.in);
		
		// 1.선언부
		int r_num, u_num;	
		boolean clear;
		int w;
		
		while(true) {
			// 초기화
			clear = false;
			w = 0;
			
			//	2.Random 산출 (1 ~ 100) 
			r_num = (int)(Math.random() * 100) + 1;
			System.out.println("r_num = " + r_num);
			
			///////////////////////////////// loop		
			while(w < 10) {
				//	3.User 입력
				System.out.print("user number = ");
				u_num = sc.nextInt();
				
				//	4.판정
				int findnum = 0;
				if(u_num > r_num) 		findnum = 1;
				else if(u_num < r_num) 	findnum = 2;
				else					findnum = 3;
				
				// message
				switch( findnum ) {
					case 1:
						System.out.println("too big");
						break;
					case 2:
						System.out.println("too small");
						break;
					case 3:
						System.out.println("bingo!!");
						clear = true;
						break;
				}
				
				if(clear == true) {
					break;
				}			
				w++;
			}
			
			//	5.결과 	
			if(clear) {
				System.out.println("game clear!!");
			}else {
				System.out.println("game over~");
			}
	
			// replay?
			String msg = "";
			System.out.print("replay OK(y/n) = ");
			msg = sc.next();
			
			if(msg.charAt(0) != 'y' && msg.charAt(0) != 'Y') {
				System.out.println("good bye");
				break;
			}
			System.out.println("restart game");		
		}
		
	}

}



