package oop01;

public class mainClass {

	public static void main(String[] args) {
		/*
			Object Oriented Programming
				Aspect(관점) Oriented Programming
				
			처리 중심.
			설계 중요. 
			
			!= 절차지향 -> 순차적 처리 (속도)
				
			1.은닉성(캡슐화)
			2.상속성
			3.다형성
			
			class 설계
			
			class 클래스 명
			{
				-- 변수부
				접근지정자 변수자료형 변수명;	member 변수
				
				-- 메소드부
				접근지정자 자료형 메소드명(매개변수){
					
				}
			}
			
			변수(객체)를 선언후에 동적할당을 해야 접근가능.
			
			class 변수 -> object(객체), instance(주체)
									  실제 메모리 영역 올라가는 변수 	
		
			클래스 명 인스턴트 = new 클래스 명();
			
			인스턴트	-> 실제영역
			stack		heap
		*/
		
		MyClass cls;	// cls == instance
		
		cls = new MyClass();	// heap   cls:stack
		
		cls.c = 'A';
		cls.x = 12;
		cls.func();
		cls.method(33);
		
		// TV (안방, 홀, 내방)
		String name[] = new String[3];
		int channel[] = new int[3];
		boolean power[] = new boolean[3]; 
		
		TVclass tv1, tv2, tv3;		
		tv1 = new TVclass();
		tv2 = new TVclass();
		tv3 = new TVclass();
		
		tv1.setName("LG");
		tv2.setName("Samsung");
		tv3.setName("Daewoo");
		
		tv1.setPower(true);
		tv2.setPower(false);
		tv3.setPower(true);
		
	}

}

class MyClass{
	// 변수부(멤버)
	int x, y;
	char c;
	String str;
		
	// 메소드부
	void func() {
		x = 0;
		System.out.println("MyClass func()");
	}
	void method(int i) {
		str = "hello";
		x = i;
		System.out.println("MyClass method(int i)");
		System.out.println("x = " + x);
	}	
}

class TVclass{
	
	String name;
	int channel;
	boolean power;
		
	void setName(String newName) {
		name = newName;
	}
	String getName() {
		return name;
	}
	
	void setChannel(int newChannel) {
		channel = newChannel;
	}
	int getChannel() {
		return channel;
	}
	
	void setPower(boolean pow) {
		power = pow;
	}
	boolean getPower() {
		return power;
	}
	
	
	
	
	
}




















