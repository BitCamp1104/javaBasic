package work3;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 선언부
		int count;
		int ArrayNum[];	// (0)	ArrayNum	ArrayNum[] 		
		int sum;
		double avg;
		
		// 초기화
		count = 0;
		ArrayNum = null;
		sum = 0;
		avg = 0.0;		
		
		/////////////////////////// 입력
		// 합계를 산출할 갯수 
		System.out.print("합계와 평균을 산출할 갯수 :");
		count = sc.nextInt();
				
		// 동적할당
		ArrayNum = new int[count];		
		
		// 갯수에 따라서 입력	
		for (int i = 0; i < ArrayNum.length; i++) {
			System.out.print( (i + 1) + "번째 수 =");
			ArrayNum[i] = sc.nextInt();
		}		
		///////////////////////////
		
		/////////////////////////// 처리
		// 합계
		for (int i = 0; i < ArrayNum.length; i++) {
			sum = sum + ArrayNum[i];
		}		
		// 평균
		avg = (double)sum / ArrayNum.length;
		
		///////////////////////////
		
		/////////////////////////// 결과
		// 결과 출력
		System.out.println("합계:" + sum);
		System.out.println("평균:" + avg);
		

	}

}




