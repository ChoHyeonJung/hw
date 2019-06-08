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
					
					if(map0.containsValue(number2)) { // map뒤의 숫자를 for문으로 돌리고 싶었는데 방법을 못 찾았습니다...
						System.out.println("추가할 키 : ");
						str1 = scanner.next();
						System.out.println("추가할 값 : ");
						str2 = scanner.next();
						map0.put(str1, str2);
					} else if (map1.containsValue(number2)) {
						System.out.println("추가할 키 : ");
						str1 = scanner.next();
						System.out.println("추가할 값 : ");
						str2 = scanner.next();
						map1.put(str1, str2);
					} else if (map2.containsValue(number2)) {
						System.out.println("추가할 키 : ");
						str1 = scanner.next();
						System.out.println("추가할 값 : ");
						str2 = scanner.next();
						map2.put(str1, str2);
					} else if (map3.containsValue(number2)) {
						System.out.println("추가할 키 : ");
						str1 = scanner.next();
						System.out.println("추가할 값 : ");
						str2 = scanner.next();
						map3.put(str1, str2);
					} else {
						System.out.println("키가 존재하지 않습니다. ");
					}							
			
			} else if (number1 == 3) {
				System.out.println("갱신항목 선택.");
				System.out.println("고유번호 입력 : ");
				
				number2 = scanner.next();
				
				if(map0.containsValue(number2)) { 
					System.out.println("현재 키 입력  : ");
					str1 = scanner.next();
					System.out.println("현재 값 입력 : ");
					str2 = scanner.next();
					System.out.println("갱신 키 입력  : ");
					str3 = scanner.next();
					System.out.println("갱신 값 입력 : ");
					str4 = scanner.next();
					
					map0.remove(str1);
					map0.put(str3,str4);
				} else if (map1.containsValue(number2)) {
					System.out.println("현재 키 입력  : ");
					str1 = scanner.next();
					System.out.println("현재 값 입력 : ");
					str2 = scanner.next();
					System.out.println("갱신 키 입력  : ");
					str3 = scanner.next();
					System.out.println("갱신 값 입력 : ");
					str4 = scanner.next();
					
					map1.remove(str1);
					map1.put(str3,str4);
				} else if (map2.containsValue(number2)) {
					System.out.println("현재 키 입력  : ");
					str1 = scanner.next();
					System.out.println("현재 값 입력 : ");
					str2 = scanner.next();
					System.out.println("갱신 키 입력  : ");
					str3 = scanner.next();
					System.out.println("갱신 값 입력 : ");
					str4 = scanner.next();
					
					map2.remove(str1);
					map2.put(str3,str4);
				} else if (map3.containsValue(number2)) {
					System.out.println("현재 키 입력  : ");
					str1 = scanner.next();
					System.out.println("현재 값 입력 : ");
					str2 = scanner.next();
					System.out.println("갱신 키 입력  : ");
					str3 = scanner.next();
					System.out.println("갱신 값 입력 : ");
					str4 = scanner.next();
					
					map3.remove(str1);
					map3.put(str3,str4);
				} else {
					System.out.println("키가 존재하지 않습니다. ");
				}	
			} else if (number1 == 4) {
				System.out.println("삭제항목 선택.");
				System.out.println("고유번호 입력 : ");
				number2 = scanner.next();
					
					if(map0.containsValue(number2)) { 
						System.out.println("삭제 할 키 : ");
						str1 = scanner.next();
						System.out.println("삭제 할 값 : ");
						str2 = scanner.next();
						map0.remove(str1, str2);
					} else if (map1.containsValue(number2)) {
						System.out.println("삭제 할 키 : ");
						str1 = scanner.next();
						System.out.println("삭제 할 값 : ");
						str2 = scanner.next();
						map1.remove(str1, str2);
					} else if (map2.containsValue(number2)) {
						System.out.println("삭제 할 키 : ");
						str1 = scanner.next();
						System.out.println("삭제 할 값 : ");
						str2 = scanner.next();
						map2.remove(str1, str2);
					} else if (map3.containsValue(number2)) {
						System.out.println("삭제 할 키 : ");
						str1 = scanner.next();
						System.out.println("삭제 할 값 : ");
						str2 = scanner.next();
						map3.remove(str1, str2);
					} else {
						System.out.println("키가 존재하지 않습니다. ");
					}	
			}
			
		}

		
		
		/*
		 * int number1; int number2; String str1;
		 * 
		 * List<String> list1 = new ArrayList<String>(); List<String> list2 = new
		 * ArrayList<String>(); List<String> list3 = new ArrayList<String>();
		 * List<String> list4 = new ArrayList<String>();
		 * 
		 * Map<Integer, Object> map = new HashMap<Integer, Object>();
		 * 
		 * 
		 * list1.add("cho"); list1.add("28"); list1.add("성남시"); list1.add("판교");
		 * 
		 * 
		 * list2.add("zxc"); list2.add("27"); list2.add("안양시"); list2.add("인천");
		 * 
		 * 
		 * list3.add("qwe"); list3.add("26"); list3.add("파주시"); list3.add("김포");
		 * 
		 * 
		 * list4.add("asd"); list4.add("25"); list4.add("강원도"); list4.add("선릉");
		 * 
		 * map.put(1234, list1); map.put(2345, list2); map.put(3456, list3);
		 * map.put(4567, list4);
		 * 
		 * 
		 * System.out.println("["+"이름"+","+" 나이"+","+"거주지"+","+"근무지"+"]");
		 * 
		 * Iterator<Integer> itr = map.keySet().iterator(); int itrs = itr.next();
		 * 
		 * while(itr.hasNext()) { System.out.println(itr + ":" + map.get(itr) ); }
		 * 
		 * while(true) {
		 * 
		 * System.out.println("---------------------------------------");
		 * System.out.println("1. 고객정보 전체출력 2. 추가항목 3. 갱신사항 4. 삭제항목");
		 * System.out.println("---------------------------------------");
		 * System.out.println("번호를 선택하세요 : ");
		 * 
		 * number1 = scanner.nextInt();
		 * 
		 * if (number1 == 1) { System.out.println("고객정보 전체출력. "); for (int i = 0; i <
		 * map.size(); i++) { System.out.println("고객정보 : " + map.get(i)); } } else if
		 * (number1 == 2) { System.out.println("추가항목 선택. ");
		 * System.out.println("고객 고유번호 선택 : "); number2 = scanner.nextInt();
		 * 
		 * if (map.containsKey(number2)) { // scanner에 고유번호 선택하여 map에 키 여부 확
		 * System.out.println("추가내용 : "); str1 = scanner.next(); map.put(number2,
		 * list1.add(str1));
		 * 
		 * } else { System.out.println("키가 존재하지 않습니다."); }
		 * 
		 * } }
		 */
		/*
		 * HashMap<String, String> hm = new HashMap<String, String>(); //hashmap
		 * 
		 * hm.put("이름", "cho"); hm.put("나이", "28"); hm.put("거주지", "성남시"); hm.put("근무지역",
		 * "판교");
		 * 
		 * 
		 * while(true) {
		 * 
		 * 
		 * int selectNum; String optionKey; String optionValue; String optionKey_1;
		 * String optionValue_1;
		 * 
		 * System.out.println("---------------------------------------");
		 * System.out.println("1. 본인정보 2. 추가항목 3. 갱신사항 4. 삭제항목");
		 * System.out.println("---------------------------------------");
		 * System.out.println("번호를 선택하세요 : ");
		 * 
		 * selectNum = scanner.nextInt();
		 * 
		 * if (selectNum == 1) { // 본인정보 출력
		 * 
		 * Iterator<String> keys = hm.keySet().iterator();
		 * 
		 * while(keys.hasNext()) { String key = keys.next(); System.out.println(key +
		 * ":" + hm.get(key)); }
		 * 
		 * } else if (selectNum == 2) { // 추가항목 System.out.println("추가항목 선택");
		 * System.out.println("항목 : "); optionKey = scanner.next();
		 * System.out.println("값 : "); optionValue = scanner.next();
		 * 
		 * hm.put(optionKey, optionValue); System.out.println(optionKey + ":" +
		 * optionValue + " \n 추 가 ");
		 * 
		 * } else if (selectNum == 3) { // 갱신사항
		 * 
		 * System.out.println("갱신사항 선택"); System.out.print("항목 : "); optionKey =
		 * scanner.next(); System.out.print("갱신항목 : "); optionKey_1 = scanner.next();
		 * System.out.print("값 : "); optionValue = scanner.next();
		 * System.out.print("갱신 예정값 : "); optionValue_1= scanner.next();
		 * 
		 * if(hm.containsKey(optionKey)) { hm.remove(optionKey, optionValue); //삭제 후
		 * 
		 * hm.put(optionKey_1, optionValue_1); //새로운 부분 완성. System.out.println(optionKey
		 * + ":" + optionValue + " 에서 " + optionKey_1 + ":" + optionValue_1 +
		 * "으로 \n 갱 신 완 료 ");
		 * 
		 * } else if (!hm.containsKey(optionValue)) {
		 * System.out.println("키 값이 존재하지 않습니다. "); } else {
		 * System.out.println("항목이 존재하지 않습니다. "); }
		 * 
		 * } else if (selectNum == 4) { // 삭제항목 System.out.println("삭제항목 선택 ");
		 * System.out.println("삭제항목 :  "); optionKey = scanner.next();
		 * System.out.println("삭제값 : "); optionValue = scanner.next();
		 * 
		 * if(hm.containsKey(optionKey)) { System.out.println(optionKey + ":" +
		 * optionValue + "\n 삭 제 완 료"); hm.remove(optionKey, optionValue); } else {
		 * System.out.println("삭제 할 항목이 존재하지 않습니다."); }
		 * 
		 * }
		 * 
		 * }
		 */
		
	}

}
