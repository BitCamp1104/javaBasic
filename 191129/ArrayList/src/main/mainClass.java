package main;

import java.util.ArrayList;
import java.util.List;

public class mainClass {

	public static void main(String[] args) {
		/*
			List : 목록			
			관리를 유동적으로 할수 있는 배열
			
			목적: 데이터를 효율적으로 관리하기 위한 목록을 사용
			collection: 수집(데이터)
			
			List
			
			ArrayList(Vector) 
						배열처럼 사용할 수 있는 목록
						선형구조	0-0-0-0-0
						검색 속도가 빠르다	
						index number 로 관리된다. 0 ~ (n-1)
			LinkedList
						빈번하게 추가, 삭제의 작업이 필요한 경우 사용하기 적합
			
			Map	
			
			HashMap
						key and value 로 관리		"apple":"사과" pair
												"apple":"능금"
						xml -> Json key:value
						key 중복을 허용하지 않음
						tree 구조(검색 우수)
			TreeMap
						sorting

		*/
		
		ArrayList<Integer> arrlist = new ArrayList<>();
	//	List<Integer> list = new ArrayList<>();
		
		// 추가(뒤에)
		arrlist.add(111);
		
		Integer in = new Integer(222);
		arrlist.add(in);
		
		arrlist.add(new Integer(333));
		
		// list size
		int len = arrlist.size();
		System.out.println("list의 크기:" + len);
		
		// 산출
		Integer out = arrlist.get(0);	// arrliat[0]
		System.out.println(out);
		
		for (int i = 0; i < arrlist.size(); i++) {
			Integer var = arrlist.get(i);
			System.out.println("arrlist[" + i + "] = " + var);			
		}
		
		for (Integer i : arrlist) {
			System.out.println(i);
		}
		
		// 원하는 위치
		Integer num = new Integer(123);
		arrlist.add(1, num);
		
		for (int i = 0; i < arrlist.size(); i++) {
			Integer var = arrlist.get(i);
			System.out.println("arrlist[" + i + "] = " + var);			
		}
		
		// 삭제
		arrlist.remove(2);
		
		for (int i = 0; i < arrlist.size(); i++) {
			Integer var = arrlist.get(i);
			System.out.println("arrlist[" + i + "] = " + var);			
		}
		
		// 검색
		int findIndex = arrlist.indexOf(333);
		System.out.println("findIndex:" + findIndex);
		
		findIndex = -1;
		for (int i = 0; i < arrlist.size(); i++) {
			Integer var = arrlist.get(i);
			if(var == 123) {
				findIndex = i;
				break;
			}
		}
		System.out.println("findIndex:" + findIndex);
		
		// 수정
		Integer updateData = new Integer(555);
		arrlist.set(2, updateData);
		
		for (Integer i : arrlist) {
			System.out.println(i);
		}
		
		// String
		/*
		  야구팀, 
		 */
		
		ArrayList<String> strlist = new ArrayList<String>();
		
		ArrayList<MemberDto> memlist = new ArrayList<MemberDto>();
		
		// 추가
		// 뒤에
		MemberDto dto = new MemberDto(101, "홍길동");
		memlist.add(dto);				
		
		memlist.add(new MemberDto(102, "일지매"));
		
		memlist.add(new MemberDto(1011, "김영숙"));
		
		memlist.add(new MemberDto(1022, "김영숙"));
		
		dto = new MemberDto();
		dto.setNumber(103);
		dto.setName("정수동");
		memlist.add(dto);
		/*
		for (MemberDto mem : memlist) {
			System.out.println(mem.toString());
		}
		
		for (int i = 0; i < memlist.size(); i++) {
			MemberDto d = memlist.get(i);
			System.out.println(d.toString());
		}
		*/
		// 원하는 위치에
		dto = new MemberDto(1021, "성춘향");
		memlist.add(2, dto);
				
		// 삭제
		memlist.remove(1);
		
		for (int i = 0; i < memlist.size(); i++) {
			MemberDto d = memlist.get(i);
			System.out.println(d.toString());
		}
		
		// 검색
		String findname = "정수동";
		int indexNumber = -1;
		
		for (int i = 0; i < memlist.size(); i++) {
			MemberDto mem = memlist.get(i);
			if(mem.getName().equals(findname)) {
				indexNumber = i;
				break;
			}
		}
		
		System.out.println("찾은 데이터:" + memlist.get(indexNumber).toString());
		
		// 다수의 데이터
		// 갯수를 카운터	-> for
		// 배열 동적
		// 찾아서 데이터를 넣어준다	-> for
		ArrayList<MemberDto> findDataList = new ArrayList<MemberDto>();
		
		for (int i = 0; i < memlist.size(); i++) {
			MemberDto d = memlist.get(i);
			if(d.getName().equals("김영숙")) {
				findDataList.add(d);
			}
		}
		
		for (int i = 0; i < findDataList.size(); i++) {
			MemberDto d = findDataList.get(i);
			System.out.println("찾은데이터:" + d.toString());
		}
				
		// 수정
		MemberDto updateDto = new MemberDto(2022, "향단이"); 
		
		memlist.set(2, updateDto);
		
		for (MemberDto mem : memlist) {
			System.out.println(mem.toString());
		}
 	}

}




