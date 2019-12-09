package child;

import parent.ParentClass;

public class ChildClass extends ParentClass{

	private String name;
	
	public ChildClass() {
		System.out.println("ChildClass ChildClass()");
	}

	public ChildClass(String name, int num) {
		super();
		this.name = name;
		System.out.println("ChildClass ChildClass(String name)");
	}
	
	
}
