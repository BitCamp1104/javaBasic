import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class mainClass {

	public static void main(String[] args) {
		
		// Exception
		
		// NullPointerException
		String str = null;
		
		try {
			System.out.println(str.length());
		}catch (NullPointerException e) {
			System.out.println("str이 할당 되지 않았습니다");
		}
		
		// ArrayIndexOutOfBoundsException
		int arr[] = { 2, 4, 6 };
		
		try {
			System.out.println(arr[3]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index 범위 초과");
		}
		
		// FileNotFoundException
		File file = new File("c:\\xxx.txt");
		
		FileInputStream is;
		
		try {
			is = new FileInputStream(file);
		}catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		}
		
		// NumberFormatException
		int num;
		
		try {
			num = Integer.parseInt("123.456");
		}catch (NumberFormatException e) {
			System.out.println("형식이 다릅니다");
		}
				
		// StringIndexOutOfBoundsException
		String str1 = "abc";
		
		try {
			str1.charAt(3);
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index 범위 초과");
		}
		

	}	

}
