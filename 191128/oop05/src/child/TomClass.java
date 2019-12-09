package child;

import parent.ParentClass;

public class TomClass extends ParentClass{

	public void ParentMethod() {	// Over Ride Method
		System.out.println("TomClass ParentMethod()");
	}
	
	public void func() {
		System.out.println("TomClass func()");
	}
}
