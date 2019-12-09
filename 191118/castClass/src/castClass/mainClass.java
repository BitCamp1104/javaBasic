package castClass;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		  		우선순위
			boolean 	1 byte
			
			byte		1 byte	-128 ~ 127		낮음		1111 1111
			short		2 byte							1111 1111 1111 1111
			int 		4 byte
			long		8 byte
			
			float		4 byte
			double		8 byte				높음

			char		2 byte
			String		? 
			
			자료형 변환(자동, 강제)
		*/
		
		// 자동
		short sh = 123;		// 2 byte
		int i;				// 4 byte
		
		i = sh;	// 자동 형 변환
		System.out.println("i = " + i);
		
		i = 2345;
		
		sh = (short)i;	// 강제(cast) 형 변환
		System.out.println("sh = " + sh);
		
		
		long l = 12312313131L;
		float f = l;
		System.out.println("f = " + f);
		
		double d = l;
		System.out.println("d = " + d);		
		// 1.23123128E10	E *10 	10 == 10승	
		
		int number;
		double dNumber = 123000.456;
		
		number = (int)dNumber;
		System.out.println("number = " + number);
		
		int num1, num2;
		double result;
		
		num1 = 5;
		num2 = 2;
		
		result = (double)num1 / num2;
		System.out.println("result = " + result);
		
		
		// 1.2345e3
		double f1 = 1.2345e3;	// * 10 * 10 * 10
		System.out.println("f1 = " + f1);
		
		f1 = 123.4567e-2;	// * 0.1 * 0.1 
		System.out.println("f1 = " + f1);
	}

}





