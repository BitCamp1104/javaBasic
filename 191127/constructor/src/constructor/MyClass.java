package constructor;

public class MyClass {
	
	private float number;

	public MyClass() {		// 기본 생성자
		number = 1.23f;
		System.out.println("MyClass MyClass()");
	}
	public MyClass(int n) {
		System.out.println("MyClass MyClass(int n)");
	}
	public MyClass(int n, char c) {
		System.out.println("MyClass MyClass(int n, char c)");
	}
	
	public MyClass(float _number) {
		number = _number;
	}
	
	public void setNumber(float _number) {
		number = _number;
	}
	
	public float getNumber() {
		return number;		
	}
	
}
