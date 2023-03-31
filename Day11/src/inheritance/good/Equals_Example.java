package inheritance.good;

public class Equals_Example {

	public static void main(String[] args) {
		Person p1 = new Person("유재혁",28);
		Person p2 = new Person("유재혁",28);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		
		
	}

}
