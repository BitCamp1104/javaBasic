package bitClass;

public class mainClass {

	public static void main(String[] args) {
		/*
			bit : 0, 1
			
			&		AND
			|		OR
			^		XOR
			<<		left shift
			>>		right shift
			~		NOT
		*/
		
		int num;
		
		// AND
		
		num = 0xD3 & 0xF0;
		/*
			8421 8421
			1101 0011
			1111 0000
			
			1101 0000	D0	
		*/
		
		System.out.println("num = " + num);
		System.out.printf("0x%x", num);

		// OR
		num = 0xD3 | 0xF0;
		/*
			8421 8421
			1101 0011
			1111 0000
			
			1111 0011	F3
		*/
		System.out.println("num = " + num);
		System.out.printf("0x%x", num);
		
		// XOR
		num = 0xD3 ^ 0xF0;
		/*
			8421 8421
			1101 0011
			1111 0000
			
			0010 0011	23
		*/
		System.out.println("num = " + num);
		System.out.printf("0x%x", num);
		
		num = num ^ 0xF0;
		
		System.out.println("num = " + num);
		System.out.printf("0x%x", num);	
		
		// ~ 반전		0 -> 1 	1 -> 0
		/*
			0x55
			
			8421 8421
			0101 0101
			
			1010 1010	AA
		*/
		
		byte by;
		
		by = ~0x55;		
		System.out.println("by = " + by);
		System.out.printf("0x%x \n", by);	
		
		// left shift
		/*
			결과는 *2
			
			0001	-> 1
			0010	-> 2
			0100	-> 4		
			
		*/
		
		// right shift
		/*
			결과는 /2
		
			0100	-> 4
			0010	-> 2			
			0001	-> 1									
		*/
		
		int bit;
		
		bit = 0x1 << 2;		
		System.out.println("bit = " + bit);
		
		bit = bit >> 1;		
		System.out.println("bit = " + bit);
		
	}

}






