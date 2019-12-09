package wrapperClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Wrapper class
		 	일반 자료형을 클래스화 해 놓은 것이다.
		 	
		 	일반 자료형		Wrapper class
		 	boolean			Boolean
		 	char			Character
		 	
		 	byte			Byte
		 	short			Short
		 	int				Integer		------------------
		 	long			Long
		 	
		 	float			Float
		 	double			Double		------------------
		 	
		 	char[]			String
		 		length			length()
								toString()
								valueOf()

			String str = "hello";
			System.out.println(str);
			System.out.println(str.toString());
			
			number -> String
			
			String.valueOf( ? ); // static	
			
			valueOf('a') -> "a"		a\0
			valueOf( 1 ) -> "1"
			valueOf(123.456) -> "123.456"
			float f = 12.34f;	
			str = f + ""; 
		*/
				
		Character ch1;
	//	ch1 = new Character('A');
		ch1 = 'B';
		System.out.println("ch1 = " + ch1);
		
		Character ch2 = new Character('B');
		
		String str = ch1.toString() + ch2.toString();
		System.out.println("str = " + str);
		
		if(ch1.equals(ch2)) {
			System.out.println("ch1과 ch2는 같은 문자입니다");
		}else {
			System.out.println("ch1과 ch2는 다른 문자입니다");
		}
		
		// Integer == int
		int i = 25;
		Integer iObj;
	//	iObj = new Integer( i );
		iObj = 36;
		
		// 숫자 -> 문자열		String.valueOf( i )
	//	String is = iObj.toString(); 
		String is = iObj + "";
		System.out.println("is = " + is);
		
		// 문자열 -> 숫자
		String str1 = "123";
		int num1 = Integer.parseInt(str1);
		System.out.println("num1 = " + num1);
		
		// 문자열 -> 실수
		String str2 = "234.5678";
		double d1 = Double.parseDouble(str2);
		System.out.println("d1 = " + d1);
		
		// 10진수 -> 2진수	
		// int     String 
		int number = 12;
		String num2str;
		num2str = Integer.toBinaryString(number);
		
		// 2진수 -> 10진수	
		number = Integer.parseInt(num2str, 2);
		
		// 10진수 -> 16진수	
		Integer.toHexString(number);
		
		// 16진수 -> 10진수
		Integer.parseInt(num2str, 16);
		
	}

}





