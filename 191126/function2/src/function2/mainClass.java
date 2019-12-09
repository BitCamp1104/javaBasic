package function2;

public class mainClass {

	public static void main(String[] args) {
		/*
			가변인수 	
		*/	
		allocParameter(2, 3, 4);
		
		allocParameter(1, 2, 3, 4, 5, 6, 7);
		
		alloc_Parameter("hello", 1, 2, 3);
	}
	
	static void allocParameter(int...ab) {
		int sum = 0;
		for (int i = 0; i < ab.length; i++) {
			sum = sum + ab[i];
		}		
		System.out.println("합계:" + sum);
	}
							// getter
	static void alloc_Parameter(String str, int...ab) {
		int sum = 0;
		for (int i = 0; i < ab.length; i++) {
			sum = sum + ab[i];
		}		
		System.out.println("합계:" + sum);
	}
	

}





