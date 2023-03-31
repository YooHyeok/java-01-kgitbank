package collection_quest;

import java.util.*;

public class Overlap_Example {

	public static void main(String[] args) {
		String[] a = {"가","가나","가","가나다","나가","나","나","나가","나가다","가나다라"};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(removeOverlap(a)));
	}
	
	public static String[] removeOverlap(String[] data) {
		HashSet<String> set = new HashSet<>(); //HashSet대신 TreeSet을 쓰면 이름별로 정렬
		for(String a : data) {
			set.add(a);
			
		}
		String[] answer = new String[set.size()];
		answer = set.toArray(answer);
		return answer;
	}

}
