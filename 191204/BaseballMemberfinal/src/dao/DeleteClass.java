package dao;

import java.util.Scanner;

import dto.Human;
import single.Singleton;

public class DeleteClass implements DaoInterface{

	public DeleteClass() {
	}
	
	public void process() {
		Scanner sc = new Scanner(System.in);
		Singleton s = Singleton.getInstance();
		
		System.out.println("방출하고 싶은 선수명을 입력해 주십시오.");
		System.out.print(">> ");
		String name = sc.next();
		
		Human h = null;
		h = s.map.get(name);
		
		if(h == null || h.getName().equals("")) {
			System.out.println("데이터를 찾을 수 없습니다");
			return;
		}
		
		h = s.map.remove(name);
		System.out.println(h.getName() + "선수의 데이터가 삭제되었습니다");
	}
}
