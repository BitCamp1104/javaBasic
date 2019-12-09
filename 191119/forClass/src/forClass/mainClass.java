package forClass;

public class mainClass {

	public static void main(String[] args) {
		
		/*
			조건문 : loop == 순환문
			
			for( 변수선언 및 초기화(1) ; 조건식(2)(5)(8) ; 연산식(4)(7)  ){				
				처리(3)(6)			
			}				
			(9)
			
			for( 변수선언 : 배열 or 목록 ){
				변수접근(값)
			}
		*/		
		int i;		
		for(i = 0;i < 10; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("i = " + i);
		
		for(i = 0;i < 10; i = i + 2) {
			System.out.println("i = " + i);
		}
		
		for(i = 1;i <= 100; i++) {
			System.out.println("i = " + i);
		}
		
		int num = 1;
		for(i = 0;i < 100; i++) {
			System.out.println("num = " + num);
			num++;
		}
		
		for(i = 10;i > 0; i--) {
			System.out.println("i = " + i);
		}
		
		for(int j = 0;j < 10; j++) {
			System.out.println("j = " + j);
		}
		
		int array[] = { 11, 22, 33 };
		
		for (int j : array) {
			System.out.println("j = " + j);
		}
		
		char cArr[] = { 'A', 'B', 'C' };
		
		for (char c : cArr) {
			System.out.println("c = " + c);
		}
		
		for(int a = 0, b = 0; a < 10; a++, b += 2) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
		
	//	for(int a = 0; ; a++) {
	//		System.out.println("a = " + a);
	//	}
		
		// 1 ~ 100 사이에 있는 숫자 중 짝수들의 합과 홀수들의 합을 구하라.
		int sum1 = 0;
		int sum2 = 0;
		for (int j = 1; j <= 100; j++) {
			if(j % 2 == 0) {
				sum2 = sum2 + j;
			}else {
				sum1 = sum1 + j;
			}
		}
		System.out.println("짝수의 합:" + sum2);
		System.out.println("홀수의 합:" + sum1);
		
		
		// 문자열의 'A'문자를 찾아서 'a'로 변경하라
		char ch[] = { 'D', 'W', 'A', 'V', 'Q', 'A' };		
		for (int j = 0; j < ch.length; j++) {
			if(ch[j] == 'A') {
				ch[j] = 'a';				
			}
		}
		for (int j = 0; j < ch.length; j++) {
			System.out.println("ch[" + j + "] = " + ch[j]);
		}
		
		int n = 0;
		for (char c : ch) {
			if(c == 'A') {
				ch[n] = 'a';
			}
			n++;
		}		
			
		// ch 문자열을 전부 소문자로 변경하라.	ASCII A:65  
		for (int j = 0; j < ch.length; j++) {
			char c = ch[j];	
			int anum = (int)c;
			if(anum < 97) {
				ch[j] = (char)(anum + 32);
			}			
		}
		
		for (int j = 0; j < ch.length; j++) {
			System.out.println("ch[" + j + "] = " + ch[j]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}






