package work4;

public class mainClass {

	public static void main(String[] args) {
		
		String src = "abc012";
		String secCode = "";
				
		secCode = security(src);
		
		System.out.println("원본:" + src);
		System.out.println("암호화:" + secCode);
		
		String oriCode = "";
		
		oriCode = deciphering(secCode);
		System.out.println("복호화된 코드:" + oriCode);
		
	}
	
	/*
		함수명: security
		parameter: String
		return: String
		내용: 일반 문자와 숫자를 암호화하여 돌려주는 함수
	*/
	static String security(String src) {
		
		char abcCode[] = {	// a ~ z
				'`', '~', '!', '@', '#',	// a b c d e 
				'$', '%', '^', '&', '*',
				'(', ')', '-', '_', '+', 
				'=', '|', '[', ']', '{', 
				'}', ';', ':', ',', '.', '/'
		};
		
		char numCode[] = {	// 0 ~ 9 
				'q', 'w', 'e', 'r', 't', 
				'y', 'u', 'i', 'o', 'p' 
		};
		
		String resultCode = "";
		
		for (int i = 0; i < src.length(); i++) {
			
			char ch = src.charAt(i);
			int n = (int)ch;
			
			// 알파벳의 경우
			if(n >= 97 && n <= 122) {
				n = n - 97;	// a -> 0
				resultCode = resultCode + abcCode[n];
			}		
			// 숫자의 경우
			//if(n >= 48 && n <= 57) {		
			else {
				n = n - 48;
				resultCode = resultCode + numCode[n];
			}
		
		}
		
		return resultCode;
	}
	
	static String deciphering(String src) {
		
		char abcCode[] = {	// a ~ z
				'`', '~', '!', '@', '#', 
				'$', '%', '^', '&', '*',
				'(', ')', '-', '_', '+', 
				'=', '|', '[', ']', '{', 
				'}', ';', ':', ',', '.', '/'
		};
		
		char numCode[] = {	// 0 ~ 9 
				'q', 'w', 'e', 'r', 't', 
				'y', 'u', 'i', 'o', 'p' 
		};
		
		String oriStr = "";
		
		for (int j = 0; j < src.length(); j++) {	
		
			char c = src.charAt(j);
			int n = (int)c;
			
			int index = 0;
			if(n >= 97 && n <= 122) {	// 숫자
				for (int i = 0; i < numCode.length; i++) {
					if(c == numCode[i]) {
						index = i;	// 0 ~ 9
						break;
					}
				}
				index = index + 48;
				oriStr = oriStr + (char)index;
				
			}else {						// 알파벳
				
				for (int i = 0; i < abcCode.length; i++) {
					if(c == abcCode[i]) {
						index = i;
						break;
					}
				}
				index = index + 97;
				oriStr = oriStr + (char)index;			
			}		
		}
		
		return oriStr;		
	}
	

}





