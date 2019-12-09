package overload;

public class mainClass {

	public static void main(String[] args) {
		/*
			Over Load : 함수(메소드)명은 같고
						인자, 인수(매개변수)의 자료형이나
						인수의 갯수가 다른 함수를 의미한다.(동명2인)
						
			image draw function
			
			RGB, RGBA(투명도)
			
			imageDraw(int x, int y);
			imageDraw(int x, int y, int a);
			
			Over Ride -> 상속성, 다형성
		*/
		
		func();
		
		func('A');
		
		func(123);
		
		func('B', 234);
		
		func(345, 'C');
	}
	
	static void func() {
		System.out.println("func() 호출");
	}
	
	static void func(char c) {
		System.out.println("func(char c) 호출");
	}
	
	static void func(int i) {
		System.out.println("func(int i) 호출");
	}
	
	static void func(char c, int i) {
		System.out.println("func(char c, int i) 호출");
	}
	
	static void func(int i, char c) {
		System.out.println("func(int i, char c) 호출");
	}
	/*
	static int func(int i, char c) {
		System.out.println("func(int i, char c) 호출");
		return 1;
	}
	*/
	/*
	static void func(int j, char ch) {
		System.out.println("func(int i, char c) 호출");
	}
	*/
	
	

}



