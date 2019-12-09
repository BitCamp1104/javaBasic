package staticClass;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class mainClass1 {

	public static void main(String[] args) {
		/*
		System.out.println("sn = " + StaticClass.staticNumber);
		
		StaticClass.staticNumber = 1;
		
		System.out.println("sn = " + StaticClass.staticNumber);
		
		StaticClass sc = new StaticClass();
		System.out.println("sc sn = " + sc.staticNumber);
		sc.method();
		
		StaticClass sc1 = new StaticClass();
		System.out.println("sc1 sn = " + sc1.staticNumber);
		*/
		
		/*
		StaticClass1 s = StaticClass1.getInstance();
		
		Calendar cal = new GregorianCalendar();
		Calendar cal1 = Calendar.getInstance();
		*/
		
		StaticClass1.staticMethod();
	}

}
