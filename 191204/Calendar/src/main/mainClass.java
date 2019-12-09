package main;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class mainClass {

	public static void main(String[] args) {
		
		// Calendar -> year month day
		// Date
		
		// 일정관리
	//	Calendar cal = new GregorianCalendar();
		
		Calendar cal = Calendar.getInstance();
		
		// 날짜
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;	// 0 ~ 11
		int day = cal.get(Calendar.DATE);
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		// setter
		cal.set(Calendar.YEAR, 2019);
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(Calendar.DATE, 25);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;	// 0 ~ 11
		day = cal.get(Calendar.DATE);
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.println(Calendar.DECEMBER);
		
		// 오전/오후
		String ampm = cal.get(Calendar.AM_PM)==0 ? "오전":"오후";
		System.out.println(ampm);
		
		/*
			JSP
				회원관리
				게시판
				일정관리
				자료실
			Spring
				투표만들기/하기
				web socket(chatting)
				유튜브관리		
		*/
		
		// 요일
		int weekday = cal.get(Calendar.DAY_OF_WEEK);	// 1 ~ 7(일 ~ 토)
		System.out.println("weekday:" + weekday);						
		
		switch(weekday) {
			case 4:
				System.out.println("오늘은 수요일입니다");	
				break;
		}
		
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 5 - 1);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		System.out.println(year + "년 " + month + "월 ");
		
		// 지정한 달의 마지막 날짜 28 29 30 31
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("lastday = " + lastday);
		
		
		
		// 연월일을 설정하고 달력의 빈칸을 구한다
		
		// 위의 빈칸
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 2 - 1);
		cal.set(Calendar.DATE, 1);
		
		weekday = cal.get(Calendar.DAY_OF_WEEK);	// 1 ~ 7
		int _day = (weekday - 1) % 7;
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		System.out.println(year + "년 " 
				+ month + "월의 위의 빈칸은 " + _day + "칸입니다");
		
		// 몇일까지 있는지
		lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastday + "일 까지입니다");
		
		cal.set(Calendar.DATE, lastday);
		
		weekday = cal.get(Calendar.DAY_OF_WEEK);
		
		// 밑의 빈칸 수
		int _lastday = 7 - weekday;
		System.out.println("밑의 빈칸은 " + _lastday + "칸입니다");
		
		
		// 달력 출력
		year = 2019;
		month = 11;
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, 1);
		
		int _startDay = cal.get(Calendar.DAY_OF_WEEK);
		int _lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int _date = 1;
		
		System.out.println(year + "년 " + month + "월");
		System.out.println("=================================================================");
		
		String week_day = "일월화수목금토";
		
		for (int i = 0; i < week_day.length(); i++) {
			char c = week_day.charAt(i);
			System.out.print(c + "\t");
		}
		System.out.println();
		
		System.out.println("=================================================================");
		
		// 윗쪽 빈칸
		for (int i = 1; i < _startDay; i++) {
			System.out.print("*" + "\t");
		}
		
		// 날짜
		for (int i = 0; i < _lastDay; i++) {
			System.out.print(_date + "\t");
			if((_date + _startDay - 1) % 7 == 0) {
				System.out.println();
			}
			_date++;
		}
		
		// 밑쪽의 빈칸					1			31		12월 -> 4칸
		for (int i = 0; i < (7 - (_startDay + _lastDay - 1) % 7); i++) {
			System.out.print("*" + "\t");
		}
		System.out.println();
		
		
	}

}











