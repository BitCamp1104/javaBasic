
public class mainClass {

	public static void main(String[] args) {
		/*
			Array : 배열
					같은 자료형의 묶음
					
			목적: 같은 목적의 다수의 변수를 관리하기 위함.		

			자료형 배열명[] = new 자료형[배열의 갯수];	동적  
						   동적할당 	
			동적(allocation)/정적(static)
			정적
			
			자료형 []배열명 = new 자료형[배열의 갯수];
			자료형[] 배열명 = new 자료형[배열의 갯수];
			
				stack		Heap
			
			배열명[index number] = 값;			
		*/
		
		int arrNum[] = new int[3];	// 0 ~ (n - 1)
		
		arrNum[0] = 1;
		arrNum[1] = 2;
		arrNum[2] = 3;
		
		System.out.println(arrNum[2]);
		
		int arrNum1[] = {	11, 22, 33	};
		
		System.out.println(arrNum1[2]);
		
		int numArr[] = { 111, 222, 333 };
		int numAlias[] = numArr;
		
		numAlias[1] = 666;
		
		System.out.println("numArr[1] = " + numArr[1]);
		
		// swap
		char aaa[] = { 'a', 'b', 'c' };
		char bbb[] = { 'A', 'B', 'C' };
		
		char aaaAlias[] = aaa;
		char bbbAlias[] = bbb;
		/*
		char temp;
		for (int i = 0; i < aaa.length; i++) {
			temp = aaa[i];
			aaa[i] = bbb[i];
			bbb[i] = temp;
		}
		*/
		
		char tempArr[];
		
		tempArr = aaaAlias;
		aaaAlias = bbbAlias;
		bbbAlias = tempArr;
		
		for (int i = 0; i < bbbAlias.length; i++) {
			System.out.println("bbbAlias[" + i + "] = " + bbbAlias[i]);			
		}

		
		System.out.println("bbbAlias[" + (bbbAlias.length - 1) + "] = " + bbbAlias[(bbbAlias.length - 1)]);	
	}

}






