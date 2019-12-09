package constructor;

public class mainClass {

	public static void main(String[] args) {
		/*
			constructor : 생성자							
						    함수(메소드)
						  class명과 같은 method
						  return 값이 없다
						  Over loading이 가능
						    자동호출(class 생성시)
						    별도의 호출이 불가능하다(1회)
						    생략이 가능하다.
						    초기 값 설정 많이 사용       
						   	
			destructor : 소멸자 (c++)
						    자동 호출
						  java에는 없음  	
			this 참조

		*/
		
		MyClass cls = new MyClass();
		cls.setNumber(135.67f);
				
		MyClass cls1 = new MyClass(12);
		
		MyClass cls2 = new MyClass(12.3f);
		
		float f = cls2.getNumber();
		System.out.println("f = " + f);
		
		
		Student stu = new Student();
		
		System.out.println(stu);
		System.out.println(stu.getThis());
	}

}





