package main;

import child.MyClass;
import cls.Ballpen;
import cls.Pencil;
import inter.Interface;
import writer.WriteMode;

public class mainClass {

	public static void main(String[] args) {
		/*
		abstract class : method + abstract method
						 변수의 선언이 가능하다
						 class 다중상속이 불가능
		
		interface : abstract method만으로 이루어져 있다(선언)
					변수의 선언이 불가능하다
					다중 상속이 가능하다
		*/
		
		MyClass cls = new MyClass();		
		cls.method();
		cls.func();
		
		Interface inter = new MyClass();
		inter.method();
		inter.func();
		
		Interface in = new Interface() {			
			@Override
			public void method() {
				// TODO Auto-generated method stub				
			}			
			@Override
			public void func() {
				// TODO Auto-generated method stub				
			}
		};
		
		WriteMode wm = new Ballpen();
		wm.writer();
		if(wm instanceof Pencil) {
			((Pencil) wm).erase();
		}else {
			((Ballpen) wm).erase();
		}

	}

}
