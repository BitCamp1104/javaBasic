
public class mainClass {

	public static void main(String[] args) {
		// TODO : 맨위
		/*
			operator : 연산자
			
			int a, b;
			a = 1;
			b = a;
			
			+ - * %
		*/
		
		int num1, num2;
		int result;
		
		num1 = 9;
		num2 = 2;
		
		// TODO : 연산+
		/*
		result = num1 + num2;		
		System.out.println(num1 + " + " + num2 +  " = " + result);
		
		result = num1 - num2;		
		System.out.println(num1 + " - " + num2 +  " = " + result);
		/**/
		
		// TODO : 연산*
		/*
		result = num1 * num2;		
		System.out.println(num1 + " * " + num2 +  " = " + result);
		
		result = num1 / num2;		// 몫 	
		System.out.println(num1 + " / " + num2 +  " = " + result);
		/**/
		
		// %
		// 나눈 나머지
		result = num1 % num2;		
		System.out.println(num1 + " % " + num2 +  " = " + result);		
		num1 = num1 + 1;
		num1 += 1;
		
		// 증가연산 increment, 증감연산 decrement
		num1++;
		++num1;
		System.out.println("num1 = " + num1);
		
		num1--;
		--num1;
		System.out.println("num1 = " + num1);
		
		// 주의점
		int a, b;
		a = 1;
		
	//	a++;
	//	b = a;
		
	//	b = a++;
	//	b = ++a;
		b = (a++);
		
		System.out.println("b = " + b);
		
		
		
		
	}

}






