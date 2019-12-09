
public class mainClass {

	public static void main(String[] args) {
		
		// 1.첫번째 방법
		/*
		int number[] = new int[10];	// 1 ~ 10
		
		// 초기화
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
		}
		
		// swap으로 셔플
		int temp;
		for (int i = 0; i < 1000; i++) {
			int a = (int)(Math.random() * 10);	// 0 ~ 9
			int b = (int)(Math.random() * 10);	// 0 ~ 9
			
			temp = number[a];
			number[a] = number[b];
			number[b] = temp;			
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		*/

		// 2.두번째 방법
		int number[] = new int[10];
		boolean _switch[] = new boolean[10];
		int w, r;
		
		for (int i = 0; i < _switch.length; i++) {
			_switch[i] = false;
		}
		
		w = 0;
		while(w < 10) {	// 0 ~ 9
			r = (int)(Math.random() * 10);	// 0 ~ 9
			if(_switch[r] == false) {
				_switch[r] = true;
				number[w] = r + 1;	// 1 ~ 10
				w++;
			}			
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		

	}

}





