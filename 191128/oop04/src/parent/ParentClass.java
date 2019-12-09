package parent;

public class ParentClass {

	private int number;
	
	public ParentClass() {
		number = 0;
		System.out.println("ParentClass ParentClass()");
	}

	public ParentClass(int number) {		
		this.number = number;
		System.out.println("ParentClass ParentClass(int number)");
	}
	
	
}
