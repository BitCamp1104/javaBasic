package main;

import cls.MyClass;
import observer.ObserverA;
import observer.ObserverB;

public class mainClass {

	public static void main(String[] args) {
		/*
			Observer : 정찰 -> 감시
		*/
		MyClass cls = new MyClass();
		
		// 감시자 A, B를 추가
		cls.addObserver(new ObserverA());
		cls.addObserver(new ObserverB());
		
		cls.notifyObservers("password:abc123");
	}

}




