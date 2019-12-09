package main;

import java.util.Scanner;

import dao.AllprintClass;
import dao.DaoInterface;
import dao.DeleteClass;
import dao.InsertClass;
import dao.SelectClass;
import dao.UpdateClass;
import file.DataClass;

public class mainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DataClass dataCls = new DataClass("baseball");
		dataCls.readFile();
		
		while(true) {			
			DaoInterface dao = null;
			
			int choice = 0;
			System.out.println(">>>>>>>>>>> menu");
			System.out.println("1.선수등록");
			System.out.println("2.선수삭제");
			System.out.println("3.선수검색");
			System.out.println("4.선수수정");
			System.out.println("5.선수들 출력");
			System.out.println("6.파일 저장");
			
			System.out.print("메뉴번호 = ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					dao = new InsertClass();
					break;
				case 2:
					dao = new DeleteClass();
					break;
				case 3:
					dao = new SelectClass();
					break;
				case 4:
					dao = new UpdateClass();
					break;
				case 5:
					dao = new AllprintClass();
					break;
				case 6:
					dataCls.writeFile();
					break;
			}
			
			if(dao != null) {
				dao.process();
			}
			
		}

	}

}




