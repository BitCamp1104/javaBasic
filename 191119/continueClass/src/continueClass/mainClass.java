package continueClass;

public class mainClass {

	public static void main(String[] args) {
		/*
			continue : 생략 (skip)
		 	
		  	loop문과 같이 사용
		  	
		  	while(){
		  		처리1
		  		처리2
		  		처리3
		  		if(){
		  			continue
		  		}
		  		처리4		<- 처리 하지 않음
		  		break;
		  	}		  
		 */
		
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("i = " + i);
			System.out.println("loop start");
			
			if(i > 4) {
				continue;
			}
			
			System.out.println("loop end");			
		}
		
		int w = 0;
		while(w < 10) {
			System.out.println("w = " + w);
			System.out.println("while start");
			
			if(w > 4) continue;
			
			System.out.println("while end");
			w++;
		}
		
		

	}

}






