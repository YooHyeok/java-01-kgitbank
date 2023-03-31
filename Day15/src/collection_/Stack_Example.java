package collection_;

import java.util.*;

public class Stack_Example {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(1); stack.push(2); stack.push(3);
		stack.add(4); stack.push(5);
		//List형태로 1번째(2번째)값 조회
		System.out.println(stack.get(1)); //1번째 값을 가져온다
		//Stack형태로 2라는 값이 어디에 있는지 조회 = 4
		
		System.out.println(stack.search(2));//2번째값을 보여준다
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
			
		}
		System.out.println(stack.size());
	}

}
