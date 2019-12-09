package main;

import absractClass.AbstractClass;
import child.MyClass;
import child.YouClass;

public class mainClass {

	public static void main(String[] args) {
		/*
			abstract : 추상 	class
			
			class : method의 내용이 모두 설정되어 있는 것
					method가 정의만 되어 있는 요소(추상 method)
					
			추상 method를 한개이상 포함하고 있는 것.
			추상 class만은 생성이 불가능하다.
			추상 class를 상속한 후에 자식 class에서 정의후에 생성이 가능하다.
			instance로 설정은 가능. 		
		*/
		
	//	AbstractClass ac = new AbstractClass();
		
		MyClass cls = new MyClass();
		cls.abstractMethod();
		cls.method();
		
		AbstractClass myCls = new MyClass();
		myCls.abstractMethod();
		cls.method();
		
		AbstractClass aCls = new AbstractClass() {			
			@Override
			public void abstractMethod() {
				System.out.println("abstractMethod() 상속안하고 정의");				
			}
		};
		aCls.abstractMethod();
		aCls.method();
		
		AbstractClass mCls = new MyClass();		
		AbstractClass nCls = new YouClass();
		

	}

}



