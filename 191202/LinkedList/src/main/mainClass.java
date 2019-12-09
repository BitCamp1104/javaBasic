package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class mainClass {

	public static void main(String[] args) {
		/*
			ArrayList : 검색		== Vector
			LinkedList : 추가, 삭제 (실시간)
		*/
		
		Vector<String> vec = new Vector<String>();
		vec.add("라이온즈");
		vec.size();
		
		LinkedList<String> list = new LinkedList<String>();
		
	//	List<String> list = new LinkedList<String>();
				
		if(list.isEmpty()) {
			System.out.println("데이터가 하나도 없습니다");		
		}
		
		list.add("Tigers");
		list.add("Giants");
		list.add(1, "Lions");
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s.toString());
		}
		
		// 맨 처음 요소에 추가
		list.addFirst("Bears");
		
		// 맨 끝 요소에 추가
		list.addLast("Twins");
		
		for (String string : list) {
			System.out.println(string);			
		}
		
		// iterator : 반복자 == 포인터(주소)
		Iterator<String> it;	// String s;  

		it = list.iterator();
		
		while(it.hasNext()) {
			String string = it.next();
			System.out.println("it:" + string);
		}
		
		ArrayList<String> arrlist = new ArrayList<String>( list );
		
		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}
		
	}

}






