package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class mainClass {

	public static void main(String[] args) {
		/*
			HashMap : 사전
						사과:apple
						key:value -> 1쌍(pair)						
						Web -> Json						
						tree 구조
						중복 키 값을 사용할 수 없다.	multi map
				 0
			   0   0
			  0 0 0 0		
			  			TreeMap = HashMap + sorting
			  					  sorting -> key	
		*/
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
	//	Map<Integer, String> hMap = new HashMap<Integer, String>();
		
		// 추가
		hMap.put(111, "백십일");
		hMap.put(222, "이백이십이");
		hMap.put(333, "삼백삼십삼");
		
		// value 취득
		String value = hMap.get(222);
		System.out.println("value = " + value);
		
		// 검색
		// 있다없다
		boolean b = hMap.containsKey(new Integer(333));
		System.out.println("b = " + b);
		
		// 값을 취득
		if(hMap.containsKey(333)) {
			value = hMap.get(333);
			System.out.println("value = " + value);
		}
		
		// 삭제
		String val = hMap.remove(222);
		System.out.println(val + " 값이 삭제되었습니다");
		
		// 수정
	//	hMap.put(111, "100 + 10 + 1");
		
		hMap.replace(111, new String("1 + 10 + 100"));
	
		value = hMap.get(111);
		System.out.println("value = " + value);
		
		// key 값을 모두 취득
		// iterator
		Iterator<Integer> it = hMap.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();	// key
			System.out.println("key:" + key);
			
			String _val = hMap.get(key);
			System.out.println("value:" + _val);
		}
		
		
		
		HashMap<String, String> sMap = new HashMap<String, String>();
		
		// 추가
		sMap.put("apple", "사과");
		sMap.put("pear", "배");
		sMap.put("grape", "포도");
		sMap.put("banana", "바나나");
		
		// 취득
		String _value = sMap.get("grape");
		System.out.println("_value = " + _value);
		
		// 모두 출력
		Iterator<String> sKey = sMap.keySet().iterator();
		while (sKey.hasNext()) {
			String key = sKey.next();			
			String sval = sMap.get(key); 
			System.out.println("key:" + key + " value:" + sval);
		}
		
		// 정렬 숫자, 문자 -> key
		// TreeMap <--> HashMap
		TreeMap<String, String> treeMap 
			= new TreeMap<String, String>(sMap);
		
		// 오름
	//	Iterator<String> itkey = treeMap.keySet().iterator();
		
		// 내림
		Iterator<String> itkey = treeMap.descendingKeySet().iterator();
		
		while(itkey.hasNext()) {
			String key = itkey.next();
			
			System.out.println("key:" + key 
							+ " value:" + treeMap.get(key));
		}
		
		int count = 1;
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Tigers");
		list.add("Lions");
		list.add("Giants");
		
		HashMap<Integer, String> mymap = new HashMap<Integer, String>();
		
		for (int i = 0; i < list.size(); i++) {
			mymap.put(count, list.get(i));
			count++;
		}
		
		HashMap<Integer, MyData> dataMap = new HashMap<Integer, MyData>();
		
		// 추가
		
		// 삭제
		
		// 검색
		
		// 수정
		
		// 정렬
		
		
	}

}





