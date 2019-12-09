package main;

import acls.MyClass;
import bcls.YouClass;
import ccls.HeClass;
import single.Singleton;

public class mainClass {

	public static void main(String[] args) {
		/*
			Singleton pattern 
			단 1개의 instance만을 이용해서 접근하는 패턴
		*/
		
		MyClass mcls = new MyClass();
		YouClass ycls = new YouClass();
		HeClass hcls = new HeClass();
		
	//	int n = mcls.getMyNum();
	//	ycls.setYouNum(n);
		
		ycls.method();
		
		mcls.MyMethod();
	}

}






