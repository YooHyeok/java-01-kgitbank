package collection_;

import java.util.ArrayList;

public class ArrayList_Example {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i < 11; i++) {
			list.add(i);
		}
		System.out.println(list);
		System.out.println(list.get(5));
		System.out.println(list.indexOf(5));
		System.out.println(list.size());
		System.out.println(list.remove(new Integer(10)));
		System.out.println(list.set(2,11));//2번쨰값을 11로바꾼다. set
		System.out.println(list);
	}

}
