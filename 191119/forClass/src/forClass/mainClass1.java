package forClass;

public class mainClass1 {

	public static void main(String[] args) {
		// 2중 for
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);	
			for (int j = 0; j < 5; j++) {
				System.out.println("\t j = " + j);	
			}
		}
		
		int w1, w2;
		
		w1 = w2 = 0;
		
		while(w1 < 5) {			
			System.out.println("w1 = " + w1);
			w2 = 0;
			while(w2 < 10) {
				System.out.println("\t w2 = " + w2);
				w2++;
			}					
			w1++;
		}
		
		

	}

}
