package pm;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Exam5 {

	public static void main(String[] args) {
		/* Arrays.asList() 매서드를 사용한 정적 컬렉션 객체 생성은 내부적으로는
		 * 배열을 먼저 생성하고 이것을 List<E>로 래핑 wrapping 즉 포장만 해놓음
		 * 따라서 내부 구조는 배열과 동일하므로 컬렉션 객체인데도 크게 변경이 불가능함
		 * 구현 클래스로 객체를 생성했을 때와는 달리 데이터의 추가 및 삭제가 불가능해짐
		 * 단, 크기를 변경하지 않는 데이터의 변경은 가능함
		 * 따라서 고정된 개수의 데이터를 저장하거나 활용할 때 사용됨
		 */

		// Arrays.asList() 매서드를 이용한 정적 컬렉션 객체 생성
//		List<Integer> aList1 = Arrays.asList(1,2,3,4);
//		aList1.set(1,7);
//		// aList1.add(5); // 오류 : 정적 컬렉션이라서
//		// aList1.remove(0); // 오류
//		System.out.println(aList1);
		
//		List<Integer> aList1 = new ArrayList<>();
//		List<Integer> aList2 = new ArrayList<>(30); // 크기
//		List<Integer> aList3 = new Vector<>();
//		List<Integer> aList4 = new Vector<>(30);
//		List<Integer> aList5 = new LinkedList<>();
		// List<Integer> aList6 = new LinkedList<>(30); // 저장 용량 지정 불가 
		
		// ArrayList<E> 클래스의 주요 매서드 활용 방법
		List<Integer> aList1= new ArrayList<>();
		// 1. add - 끝에 계속 추가
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString());
		
		// 2. add - 위치 지정 삽입
		aList1.add(1, 6);
		System.out.println(aList1.toString());
		
		// 3. addAll - 또 다른 리스트를 통째로 넣기
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1);
		System.out.println(aList2.toString());
		
		// 3. addAll - 또 다른 리스트를 위치 지정하여 통째로 넣기
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(1, aList2);
		System.out.println(aList3.toString());
		
		// 4. set 
		aList3.set(1, 5); // (index, value)
		System.out.println(aList3.toString()); // 위치값 변환
		
		// 5. remove // 삭제
		aList3.remove(1); // index의 값을 삭제
		
		// 6. remove // 삭제
		aList3.remove(new Integer(2)); // 처음 등장하는 값을 삭제
		System.out.println(aList3.toString());
		
		// 7. clear() // 싹 다 날리기
		aList3.clear();
		System.out.println(aList3.toString());
		
		// 8. isEmpty() 
		System.out.println(aList3.isEmpty());
		
		// 9. size()
		System.out.println(aList3.size());
		
		// 10. get()	// index로 가져오기
		System.out.println(aList2.get(0));
		System.out.println(aList2.get(1));
		System.out.println(aList2.get(2));
		
		System.out.println(aList2.toString());
		
		// Quiz aList2의 전체를 i번째 : 값
		int a = 1;
		for (int i : aList2) {
			System.out.println(a + "번째  : " + aList2.get(i -1));
			a++;
		}
		
		for (int i = 1; i < aList2.size() + 1; i++) {
			System.out.println(i + "번째 : " + aList2.get(i-1));
		}
	}

}
