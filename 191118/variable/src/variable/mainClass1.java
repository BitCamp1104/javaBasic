package variable;

import java.util.Scanner;

public class mainClass1 {

	public static void main(String[] args) {
		// input  instance == class variable
		Scanner scan = new Scanner(System.in);
		
		// boolean
		/*
		boolean b;		
		System.out.print("true/false = ");
		b = scan.nextBoolean();
		
		System.out.println("b = " + b);
		*/
		
		/*
		// integer
		int number;
		System.out.print("정수 = ");
		number = scan.nextInt();
		System.out.println("number = " + number);
		System.out.printf("number = %d", number);	// format
		*/
		
		/*
		// double == 소수 
		double d;
		System.out.print("실수 = ");
		d = scan.nextDouble();
		System.out.println("d = " + d);
		*/
		
		/*
		// String == 문자열
		String str;
		System.out.print("str = ");
		str = scan.next();
		System.out.println("str = " + str);
		*/
		
		
		System.out.print("num = ");
		int num = scan.nextInt();
		
		System.out.print("str = ");
		String str = scan.nextLine();
		
		System.out.println("num = " + num);
		System.out.println("str = " + str);
		
	}

}



