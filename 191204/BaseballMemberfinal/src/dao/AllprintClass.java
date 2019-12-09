package dao;

import java.util.Iterator;

import dto.Human;
import single.Singleton;

public class AllprintClass implements DaoInterface{

	public AllprintClass() {
	}
	
	public void process() {
		Singleton s = Singleton.getInstance();		
		Iterator<String> it = s.map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			Human h = s.map.get(key);
			System.out.println(h.toString());
		}
	}
}
