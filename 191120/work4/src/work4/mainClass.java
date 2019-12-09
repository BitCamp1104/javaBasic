package work4;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		int aNumber[] = new int[10];
		int w;
		
		w = 0;
		// 1 ~ 100사이의 10개의 수를 입력 받고
		while(w < 10) {
			// 입력
			System.out.print((w + 1) + "번째 수 = ");
			int num = sc.nextInt();
			// 검사
			if(num < 1 || num > 100) {
				System.out.println("범위를 벗어 났습니다 다시 입력하세요");
				continue;
			}	
			// 배열 저장
			aNumber[w] = num;			
			w++;
		}
		// 확인		
		for (int i = 0; i < aNumber.length; i++) {
			System.out.print(aNumber[i] + " ");
		}
		System.out.println();
				
		// 최소 값과 최대 값을 출력하는 프로그램 작성.
		int max = aNumber[0];
		for (int i = 0; i < aNumber.length; i++) {
			if(max < aNumber[i]) {
				max = aNumber[i];
			}
		}
		System.out.println("최대값:" + max);
		*/
		
		
		// 2차원 배열을 1차원 배열에 대입하라. 3 * 4 -> [12]
		int array2[][] = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
		};
		
		int col = array2.length;	// column의 갯수
		int row = array2[0].length;	// row의 갯수
		int array1[] = new int[ col * row ];
		/*
		i * array2[0].length + j	i = 0  j = 0 ~ 3		   
		array1[0] = array2[0][0];
		array1[1] = array2[0][1];
		array1[2] = array2[0][2];
		array1[3] = array2[0][3];
				
		i * array2[0].length + j	i = 1  j = 0 ~ 3   	       
		array1[4] = array2[1][0];
		array1[5] = array2[1][1];
		array1[6] = array2[1][2];
		array1[7] = array2[1][3];
		*/
		
		for (int i = 0; i < array2.length; i++) {		// 0 1 2
			for (int j = 0; j < array2[0].length; j++) {	// 0 1 2 3
				array1[ i * array2[0].length + j ] = array2[i][j];
			}
		}
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println("array1[" + i + "] = " + array1[i]);
		}
		
		
		
		
		

	}

}



