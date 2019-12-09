package work1;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
			성적 통계 프로그램
			
			몇명의 학생의 점수를 입력?
			
			String[5][4]			 
			1 { 홍길동, 90, 85, 100, } 
			
			이름, 국어, 영어, 수학
			
			각 학생의 총점	SUM
			전체 학생의 총점 AllSUM
			총점의 1등		MAX
			총점의 꼴지	MIN			
		*/
		
		Scanner sc = new Scanner(System.in);
		// student[학생수][이름 + 과목]
		String student[][] = null;
		int count;
		
		// 1.학생수 입력
		System.out.print("학생수:");
		count = sc.nextInt();
		
		// 2.동적할당 
		student = new String[count][4];
		
		// 3.이름, 성적입력 : 이름, 국어, 영어, 수학
		for (int i = 0; i < student.length; i++) {		
			System.out.print("이름:");
			String name = sc.next();
			
			System.out.print("국어:");
			String lang = sc.next();
			
			System.out.print("영어:");
			String eng = sc.next();
			
			System.out.print("수학:");
			String math = sc.next();
					
			student[i][0] = name;
			student[i][1] = lang;
			student[i][2] = eng;
			student[i][3] = math;		
		}		
		
		// 4.각 학생의 총점
		int sum[] = new int[student.length];
		for (int i = 0; i < student.length; i++) {
			for (int j = 1; j < student[0].length; j++) {
				// j = 1 국어부터 점수를 가산하기 위함
				sum[i] += Integer.parseInt(student[i][j]);
			}
		}
		
		// 5.전체 학생의 총점
		int allSum = 0;
		for (int i = 0; i < student.length; i++) {
			for (int j = 1; j < student[0].length; j++) {
				allSum += Integer.parseInt(student[i][j]);
			}
		}
		
		// 5-1.학생들의 총점의 평균점수
		double avg = 0.0;
		avg = (double)allSum / student.length;
				
		// 6.총점의 1등&꼴지	
		int max = sum[0];
		for (int i = 0; i < sum.length; i++) {
			if(sum[i] > max) {
				max = sum[i];
			}
		}
		
		int findIndex = -1;
		for (int i = 0; i < sum.length; i++) {
			if(max == sum[i]) {
				findIndex = i;
			}
		}
		
		// 각 학생의 총점 출력
		for (int i = 0; i < sum.length; i++) {
			System.out.println((i + 1) + "번째 학생의 총점:" + sum[i]);
		}
		// 전체 학생의 총점
		System.out.println("전체 학생의 총점:" + allSum);
		
		// 학생 총점의 평균점수
		System.out.println("학생들의 총점의 평균:" + avg);
		
		// 6.총점의 1등&꼴지		
		// 1등 
		for (int i = 0; i < student[0].length; i++) {
			System.out.println("학생들의 1등정보:" + student[findIndex][i]);
		}
		
		
		
		
		
		
		
		

	}

}
