package work5;

public class mainClass {

	public static void main(String[] args) {
		/*
		  	fibonnaci
		  	
		  	c = a + b
			0 1 1 2 3 5 8 13 21 34
			a b c 
			  a b c
			    a b c	
		*/
		long a, b;	// 대입변수
		long c;		// 결과
		long pArr[] = new long[30];
		
		a = 0;
		b = 1;
		
		pArr[0] = a;
		pArr[1] = b;
		
		int w = 0;		
		while(w < 28) {
			c = a + b;			
			pArr[w + 2] = c;
			
			a = b;
			b = c;
		
			w++;
		}
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.print(pArr[i] + " ");
		}
		System.out.println();
		
	}

}





