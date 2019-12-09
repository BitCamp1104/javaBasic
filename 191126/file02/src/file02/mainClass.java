package file02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class mainClass {

	public static void main(String[] args)throws Exception  {
		// file read
		
		File file = new File("d:\\tmp\\newfile.txt");
		
		FileReader fr = new FileReader(file);
		
		// 한문자씩 읽어 들인다.
		/*
		int c = fr.read();
		while(c != -1) {	// -1 == 파일끝
			System.out.println((char)c);
			c = fr.read();
		}
		*/
		
		/*
		int c;
		while((c = fr.read()) != -1) {	// -1 == 파일끝
			System.out.print((char)c);			
		}
		*/
		// Buffer == 저장공간
		BufferedReader br = new BufferedReader(fr);
		/*
		String str = br.readLine();
		while(str != null) {
			System.out.println( str );
			str = br.readLine();
		}
		br.close();
		*/
		
		String str;
		while((str = br.readLine()) != null) {
			System.out.println( str );
		}
		br.close();
		
	}

}





