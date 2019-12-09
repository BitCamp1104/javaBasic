package work2;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		// 선언
		int number;
		
		// 수를 입력
		System.out.print("수를 입력 = ");
		number = sc.nextInt();
		
		// 판단
		String msg = (number > 0) ? "양수입니다":"음수입니다";		
		System.out.println("입력하신 수는 " + msg);
		*/
		
		
		/*
		// 랜덤 수를 취득하라.
		int r;
		
		// 범위: 0 ~ 99 개수: 1개
		r = (int)(Math.random() * 100);
		System.out.println("r = " + r);

		// 범위: 11, 12, 13, 14, 15 개수: 1개
		r = (int)(Math.random() * 5) + 11;
		// 0 ~ 4
				
		// 범위: 1 ~ 45 개수: 6개
		int rnum[] = new int[6];		
		for(int i = 0;i < rnum.length; i++) {
			rnum[i] = (int)(Math.random() * 45) + 1;
		}		
		for (int i : rnum) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 1, 5, 7, 8, 10
		
		int arrNum[] = { 1, 5, 7, 8, 10 };
		
		r = (int)(Math.random() * 5);	// 0 ~ 4
		System.out.println( arrNum[r] );
		*/
		
		/*
		column(열)	- 항목
		
		*****	row(행)	- Data
		*****
		*****
		*****
		*****
		*****
		*****
		*****
		*****		
		
		*/
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*		
		
		*
		**
		***
		****
		*****
		****
		***
		**
		*		
		
		*/
		System.out.println();
		System.out.println();
		
		int len = 0;		
		for (int i = 0; i < 9; i++) {
			
			if(i < 5) len++;
			else	  len--;
			
			for (int j = 0; j < len; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*		
		
		**	
		*
		****
		***
		*****			
		
		*/
		
		int arr[] = { 2, 1, 4, 3, 5 };
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 1 ~ 1000 사이에 수를 전부 합친 값을 출력하라.
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum = sum + i;			
		}
		
		sum = 0;
		int num = 0;		
		for (int i = 0; i < 1000; i++) {
			num++;
			sum = sum + num;
		}
		
		/*
		하나의 수를 입력 받고 1 ~ 100사이의 어느 범위에 있는지 
		출력되는 프로그램을 작성하라.
		*/
		
		int _num = 0;
		
		if(_num > 0 && _num <= 10) {			
		}
		else if(_num > 10 && _num <= 20) {			
		}
		else if(_num > 20 && _num <= 30) {			
		}
		
		System.out.print("숫자 입력 = ");
		int inputNum = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			_num = 10 * i;	// 0 ~ 90
			
			if(inputNum > _num && inputNum <= _num + 10) {
				System.out.println(inputNum + "는 " + _num + "와 "
						+ (_num + 10) + "의 범위 안에 있습니다");
			}
		}
		
		
		// 구구단을 1단부터 9단까지 출력하는 프로그램을 작성하라.
		for (int i = 1; i < 10; i++) {			
			for (int j = 1; j < 10; j++) {				
				System.out.print( i + " * " + j + " = " + (i * j) + " ");				
			}
			System.out.println();			
		}
		
		int n = 9;
		for (int j = 1; j < 10; j++) {				
			System.out.print( n + " * " + j + " = " + (n * j) + " ");				
		}
		
		
		
		
		
	}

}








