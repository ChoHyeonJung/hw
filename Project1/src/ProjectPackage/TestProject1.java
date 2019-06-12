package ProjectPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


// 과 제
// 이름 : 조 현 중
// 제출일 : 2019.06.13
// 제출기한 : 2019.06.06
// 제출내용 : collection framework를 활용한 출력,추가,갱신,삭제 구현 
// List,Map을 활용하였으며, scanner를 사용 함.

// for문을 사용하여 직접적인 map의 키 값을 가지고 scanner의 입력 값과 일치한지 조건식을 내서 출력확인을 하였으나,
// for문을 도는 중에 각 맵을 0번째 부터 일일이 거쳐가는 과정에서 특정 고유번호를 소유한 맵을 제외한 
// 나머지 맵은 else조건으로 고유번호가 존재하지 않는다고 작성하면 고유번호가 일치한 1개의 맵을 제외하고 나머지 맵에 출력이 모두 되어
// 오류를 찾지 못하였습니다.

public class TestProject1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 							//scanner
		
		Map<String, String> map0 = new HashMap<String, String>();
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		Map<String, String> map3 = new HashMap<String, String>();
		
		List<Map<String, String>> mainList = new ArrayList<Map<String,String>>();
		
		map0.put("고유번호","1234");
		map0.put("이름", "cho");
		map0.put("나이", "28");
		map0.put("거주지", "성남");
		map0.put("근무지", "판교");
		
		mainList.add(map0);
		
		
		map1.put("고유번호","2345");
		map1.put("이름", "qwe");
		map1.put("나이", "27");
		map1.put("거주지", "안양");
		map1.put("근무지", "인천");

		mainList.add(map1);
		
		
		map2.put("고유번호","3456");
		map2.put("이름", "zxc");
		map2.put("나이", "28");
		map2.put("거주지", "파주");
		map2.put("근무지", "강남");
		
		mainList.add(map2);

		
		map3.put("고유번호","4567");
		map3.put("이름", "asd");
		map3.put("나이", "28");
		map3.put("거주지", "강원");
		map3.put("근무지", "양재");
		
		mainList.add(map3);
		
		
		
		while(true) {
			int number1;
			String number2;
			String str1;
			String str2;
			String str3;
			System.out.println("---------------------------------------");
			System.out.println("1. 고객정보 전체출력 2. 추가항목 3. 갱신사항 4. 삭제항목 5. 개별조회");
			System.out.println("---------------------------------------");
			System.out.println("번호를 선택하세요 : ");
			
			number1 = scanner.nextInt();
			
			if (number1 == 1) {
				System.out.println("고객정보 전체출력.");
				for (int i = 0; i < mainList.size(); i++) {
					System.out.println(mainList.get(i));
				}
			} else if (number1 == 2) {
				System.out.println("추가항목 선택.");
				System.out.println("고유번호 입력 : ");
				number2 = scanner.next();
				
				for (int i = 0; i < mainList.size(); i++) {
					
						if (mainList.get(i).get("고유번호").equals(number2)) { // list에 i번째 map에 object key를 받는 get함수의 고유번호가 scanner 입력값과 일치 할 경우
							System.out.println("추가 키 입력 : ");
							str1 = scanner.next();
							System.out.println("추가 값 입력 : ");
							str2 = scanner.next();
							
							
							mainList.get(i).put(str1, str2); // 해당하는 mainList의 map i번째에 key,value생성
							System.out.println("추 가 완 료");
						
					} 
					
				}
			
																		
			} else if (number1 == 3) {
				System.out.println("갱신항목 선택.");
				System.out.println("고유번호 입력 : ");
				number2 = scanner.next();
				for (int i = 0; i < mainList.size(); i++) {
					if (mainList.get(i).get("고유번호").equals(number2)) { // list에 i번째 map에 object key를 받는 get함수의 고유번호가 scanner 입력값과 일치 할 경우
						System.out.println("갱신 전 키 입력 : ");
						str1 = scanner.next();
						System.out.println("갱신 키 입력 : ");
						str2 = scanner.next();
						System.out.println("갱신 값 입력 : ");
						str3 = scanner.next();
						
						mainList.get(i).remove(str1);
						mainList.get(i).put(str2, str3); // 해당하는 mainList의 map i번째에 key,value생성
						System.out.println("갱 신 완 료");
						
					} 
				}
				
			} else if (number1 == 4) {
				System.out.println("삭제항목 선택.");
				System.out.println("고유번호 입력 : ");
				number2 = scanner.next();
					
				for (int i = 0; i < mainList.size(); i++) {
					if (mainList.get(i).get("고유번호").equals(number2)) { // list에 i번째 map에 object key를 받는 get함수의 고유번호가 scanner 입력값과 일치 할 경우
						System.out.println("삭제할 키 입력 : ");
						str1 = scanner.next();
											
						mainList.get(i).remove(str1);
						System.out.println("갱 신 완 료");
						
					}
				}
			
			} else if (number1 == 5) {
				System.out.println("개별조회.");
				System.out.println("고유번호 입력 : ");
				number2 = scanner.next();
				
				for (int i = 0; i < mainList.size(); i++) {
					if (mainList.get(i).get("고유번호").equals(number2)) { // list에 i번째 map에 object key를 받는 get함수의 고유번호가 scanner 입력값과 일치 할 경우
						
						System.out.println(mainList.get(i));
						
					} 
				}
				
			}

		
		}
				
		
			
	}
}
