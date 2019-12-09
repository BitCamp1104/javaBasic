package staticClass;

public class StaticClass {

	private int number;				// instance 변수
	public static int staticNumber;	// class 변수
	/*
			stack 	heap 	static 	sys
			local	new		정적 - 메모리에 상주
	*/
	public StaticClass() {
		
	}
	
	public void method() {
		staticNumber++;
	}
}


