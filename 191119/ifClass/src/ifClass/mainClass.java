package ifClass;

public class mainClass {

	public static void main(String[] args) {
		/*
			제어문
			
			조건문
				if
				else 
				
				if
				else if
				
				if 
				else if
				else
				
				switch
					break
				
			순환문
			
				for
				
				foreach
				
				while
			
				do while
				
					break
					
					continue
		*/
		
		/*
			논리연산자(true/false)			
			&& 	AND
			||	OR
			!	NOT
			
			부등호, 등호
			> < >= <= == != !
			
			if( true/false ){
				처리1
				처리2
			}
			
			if( true/false )
				처리1
				
			if( 조건 ){
				처리1
			}else{
				처리2
			}	
			
			if( 조건1 ){
				처리1
			}else if( 조건2 ){
				처리2
			}else if( 조건3 ){
				처리3
			}else{
				
			}			
		*/
		
		int number = 5;
		
		if(number > 0) {
			System.out.println("number는 0보다 큽니다");
		}		
		if(number < 10) {
			System.out.println("number는 10보다 작습니다");
		}
		
		if(number >= 5) {
			System.out.println("number는 5보다 크거나 같습니다");
		}
		if(number == 5) {
			System.out.println("number는 5입니다");
		}
		if(number != 10) {
			System.out.println("number는 10이 아닙니다");
		}
		
		if(number > 0 && number < 10) {
			System.out.println("number는 0보다 크고 10보다 작습니다");
		}
		
		if(number < 0 || number > 10) {
			System.out.println("number는 0보다 작거나 10보다 큽니다");
		}
		
		// if( number >= 0 && number <= 10 ) {
		if( !(number < 0 || number > 10) ) {
			System.out.println("number는 0보다 크고 10보다 작습니다");
		}
		
		if(number > 5) {
			System.out.println("number는 5보다 큽니다");
		}else {
			System.out.println("number는 5이거나 5보다 작습니다");
		}
		
		number = 85;
				
		if(number == 100) {
			System.out.println("A++입니다");
		}
		else if(number >= 90) {
			System.out.println("A+입니다");
		}
		else if(number >= 80) {
			System.out.println("B입니다");
		}
		else if(number >= 70) {
			System.out.println("C입니다");
		}
		else {
			System.out.println("C 이하입니다");
		}
		
		// 입력한 숫자가 홀수/짝수인지?
		int _number = 34;
		
		if( (_number % 2) == 0 ) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		
		// 3항 연산자
		String str;		
		str = (_number > 50)?"50보다 크다":"50보다 작다"; 
		
		boolean b = true;
		
		if(b == true) {
			System.out.println("b = true");
		}
		
		if(b) {
			System.out.println("b = true");
		}
		
		b = false;

		if(b == false) {
			System.out.println("b = false");
		}
		
		if(!b) {
			System.out.println("b = false");
		}
		
		// 조건문 안에 조건문
		number = 95;
		
		if(number == 100) {
			// A+
		}
		else if(number < 100 && number >= 90) {
			// A+
			if(number >= 95) {
				System.out.println("A+입니다");
			}			
			// A
			else {
				
			}
		}
		
		String str1 = "hello";
		String str2 = "hell";
		
		str2 = str2 + "o";
		
		if(str1 == str2) {
			System.out.println("같은 문자열입니다");
		}
		
		if(str1.equals(str2)) {
			System.out.println("equals 같은 문자열입니다");
		}
		
		
	}

}



