package dao;

import java.util.Scanner;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import single.Singleton;

public class InsertClass implements DaoInterface{

	private int MemNumber;
	
	public InsertClass() {
		MemNumber = 1000;
		
		Singleton s = Singleton.getInstance();
		System.out.println("s.map.size() = " + s.map.size());
		if(s.map.size() > 0) {
			MemNumber = s.MemNumber;
			System.out.println("MemNumber = " + MemNumber);
		}
	}
	
	public void process() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">> 선수등록");
		System.out.println("투수(1)/타자(2) 등록하고 싶은 포지션을 입력해 주십시오.");
		System.out.print(">>>>> ");
		int choice = sc.nextInt();
		
		Human human = null;
		// human
		System.out.print("이름:");
		String name = sc.next();
		
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.print("신장:");
		double height = sc.nextDouble();
		
		if(choice == 1) {			// pitcher
			System.out.print("승:");
			int win = sc.nextInt();
			
			System.out.print("패:");
			int lose = sc.nextInt();
			
			System.out.print("방어율:");
			double defence = sc.nextDouble();
			
			human = new Pitcher(MemNumber, name, age, height, 
								win, lose, defence);			
		}
		else {						// batter
			System.out.print("타수:");
			int batcount = sc.nextInt();
			
			System.out.print("안타수:");
			int hit = sc.nextInt();
			
			System.out.print("타율:");
			double hitAvg = sc.nextDouble();
			
			human = new Batter(MemNumber + 1000, name, age, height, 
					batcount, hit, hitAvg);
		}
		
		Singleton s = Singleton.getInstance();	
		s.map.put(human.getName(), human);
		
		MemNumber++;
	}
}
