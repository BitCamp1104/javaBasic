package staticClass;

public class StaticClass1 {

	public static int num;
	
	public StaticClass1() {
		System.out.println("StaticClass1 StaticClass1()");
	}
	
	public void func() {
		System.out.println("StaticClass1 func()");
	}
	public void method() {	
		
		System.out.println("StaticClass1 method()");
	}
	
	public static StaticClass1 getInstance() {
		StaticClass1 sc = new StaticClass1();
		sc.method();
		sc.func();
		return sc;
	}
	
	public static void staticMethod() {
		num = 12;
		System.out.println("staticMethod() 호출");		
	}
	
}
