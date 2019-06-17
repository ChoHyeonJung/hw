package projectPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// 과 제
// 이름 : 조 현 중
// 제출일 : 2019.06.18
// 제출기한 : 2019.06.06
// 제출내용 : collection framework를 활용한 출력,추가,갱신,삭제 구현 
// List,Map을 활용하였으며, scanner를 사용 함.



public class TestProject1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 							//scanner
		
		Map<String, String> map0 = new HashMap<String, String>();
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		Map<String, String> map3 = new HashMap<String, String>();
		Map<String, String> map4 = new HashMap<String, String>();
		
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
			String str4;
			String str5;
			System.out.println("------------------------------------------------------------------");
			System.out.println("1. 고객정보 전체출력 2. map 전체추가 3. 추가항목 4. 갱신사항 5. 삭제항목 6. 개별조회");
			System.out.println("---------------------------------------");
			System.out.println("번호를 선택하세요 : ");
			
			number1 = scanner.nextInt();
			
			if (number1 == 1) {		
				
				for (int i = 0; i < mainList.size(); i++) {
					System.out.println(mainList.get(i));
				}
				
				 
			} else if (number1 == 2) {
				System.out.println("맵 추가 선택.");
				System.out.println("거주지명 입력 : ");
				str1 = scanner.next();
				System.out.println("고유번호 입력 : ");
				str2 = scanner.next();
				System.out.println("이름 입력 : ");
				str3 = scanner.next();
				System.out.println("나이 입력 : ");
				str4 = scanner.next();
				System.out.println("근무지 입력 : ");
				str5 = scanner.next();
				
				map4.put("거주지명", str1);
				map4.put("고유번호", str2);
				map4.put("이름", str3);
				map4.put("나이", str4);
				map4.put("근무지", str5);
								
			    mainList.add(map4);
				
				
																		
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
