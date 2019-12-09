package whileClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		  	while 		loop
			do while
			
			선언, 초기화
			while(조건식){
				처리				
				연산식
			}
			
			선언, 초기화
			do{
				처리				
				연산식
			}while(조건식);

		*/
		
		int w;
		
		w = 0;
		while(w < 10) {			
			System.out.println("w = " + w);			
			w++;
		}
		
		w = 0;
		do {
			System.out.println("do w = " + w);	
			w++;
		}while(w < 10);
		
		
		
		/*
			initialize(초기화)
				동적할당
		
			loop(순환)
			while(true){
			
				 조건 break;
			}
			
			release(해방)
				메모리 해제
		
		*/
		
		
		
	}

}




