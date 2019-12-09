package array2Class;

public class mainClass {

	public static void main(String[] args) {
		/*
			Array : 같은 자료형의 묶음 변수들
			관리 : index 0 ~ n-1
					다른 자료형의 묶음 class(Data Transfer Object, Value Object), structure(C)
			
			int arr[] = new int[5];
			int arr[] = { 1, 2, 3 };
			
			0-1-2-3-4-5
			단점 : 같은 자료형, 정적이다 
			
			2차원 배열
			int array[열][행];
			int [행]array[열];
			
			int **pp;
			int pp[][];
			
			int array[2][3] = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
			};
			
			array[1][2] -> 5
			*(*(pp + 1) + 2) 
		*/
		
		int Array2[][];		
		Array2 = new int[3][];
		
		int data1[] = new int[4];
		data1[0] = 1;
		data1[1] = 2;
		data1[2] = 3;
		data1[3] = 4;
		
		int data2[] = new int[5];
		data2[0] = 5;
		data2[1] = 6;
		data2[2] = 7;
		data2[3] = 8;
		data2[4] = 81;
		
		int data3[] = new int[4];
		data3[0] = 9;
		data3[1] = 10;
		data3[2] = 11;
		data3[3] = 12;
		
		Array2[0] = data1;
		Array2[1] = data2;
		Array2[2] = data3;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < Array2[i].length; j++) {
				System.out.print(Array2[i][j] + " ");
			}
			System.out.println();			
		}
		
		
		
		int Array21[][] = new int[2][3];
		
		Array21[0][0] = 10;
		Array21[0][1] = 11;
		Array21[0][2] = 12;
		
		Array21[1][0] = 20;
		Array21[1][1] = 21;
		Array21[1][2] = 22;
		
		for (int i = 0; i < Array21.length; i++) {	// 열의 길이
			for (int j = 0; j < Array21[0].length; j++) {
				System.out.print(Array21[i][j] + " ");
			}
			System.out.println();
		}
		
		
		int Array22[][] = {
				{  1,  2,  3,  4 },		// 0	0 ~ 3
				{ 11, 12, 13, 14 }, 	// 1	0 ~ 3
				{ 21, 22, 23, 24 }		// 2	0 ~ 3	
		};
		
		char star[][] = {
				{ ' ', ' ', '*', ' ', ' ' },
				{ ' ', '*', '*', '*', ' ' },
				{ '*', '*', '*', '*', '*' },
				{ ' ', '*', '*', '*', ' ' },
				{ ' ', ' ', '*', ' ', ' ' }
		};
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[0].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
	}

}







