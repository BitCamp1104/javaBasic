
public class mainClass {

	public static void main(String[] args) {
		
		
		int temp;
		int arrNum[] = { 10, 1, 9, 2, 8,  3, 7, 4, 6, 5 };
		/*
						i=0
						  	 --------------------------
						  	i=1
						  	    -----------------------
						  	    2
						  	      --------------------- 		
		*/		
		for (int i = 0; i < arrNum.length - 1; i++) {	// 0 ~ 8
			for (int j = i + 1; j < arrNum.length; j++) {	// (i+1) ~ 9				
				// 올림
				if(arrNum[i] < arrNum[j]) {
					temp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = temp;					
				}
			}
		}
		
		for (int i = 0; i < arrNum.length; i++) {
			System.out.print(arrNum[i] + " ");
		}
		System.out.println();
		
	}

}




