package acls;

import single.Singleton;

public class MyClass {

	private int myNum;
	private String myName;

	public MyClass() {
		myNum = 333;
		
		Singleton single = Singleton.getInstance();
		single.num = myNum;
	}
	/*
	public int getMyNum() {
		return myNum;
	}
	*/
	
	public void MyMethod() {

		Singleton si = Singleton.getInstance();		
		myName = si.name;
		
		System.out.println("myName = " + myName);
	}
	
	
	
}



