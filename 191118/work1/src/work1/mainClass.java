package work1;

public class mainClass {

	public static void main(String[] args) {
		// 편의점
		/*
		  	입력
			지불금액 : 3230원
			money : 10000원
			
			거스름돈: 
				5000원 -> ?장
				1000원 -> ?장
				500원 -> ?개
				100원 -> ?개
				50원 -> ?개
				10원 -> ?개
				
			결과 : ?????원 		
		*/
		
		// 변수 선언
		int price;			// 지불금액
		int myMoney;		// 계산금액
		int changeMoney;	// 거스름돈
		
		int m5000;
		int m1000;
		int m500;
		int m100;
		int m50;
		int m10;
		
		// 입력
		price = 2310;
		myMoney = 10000;
				
		// 연산처리
		changeMoney = myMoney - price;
				
		m5000 = changeMoney / 5000;
		m1000 = (changeMoney % 5000) / 1000;
		m500 = (changeMoney % 1000) / 500;
		m100 = (changeMoney % 500) / 100;
		m50 = (changeMoney % 100) / 50;
		m10 = (changeMoney % 50) / 10; 
		
		// 결과
		System.out.println("거스름돈:" + changeMoney);
		System.out.println("5000원권:" + m5000 + "장");
		System.out.println("1000원권:" + m1000 + "장");
		System.out.println("500원권:" + m500 + "개");
		System.out.println("100원권:" + m100 + "개");
		System.out.println("50원권:" + m50 + "개");
		System.out.println("10원권:" + m10 + "개");
		
		
		// swap == 교환	-> sorting(정렬)	1 9 3 8 4 6	-> 1 3 4 6 8 9
		// a, b
		// a = 1, b = 2; -> b = 1 a = 2;
		int a, b;
		int temp;	// 저장공간 == buffer
		a = 11;
		b = 22;
		
		temp = a;
		a = b;
		b = temp;
		
		
		
		

	}

}



