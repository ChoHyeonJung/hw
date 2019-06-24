package projectPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// 과 제
// 이름 : 조 현 중
// 제출일 : 2019.06.24
// 제출기한 : 2019.06.06
// 제출내용 : collection framework를 활용한 출력,추가,갱신,삭제 구현 
// List,Map을 활용하였으며, scanner를 사용 함.

public class TestProject2 {

	public final static void main(String[] args) {
		
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
			String str1 = "";
			String str2 = "";
			String str3 = "";
			String str4 = "";
			System.out.println("------------------------------------------------------------------");
			System.out.println("1. 고객정보 전체출력 2. map 추가 3. 추가항목 4. 갱신사항 5. 삭제항목 6. 개별조회");
			System.out.println("---------------------------------------");
			System.out.println("번호를 선택하세요 : ");
			
			number1 = scanner.nextInt();
			
			if (number1 == 1) {		
				System.out.println("고객정보 전체출력.");
				mainList.stream().forEach(s -> System.out.println(s));
				 
			} else if (number1 == 2) {
				System.out.println("map 추가 선택.");
				System.out.println("고유번호 입력(필수) : ");
				number2 = scanner.next();
				System.out.println("이름 입력 : ");
				str1 = scanner.next();
				System.out.println("나이 입력 : ");
				str2 = scanner.next();
				System.out.println("거주지 입력 : ");
				str3 = scanner.next();
				System.out.println("근무지 입력 : ");
				str4 = scanner.next();
				
				if (number2 == " " || number2 == null) {
					System.out.println("고유번호를 다시 입력하세요.");
				}
				
				if (str1 == "" || str2 == "" || str3 == "" || str4 == "") {
					System.out.println("빈칸입니다. 다시 입력하세요.");
				}
				map4.put("고유번호",number2);
				map4.put("이름", str1);
				map4.put("나이", str2);
				map4.put("거주지", str3);
				map4.put("근무지", str4);
				
				mainList.add(map4);
				
				
				
				
//				Map<Object,Object> collect 
//				= map0.entrySet().stream()
//				.filter(x -> x.getKey().equals(number2))
//				.collect(Collectors
//						.toMap(x -> x.getKey(), x -> x.getValue()));			
//				System.out.println("추가 키 입력 : ");
//				str1 = scanner.next();
//				System.out.println("추가 값 입력 : ");
//				str2 = scanner.next();
//				map0.put(str1, str2);
//				mainList.stream().forEach(x -> System.out.println(x));
				
		
				/*
				 * // 조건을 주었는데도 불구하고 고유번호가 일치하게 넣든 안 넣든 간에 무조건 값이 바뀐다.. Map<Object, Object>
				 * collect = map0.entrySet().stream() .filter(x -> { if (x.getKey() == "고유번호" &&
				 * x.getValue() == number2) { return true; } else { return false; } })
				 * .collect(Collectors .toMap(x -> x.getKey(), x -> x.getValue()));
				 * 
				 * System.out.println("추가 키 입력 : "); str1 = scanner.next();
				 * System.out.println("추가 값 입력 : "); str2 = scanner.next(); map0.put(str1,
				 * str2); mainList.stream().forEach(x -> System.out.println(x));
				 */
				
																	
			} else if (number1 == 3) {
				System.out.println("추가항목 선택.");
				System.out.println("고유번호 입력 : ");
				number2 = scanner.next();
				List<Map<String, String>> collectList = mainList.stream()
						.filter(x -> x.get("고유번호").equals(number2))
						.collect(Collectors.toList());
				
				System.out.println(collectList); // 결과를 찾음. 고유번호에 맞는 맵만 골라서 찾음.
				
				System.out.println("추가 키 입력 : ");
				str1 = scanner.next();
				System.out.println("추가 값 입력 : ");
				str2 = scanner.next();
				collectList.get(0).put(str1, str2); // 고유의 번호이므로 한개만 존재한다 list->list->map 
				
			}
			
			else if (number1 == 4) {
				System.out.println("갱신항목 선택.");
				System.out.println("고유번호 입력 : ");
				number2 = scanner.next();
				List<Map<String, String>> collectList = mainList.stream()
						.filter(x -> x.get("고유번호").equals(number2))
						.collect(Collectors.toList());
				
				System.out.println(collectList); 
				
				System.out.println("갱신할 키 입력 : ");
				str1 = scanner.next();
				System.out.println("새로운 키 입력 : ");
				str2 = scanner.next();
				System.out.println("새로운 값 입력 : ");
				str3 = scanner.next();
				collectList.get(0).remove(str1);
				collectList.get(0).put(str1, str2);  
				 
				
				
			} else if (number1 == 5) {
				System.out.println("삭제항목 선택.");
				System.out.println("삭제번호 입력 : ");
				number2 = scanner.next();
				List<Map<String, String>> collectList = mainList.stream()
						.filter(x -> x.get("고유번호").equals(number2))
						.collect(Collectors.toList());
				
				System.out.println(collectList); 
				
				System.out.println("삭제할 키 입력 : ");
				str1 = scanner.next();
				
				//collectList.get(0).remove(str1);
				collectList.get(0).entrySet().removeIf(x -> x.getKey().equals(number2));
			
			} else if (number1 == 6) {
				System.out.println("개별조회.");
				System.out.println("고유번호 입력 : ");
				number2 = scanner.next();
				List<Map<String, String>> collectList = mainList.stream()
						.filter(x -> x.get("고유번호").equals(number2))
						.collect(Collectors.toList());
				
				System.out.println(collectList.get(0)); 
				
			}

		
		}
				
	}	
			
	}