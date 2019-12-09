package dao;

import java.util.Scanner;

import dto.Human;
import single.Singleton;

public class SelectClass implements DaoInterface{

	public SelectClass() {
		
	}
	
	public void process() {
		Scanner sc = new Scanner(System.in);
		Singleton s = Singleton.getInstance();
		
		System.out.println("검색하고 싶은 선수명을 입력해 주십시오.");
		System.out.print(">> ");
		String name = sc.next();
		
		Human h = null;
		h = s.map.get(name);
		
		if(h == null || h.getName().equals("")) {
			System.out.println("데이터를 찾을 수 없습니다");
			return;
		}
		
		System.out.println("검색된 선수입니다.");
		h.infomation();
	}
}
