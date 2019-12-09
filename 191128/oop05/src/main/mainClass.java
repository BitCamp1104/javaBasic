package main;

import child.JaneClass;
import child.TomClass;
import parent.ParentClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		TomClass tc = new TomClass();
		JaneClass jc = new JaneClass();		
		tc.ParentMethod();
		jc.ParentMethod();
		
		// Over Ride 목적 : 하나의 instance형으로 관리를 용이하게 하기 위함 
		
		ParentClass p1 = new TomClass();
		p1.ParentMethod();
			
		((TomClass)p1).func();
		
		//TomClass t = (TomClass)p1;
		//t.func();
				
		ParentClass p2 = new JaneClass();
		p2.ParentMethod();
		*/		
		
		
		
		TomClass tomArr[] = new TomClass[5];
		JaneClass janeArr[] = new JaneClass[5];
		
		tomArr[0] = new TomClass();
		janeArr[0] = new JaneClass();
		janeArr[1] = new JaneClass();
		
		ParentClass parArr[] = new ParentClass[10];
		
		parArr[0] = new TomClass();
		parArr[1] = new JaneClass();
		parArr[2] = new JaneClass();
		
	}

}
