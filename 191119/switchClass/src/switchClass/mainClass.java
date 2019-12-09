package switchClass;

public class mainClass {

	public static void main(String[] args) {
		
		/*
			switch : 값이 명확해야 한다.	==
				범위를 설정할 수가 없다 > < >= <= !=
				부정한 값은 사용할 수 없다.
				
			switch( 변수 ){			
				case 값1:
					처리1
					break;
				case 값2:
					처리2
					break;					
			 	default:	== else 생략이 가능
			 		처리3
			}		
		*/
		
		int number = 30;
		
		switch (number) {			
			case 10:	// number == 10
				System.out.println("number는 10입니다");
				break;	
			case 20:
				System.out.println("number는 20입니다");
				break;
			default:
				System.out.println("number는 10과 20이 아닙니다");
		}
		
		String str = "안녕";		
		switch(str) {
			case "안녕":
				System.out.println("str == 안녕");	
				break;
		}
		
		char c = 'a';		
		switch( c ) {
			case 'a':
				System.out.println("c == a");
				break;
		}
		
		double d = 1.23;
		
	//	switch( d ) {
	//		case 12.3:
	//	}
		
		switch( number ) {
	//		case number > 10:
			case -1: 
		}
		
		
		
		

	}

}




