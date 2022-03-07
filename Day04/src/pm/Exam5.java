package pm;

import java.util.Arrays;

public class Exam5 {

	public static void main(String[] args) {

		// 배열 생성 방법 세 가지 총정리
		// 방법1
		int[] array1 = new int[3];
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);

		int[] array2;
		array2 = new int[3];
		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;
		System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
		System.out.println();
		
		// 방법 2
		int[] array3 = new int[] {3,4,5};
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);
		
		int[] array4;
		array4 = new int[]{3,4,5};
		System.out.println(array4[0] + " " + array4[1] + " " + array4[2]);
		System.out.println();
		
		// 방법 3
		int[] array5 = {3,4,5}; // 강제 초기화 생략
		System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);
		
		// 배열에서의 초기화 값 정리
		// int, long, short, char, byte - 0으로 초기화
		// boolean - false로 초기화
		// float double - 0.0으로 초기화
		// 클래스 ......null
		
		int value1; 
		//System.out.println(value1); < 오류 // 초기값없이 출력 불가능
		int[] value2;
		//System.out.println(value2); < 오류 // 초기값 없이 출력 불가능 
		int value3 = 0;
		System.out.println(value3); // value3을 0으로 초기화했기 때문에 오류 미발생
		int[] value4 = null;
		System.out.println(value4); // value4를 null로 초기화했기 때문에 오류 미발생
		
		boolean[] array6 = new boolean[3]; // boolean은 false로 초기화
		for (boolean num : array6) {
			System.out.println(num); // for - each문을 활용할 줄 알자!!!!!!!
		}
		
		int array7[] = new int [3];
		for(int each : array7) {
			System.out.println(each); // 0으로 배열 내 값 자동 초기화
		}
		
		String array8[] = new String[3];
		for(String str : array8) {
			System.out.print(str + " "); // string은 null로 초기화
		}
		System.out.println();
		
		// 배열 전체를 출력하는 간단한 방법
		// Arrays.toString(배열명)을 이용하면 배열의 모든 원소를 한 번에 모두 출력
		System.out.println(Arrays.toString(array6));
		System.out.println(Arrays.toString(array7));
		System.out.println(Arrays.toString(array8));
		
	
		
	}

}
