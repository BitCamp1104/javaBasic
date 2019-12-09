package child;

import sup.SuperClass;

// java 다중상속 불가
public class ChildClass extends SuperClass{

	public ChildClass() {
	}
	
	public void Child_func() {
		System.out.println("ChildClass Child_func()");
		
	//	pri_name = "";
		pub_name = "";
		pro_name = "";
		
	}
	
	// Over Ride : 상속받은 함수를 재기입
	public void Super_method() {
		super.Super_method();
		System.out.println("ChildClass Super_method()");		
	}
}
