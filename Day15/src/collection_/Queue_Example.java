package collection_;

import java.util.*;

public class Queue_Example {

	public static void main(String[] args) {

		Queue<Integer> que = new LinkedList<>();
		que.add(5); que.add(3); que.offer(1);
		que.add(7); que.add(10);
		System.out.println(que);
		
		while(!que.isEmpty()) { //비어있지않다 ! 
			System.out.println(que.poll());//poll 맨 처음값을 빼고 출력하는 메서드
			System.out.println(que.peek());//peek는 다음 값을 조회하는 메서드.
		}
		System.out.println(que.size());
	}

}
