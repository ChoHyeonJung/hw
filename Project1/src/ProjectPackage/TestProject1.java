package ProjectPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


// 과 제
// 이름 : 조 현 중
// 제출일 : 2019.06.06
// 제출기한 : 2019.06.06
// 제출내용 : collection framework를 활용한 출력,추가,갱신,삭제 구현 
// hashmap,iterator를 활용하였으며, scanner를 사용 함.


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
			String str4;
			System.out.println("---------------------------------------");
			System.out.println("1. 고객정보 전체출력 2. 추가항목 3. 갱신사항 4. 삭제항목");
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
					if (mainList.get(i).containsKey("고유번호")) { //mainList에 i번째 키가 고유번호일 경우 true 
						if(mainList.get(i).values().contains(number2)) { // mainList에 i번째 값에 scanner 입력 값이 존재 할 경우
							System.out.println("추가할 키 입력 : ");
							str1 = scanner.next();
							System.out.println("추가할 값 입력 : ");
							str2 = scanner.next();
							
							mainList.get(i).put(str1, str2); // 해당하는 mainList의 map i번째에 key,value생성
							System.out.println("추 가 완 료");
						} else {
							System.out.println("입력하신 고유번호가 존재하지 않습니다.");
						}
					} 
				}														
			} else if (number1 == 3) {
				System.out.println("갱신항목 선택.");
				System.out.println("고유번호 입력 : ");
				number2 = scanner.next();
				for (int i = 0; i < mainList.size(); i++) {
					if (mainList.get(i).containsKey("고유번호")) { //mainList에 i번째 키가 고유번호일 경우 true 
						if(mainList.get(i).values().contains(number2)) { // mainList에 i번째 값에 scanner 입력 값이 존재 할 경우
							System.out.println("갱신할 키 입력 : ");
							str1 = scanner.next();
							System.out.println("새로 변경할 키 입력 : ");
							str2 = scanner.next();
							System.out.println("새로 변경할 값 입력 : ");
							str3 = scanner.next();
							mainList.get(i).remove(str1);	 // 키로 받아서 갱신 전 키,값 삭제					
							mainList.get(i).put(str2, str3); // 해당하는 mainList의 map i번째에 key,value생성
							System.out.println("갱 신 완 료");
						} else {
							System.out.println("입력하신 고유번호가 존재하지 않습니다.");
						}
					} 
				}
				
			} else if (number1 == 4) {
				System.out.println("삭제항목 선택.");
				System.out.println("고유번호 입력 : ");
				number2 = scanner.next();
					
				for (int i = 0; i < mainList.size(); i++) {
					if (mainList.get(i).keySet().contains("고유번호")) { //mainList에 i번째 키가 고유번호일 경우 true 
						if(mainList.get(i).values().contains(number2)) { // mainList에 i번째 값에 scanner 입력 값이 존재 할 경
							System.out.println("삭제할 키 입력 : ");
							str1 = scanner.next();
							
							mainList.get(i).remove(str1); // 키로 받아서 scanner와 일치한 키,값 삭제
							System.out.println("삭 제 완 료");
						} else {
							System.out.println("입력하신 고유번호가 존재하지 않습니다.");
						}
					} 
				}
			
			}

		
		}
	}
}
