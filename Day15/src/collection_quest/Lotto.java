package collection_quest;

import java.util.*;

public class Lotto {

	public static void main(String[] args) {
		setLotto();
		CollectionsLotto();
	}
	public static void setLotto() {
		Set<Integer> Lotto = new HashSet<>(); //set.size 는 0
		while(Lotto.size()<6) { //크기가 6이 될 때까지.
			int i = (int)(Math.random()*45)+1;
			Lotto.add(i);
		}
		System.out.println(Lotto);
	}
	
	public static void CollectionsLotto() {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i<=45; i++) {
			list.add(i);
		}
		System.out.println(list);
		//shuffle은 List계열 에서만 사용 가능 - 안의 값을 무작위로 섞음.
		//해당 리스트를 변경시킴 - 변경시킨 값을 리턴하는 구조가 아님
		//set에는 순서가 없으므로 섞는의미가없음.
		Collections.shuffle(list);
		System.out.println(list);
		//크기 비교를 통해 안의 값들을 순서대로 정렬
		//마찬가지로 해당 객체를 변경 - 새로운 값을 리턴하는게 아님
		//자매품 - Arrays.sort = 배열의 값들 정렬
		Collections.sort(list);
		System.out.println(list);
		//이진탐색 - 반으로 나눠서 큰지 작은지 - 작다면 작은 범위를 다시 반으로
		//나누어 큰지 작은지의 로직으로 탐색. 완전탐색보다 훨씬 빠른 속도
		//선행조건으로 크기순 정렬이 되어 있어야 가능함
		//자매품 - Arrays.binarySearch() = 크기정렬 되어 있어야 가능
		Collections.binarySearch(list, 31);
		//역순정렬 - reverse 메서드 또는 sort에 역순 Comparator 대입
		//기존 데이터 타입들의 역순은 collections.reverseOrder()로
		//호출가능
		Collections.reverse(list);
		Collections.sort(list, Collections.reverseOrder());//역순정렬.
	}
	
}
