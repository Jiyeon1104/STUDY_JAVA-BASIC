package pm;

public class Exam5 {

	public static void main(String[] args) {
		// 문자열 연산
//		String str1 = "안녕" + "하세요" + "!";
//		System.out.println(str1);
//		
//		String str2 = "반갑";
//		str2 += "습니다";
//		str2 += "!";
//		System.out.println(str2);
		
		// String 객체는 내용을 변경할 수 없기 때문에 메모리에는 각각의 객체가 매번 생성됨
		// 처음 "안녕" + "하세요" 붙을 때 객체가 새롭게 만들어지고 "안녕하세요" + "!"
		// 붙을 때 객체가 또 생성됨. 최종적으로 마지막 객체의 위치값이 저장되게 됨
		
		// 문자열 관련 함수 정리
		
		// length() 문자열 길이
//		String str1 = "Hello Java"; // 한글, 영어 모두 한 글자 당 한 개로 카운트함
//		String str2 = "안녕하세요! 반갑습니다"; // 빈 칸도 글자로 count 함
//		System.out.println(str1.length());
//		System.out.println(str2.length());
//		System.out.println();
//		
//		// charAt() 문자열 검색
//		System.out.println(str1.charAt(1)); // 인덱스 1위치의 문자를 검색
//		System.out.println(str2.charAt(1)); // 인덱스 1위치의 문자를 검색
//		System.out.println();
//		
//		// indexOf() 글자가 위치한 인덱스를 반환
//		// lastIndexOf()
//		System.out.println(str1.indexOf('a')); // 앞에서부터 첫 번째 등장하는 'a'가 위치한 인덱스 반환
//		System.out.println(str1.lastIndexOf('a')); // 뒤에서부터 첫 번째 등장하는 'a'
//		System.out.println();
//		
//		// 문자열 변환
//		String str3 = String.valueOf(2.3);
//		String str4 = String.valueOf(false);
//		System.out.println(str3);
//		System.out.println(str4);
//		System.out.println();
//		
//		// concat() 문자열을 연결
//		String str5 = str3.concat(str4);
//		System.out.println(str5);
//		System.out.println();
//		
//		// 대소문자 변환
//		String str6 = "Java Study";
//		System.out.println(str6.toLowerCase());
//		System.out.println(str6.toUpperCase());
//		System.out.println();
//		
//		// replace 문자열 변경
//		System.out.println(str6.replace("Study", "공부"));
//		System.out.println();
//		
//		// substring 문자열에서 슬라이싱
//		System.out.println(str1.substring(0,5)); // 0번째부터 5미만까지 슬라이싱
//		System.out.println();
//		
//		// trim 여백 제거
//		System.out.println("         austin          ".trim());
//		System.out.println();
		
		// 문자열의 내용 비교 : 문자열을 비교할 때는 ==를 절대 쓰지말고 .equals() 를 사용함
//		String str2 = new String("Java");
//		String str3 = new String("Java");
//		String str4 = new String("Java");
//		
//		System.out.println(str2 == str3);
//		System.out.println(str3 == str4);
//		System.out.println(str2 == str4); // 글자 자체와는 상관 없이 같은 메모리 주소인지 여부를 확인 
//		
//		System.out.println(str2.equals(str3));
//		System.out.println(str3.equals(str4));
//		System.out.println(str4.equals(str2)); // 메모리의 위치와는 관계 없이 글자 자체만을 비교함
//		System.out.println(str3.equalsIgnoreCase(str4)); // 대소문자와는 상관없이 비교
		
		// 5개의 원소가 있는 1차원 배열의 모든 원소를 순서대로 출력하는 코드를 for-each문을 사용하여 작성하세요
		// int[][] a = new int[]{1,2,3,4,5};
		
		int[] a = new int[] {1,2,3,4,5};
		
		for(int each : a) {
			System.out.println(each);
		}
		
		// b라는 이름의 2차원 배열 객체를 생성하시오
		// 1	3	5
		// 7	9
		
		int[][] b = {{1,3,5},{7,9}};
		
		// 이중 for문을 사용하여 2차원 배열의 모든 원소를 출력하시오
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.println("b[" + i + "]["+ j + "] = " + b[i][j]);
			}
		}
		
		// String str =
		
		String str = "내 이름은 [홍길동]입니다. 나이는[15]살입니다.";
		// 단 indexOf() lastIndexOf() substring() 반드시 한 번 이상 사용
		
		int name1 = str.indexOf('[') + 1;
		String name = str.substring(name1, name1 + 3);
		
		int age1 = str.lastIndexOf('[') + 1;
		int age = Integer.parseInt(str.substring(age1, age1 + 2));
		
		System.out.println(name);
		System.out.println(age);
	}

}
