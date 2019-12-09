package variable;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		  	1. 소스 코드		  	
		  	2. compile(문자코드 -> 기계어(2진수)) - lib파일(*.jar)		  
		    3. build == .exe 실행파일		
			4. 실행
		*/
		
		/*
			정수(==상수)
			
			2진수		0, 1					1100 1010
			8진수		0 ~ 7 -> 010 -> 8		8421 8421
			10진수	0 ~ 9
			16진수 	0 ~ 9 A ~ F(15)			C    A
			
			변수: 특정 이름을 정하고 값을 원하는 경우 변경할 수 있는 수
				name   value				 
			 	AAA <- 24
			 	AAA -> 24
			 	AAA <- 12					 
			
			바로 알아볼 수 있도록 변수 명을 지정한다.	
		*/
		
		int i;
		// 변수자료형 변수;
		
		int aa;
		int num;
		int _num;
		int num_;
		int n;
		
		int studentNumber;
		int stuNum;
		int stu_num;
		
		// int == 예약어 
		// int int;
		// int num;
		// int -num;
		// int 12num;
		// int 123;
		
		/*
			변수의 자료형
			숫자형
				정수
				byte	1 byte	==> 8 bit -> 256개 -128 ~ 127
				short 	2 byte	short int	
				int		4 byte
				long	8 byte	long int
				
				실수
				float	4 byte
				double	8 byte
			
			문자형
				문자
				char	2 byte	character (C언어 -> 1 byte)		한글(2byte)
				
				문자열	
				char arrChar[] = new char[10]; -> String
				String -> class		wrapper class 

			true/false
				boolean 1 byte	true(1)/false(0)				
				boolean -> bool(1) true/false,  BOOL(4) TRUE/FALSE	0 ~ 1100
		*/
		
		int number;			// 4 byte 영역
		// 자료형 : integer
		// 변수명 : number
		number = 123;	// 대입 연산자
		System.out.println(number);
		number = 234;
		System.out.println(number);
		
		byte by;
		by = 123;
		
		byte by1 = -128;
		
		float f;
		f = 123.43456789f;		
		System.out.println("f = " + f);
		
		double d;
		d = 1.45353543553535;
		System.out.println("d = " + d);
		
		char c;
		
		c = '한';
		c = 'a';	// ASCII (아스키 코드)
		System.out.println("c = " + c);		
		System.out.printf("c = %c %d", c, (int)c);
		
		// 문자열	String
		// String != 자료형이 아니다 == class
		// Wrapper class == 자료형을 class로 만들어 놓은 것
		String str;
		str = "안녕하세요";
		str = "반갑습니다";
		
		char cStr[] = new char[5];
		cStr[0] = '안';
		cStr[1] = '녕';
		cStr[2] = '하';
		
		char cStr1[] = {'안', '녕', '하', '세', '요'};
		
		boolean b;
		b = true;
		b = false;
		
		// escape sequence
		// \n
		// \t
		// \b
		// \"
		// \'
		// \\
		System.out.println("\\ hello \n Java \t world \\");
		
	}
}





