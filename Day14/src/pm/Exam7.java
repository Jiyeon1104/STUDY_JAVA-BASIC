package pm;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exam7 {

	public static void main(String[] args) {
		// ArrayList와 LinkedList 성능 비교 (추가 / 삭제 / 검색)

		ArrayList aList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
		long startTime = 0;
		long endTime = 0;
		
		startTime = System.nanoTime();
		for(int i = 0; i< 100000; i++) {
			aList.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 추가 시간 = " + (endTime - startTime) + "ns");
		

		startTime = System.nanoTime();
		for(int i = 0; i< 100000; i++) {
			linkedList.add(0, i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 추가 시간 = " + (endTime - startTime) + "ns");
		
		// 검색 시간
		startTime = System.nanoTime();
		for(int i = 0; i< 100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 검색 시간 = " + (endTime - startTime) + "ns");
		

		startTime = System.nanoTime();
		for(int i = 0; i< 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 검색 시간 = " + (endTime - startTime) + "ns");
		
		
		// 삭제 시간
		startTime = System.nanoTime();
		for(int i = 0; i< 100000; i++) {
			aList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 삭제 시간 = " + (endTime - startTime) + "ns");
		

		startTime = System.nanoTime();
		for(int i = 0; i< 100000; i++) {
			linkedList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 삭제 시간 = " + (endTime - startTime) + "ns");
	}

}
