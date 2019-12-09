package stringClass;

import javax.print.DocFlavor.STRING;

public class mainClass {

	public static void main(String[] args) {
		/*
			String : 문자열저장, 편집, 정보
				== Array char[]
		*/
		
		String str;	// String == class -> 설계
					// str == Object(객체), instance(주체)
					// Wrapper class
		
		// str = new String();
		// stack	heap
		str = "hello";		
		char cArr[] = { 'h', 'e', 'l', 'l', 'o' };
		
		String str1 = new String(cArr);
		System.out.println("str1 = " + str1);
		
		String str2 = new String("world");
		System.out.println("str2 = " + str2);
		
		// operator	+
		
		String str3 = str1 + str2;		
		String str4 = str2 + " Java";
		
		// 비교함수
		// equals
		String str5 = null, str6 = new String(cArr);

		str5 = "hello";
	//	str6 = "worl";		
	//	str6 = str6 + "d";
		
		boolean b = str5.equals(str6);
		if(b) {
			System.out.println("같은 문자열입니다");
		}else {
			System.out.println("다른 문자열입니다");
		}
		
		// indexOf
		// 특정 문자가 몇번째 있는지 위치를 수치로 리턴하는 함수
		// 앞에서 조사
		
		String str7 = "abcdabcd";
		int n = str7.indexOf("c");
		System.out.println("n = " + n);
		
		// lastIndexOf
		// 뒤에서부터
		n = str7.lastIndexOf("c");
		System.out.println("n = " + n);
		
		// length()
		// 문자열의 길이
		int len = str7.length();
		System.out.println("len = " + len);
		
		// replace(수정)
		String str8 = "A*B*C*D";
		String repStr = str8.replace("*", " ");
		System.out.println("repStr=" + repStr);
		
		str8 = "신라면·불닭부터 꼬북칩, 메로나까지..美 마트 점령한 K푸드";
		repStr = str8.replace("신라면", "삼양라면");
		System.out.println("repStr=" + repStr);
		
		// split
		// 문자열 자른다.
		
		/*
			name:홍길동
			age:24
			birth:17/12/13
			address:서울시
			
			홍길동-24-17/12/13-서울시	- token
		*/
		
		String str9 = "홍길동-24-17/12/13-서울시";					  
		String splits[] = str9.split("-");
		
		for (int i = 0; i < splits.length; i++) {
			System.out.println("splits[" + i + "] = " + splits[i]);
		}
		
		// substring -> substr
		// 원하는 부분의 문자열만을 산출
		// substring("시작위치의 index 0~", "지정위치의 전까지") abcde	( 1, 4 )
		
		String subStr = str9.substring(4, 6);	// 24
		System.out.println("subStr = " + subStr);
		
		subStr = str9.substring(7);	// 7부터 끝까지
		System.out.println("subStr = " + subStr);
		
		str9 = "abcDEF";
		
		// toUpperCase
		String upStr = str9.toUpperCase();
		System.out.println("upStr:" + upStr);
		
		// toLowerCase
		String lowStr = str9.toLowerCase();
		System.out.println("lowStr:" + lowStr);
		
		// trim
		// 공백을 없애주는 함수(앞, 뒤)
		String str10 = "      java  java    java     ";
		String trimStr = str10.trim();
		System.out.println("trimStr:" + trimStr);
		
		// valueOf
		// 숫자 -> 문자열
		//    123 -> "123"
		//    123.4567 -> "123.4567"
		
		int num = 123;
		long lo = 12345L;
		double d = 123.4567;
		
		String iStr = String.valueOf(num);
		String lStr = String.valueOf(lo);
		String dStr = String.valueOf(d);
		
		System.out.println(iStr);
		System.out.println(lStr);
		System.out.println(dStr);
		
		String _str = num + "";
		System.out.println(_str);
		
		// contains
		// 탐색		
		// 알고리즘: 정렬, 셔플, 트리, 탐색
		String str11 = "서울시 강남구";
		String findstr = "강남";
		
		boolean b1 = str11.contains(findstr);
		if (b1) {
			System.out.println("검색한 문자열이 있습니다");
		}
		
		// charAt
		// String을 배열과 같이 사용할 수 있는 함수
		char ch = str11.charAt(0);
		System.out.println("ch = " + ch);
		
		// concat
		String str12 = "안녕하세요";
		String str13 = "반갑습니다";
		
		String conStr = str12.concat(str13);
		System.out.println(conStr);
		
		String ss = str12 + str13;
		
	}

}





