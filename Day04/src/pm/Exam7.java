package pm;

import java.util.Arrays;

public class Exam7 {

	public static void main(String[] args) {
		/* 2차원 배열 : 가로와 세로 2차원으로 데이터를 저장하는 배열
		 * 배열의 선언을 보면 차원이 1개씩 늘어날 때마다 대괄호가 한 개씩 늘어난다.
		 * 배열의 위치 표현은 세로방향으로 숫자가 늘어나는 행 row번호
		 * 가로 방향으로 숫자가 늘어나는 열 column 번호로 구성됨
		 * 자료형[][] 변수명;	자료형 변수명[][]; 자료형[] 변수명[];
		 * main method 작성 시 (String[] args) 의미 또한 여러 개의 string 객체를 묶어 저장한다는 의미
		 */
		
		// 2차원 배열 생성 방법1
//		int[][] array1 = new int[3][4];
//		int[][] array2;
//		array2 = new int[3][4];
//		
//		// 2차원 배열 생성 방법2
//		int array3[][] = new int[3][4];
//		int array4[][];
//		array4 = new int[3][4];
//		
//		// 2차원 배열 생성 방법3
//		int[] array5[] = new int[3][4];
//		int[] array6[];
//		array6 = new int[3][4];

		int[][] array1 = new int[2][3];
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[0][2] = 3;
		array1[1][0] = 4;
		array1[1][1] = 5;
		array1[1][2] = 6;
		
		System.out.println(array1[0][0]);
		
		int[][] a = {{1,2},{3,4,5}};
		
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
			}
		}
		
		
		for (int[] array : a) {
			for (int k : array) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		// 길이가 100인 배열을 만들어 for문을 이용해서 배열의 순서대로 
		// 1에서 100까지의 값을 넣어라.
		// 옆 한 줄로 전체를 출력하라.
		
//		int[] arr1 = new int[100];
//		
//		for(int i = 0; i < arr1.length; i++) {
//			arr1[i] = i + 1;
//		}
//		
//		System.out.println(Arrays.toString(arr1));
//		
		
		// arr1 = {5,4,3,2,1} arr2 
		
		int[] arr1 = {5,4,3,2,1};
		int[] arr2 = new int[arr1.length];
		int i = 0;
		
		for(int num : arr1) {
			arr2[i] = arr1[arr1.length-1 - i];
			i++;
		}
	System.out.println(Arrays.toString(arr2));
	}

}
