package breakClass;

public class mainClass {

	public static void main(String[] args) {
		/*
			break == 탈출(loop)	-> return
			
			switch, for, while, do while
			
			for(int i = 0;i < 100; i++){
				if(str[i].equals("홍길동")){
					break;
				}
			}
		
		*/
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			if(i == 4) {
				break;
			}
		}
		
		char cArr[] = { 'A', 'B', 'C', 'D', 'E' };
		
		for (int i = 0; i < cArr.length; i++) {
			System.out.println(i + " : " + cArr[i]);
			
			if(cArr[i] == 'D') {
				System.out.println("\'D\' 문자를 찾았습니다");
				break;
			}			
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			
			for (int j = 0; j < 5; j++) {
				System.out.println("\t j = " + j);
				if(i == 4 && j == 3) {
					break;					
				}
			}
		}
		
		// 1.탈출방법
		boolean b = false;
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			
			for (int j = 0; j < 5; j++) {
				System.out.println("\t j = " + j);
				if(i == 4 && j == 3) {
					b = true;				
				}
				if(b == true) {
					break;
				}
			}
			if(b == true) {
				break;
			}
		}
		
		// 2.탈출방법
		outside:for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			
			for (int j = 0; j < 5; j++) {
				System.out.println("\t j = " + j);
				if(i == 4 && j == 3) {
					break outside;					
				}
			}
		}
			

	}

}





