package file03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class mainClass {

	public static void main(String[] args)throws Exception {

		// 파일쓰기
		File file = new File("d:\\tmp\\newfile.txt");
		
		// 쓰기(한문자)
		/*
		FileWriter fw = new FileWriter(file);
		fw.write("하이하이" + "\n");
		fw.close();
		*/
		// 추가 쓰기
		/*
		FileWriter fappend = new FileWriter(file, true);
		fappend.write("건강하세요" + "\n");
		fappend.close();
		*/
		
		// 문장으로 기입하기
		
		if(checkBeforeWriteFile(file)) {
			
			FileWriter fWriter = new FileWriter(file);	// 파일포인터 설정
			BufferedWriter bw = new BufferedWriter(fWriter); // 문장으로
			PrintWriter pw = new PrintWriter(bw);
			
			pw.print("안녕하세요" + "\n");
			pw.println("하이");
			pw.println("건강하세요");
			
			pw.close();
		}
		else {
			System.out.println("파일이 없거나 쓰기를 할 수 없습니다");
		}
				
	}
	
	static boolean checkBeforeWriteFile(File f) {
		if(f.exists()) {
			if(f.isFile() && f.canWrite()) {
				return true;
			}
		}
		return false;
	}
	

}





