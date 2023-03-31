package collection_;

import java.util.PriorityQueue;
//선입선출.
//
public class PriorityQueue_Example {

	public static void main(String[] args) {
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for(int i = 10; i > 0; i--) {
			que.add(i);
		}
		while(!que.isEmpty()) {
			System.out.print(que.poll()+" ");
		}
	}

}
