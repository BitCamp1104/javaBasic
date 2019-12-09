
public class mainClass {
	public static void main(String[] args) {
		MyClass cls = new MyClass();
		
		cls.method();
		cls.method();
		
		MyClass cls1 = new MyClass();
		
		cls1.method();
		cls1.method();
		
		// 상수
		final int NUMBER = 3;	// define, const
	//	NUMBER = 5;
		int num;
		
		num = NUMBER;
		
		Object mcls = new YouClass();
		
		MyClass my = (MyClass)mcls;
		YouClass yo = (YouClass)my;
		
		
		YouClass ycl = new YouClass();		
	//	MyClass my = (MyClass)ycl;		// 불가능
		
	}
}

// 상속금지
/* final */ class MyClass{
	private int number;	// member 변수
	public static int stNumber;	// static 변수
	
	public final void method() {
		int num = 0;	// local 변수
		num++;
		this.number++; 
		MyClass.stNumber++;
		
		System.out.println("num = " + num);
		System.out.println("number = " + number);
		System.out.println("stNumber = " + stNumber);
	}	
}

class YouClass extends MyClass{
	
	/*
	 * public void method() { }
	 */
}








