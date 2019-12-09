package work4;

import java.util.Scanner;

public class mainClass1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		
		String num1, num2;
		String oper = "";
		int result;
		
		// 두개의 수를 입력받고 계산 결과를 출력하라.
		// 문자 포함되었는지 조사.
		boolean stop = true;
		
		while(true) {
			stop = true;
			
			System.out.print("첫번째 수 = ");
			num1 = sc.next();	
			
			// 문자 포함되어 있는지 조사
			for(int i = 0;i < num1.length(); i++) {
				char c = num1.charAt(i);	// 1a2
				int asccode = (int)c;
				if(asccode < 48 || asccode > 57) {
					stop = false;
					break;
				}
			}
			
			if(stop == false) {
				System.out.println("숫자가 아닙니다. 다시 입력해 주십시오");
				continue;
			}
			break;
		}
		
		// (+, -, *, /) ->
		while(true) {
			System.out.print("연산자(+, -, *, /) = ");
			oper = sc.next();			
			if(oper.equals("+") || oper.equals("-") || 
					oper.equals("*") || oper.equals("/")) {
				break;
			}else {
				System.out.println("연산자를 잘 못 입력하셨습니다. 다시 입력하세요");
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}




