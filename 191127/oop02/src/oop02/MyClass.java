package oop02;

import java.util.Scanner;

public class MyClass {

	private int number;
	private String name;
	private double height;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("number = ");
		number = sc.nextInt();
		
		System.out.print("name = ");
		name = sc.next();
		
		System.out.print("height = ");
		height = sc.nextDouble();
	}
	
	public String getName() {				// getter
		return name;
	}		
	
	public void setName(String newName) {	// setter
		name = newName;
	}
	
	public void printing() {
		System.out.println("number:" + number + " name:" + name + " height:" + height);
	}
}
