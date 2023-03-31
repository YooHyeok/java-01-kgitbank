package collection_;

import java.util.TreeSet;

public class TreeSet_Example {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("첫번째"); set.add("두번째"); set.add("세번째");
		System.out.println(set);
		
		TreeSet<Person> pset = new TreeSet<>();
		pset.add(new Person("유재혁",10));
		pset.add(new Person("유재혁",20));
		System.out.println(pset);
		
	}

}
