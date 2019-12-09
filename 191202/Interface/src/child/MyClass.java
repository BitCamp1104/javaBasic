package child;

import inter.Interface;

public class MyClass implements Interface{

	@Override
	public void method() {
		System.out.println("MyClass method()");
	}

	@Override
	public void func() {
		System.out.println("MyClass func()");
	}
	
}
