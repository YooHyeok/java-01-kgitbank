package collection_;

import java.util.*;

public class HashSet_Example {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();
		set.add("첫번째"); set.add("두번째"); set.add("세번째");
		System.out.println(set.add("첫번째"));
		System.out.println(set.size());
		System.out.println(set);
		set.remove("첫번째");
		System.out.println(set);
		set.add("네번째"); set.add("다섯번째");
		Iterator<String> i = set.iterator(); //Iterator은 set에있는 값을 추출.
		while(i.hasNext()) {
//			System.out.println(i.next());
			
			String data = i.next(); //next는 한번 가면 돌아오지 않기때문에 data로 변수지정.
			if(data.length()==3) {
				System.out.println(data);
			}
		}
		for(String data : set) {
			System.out.println(data);
		}
		HashSet<Person> pset = new HashSet<>();
		pset.add(new Person("유재혁",10));
		pset.add(new Person("유재혁",10));
		System.out.println(pset.size());
		
	}
	
	

}
