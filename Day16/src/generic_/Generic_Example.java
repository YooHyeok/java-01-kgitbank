package generic_;

public class Generic_Example {

	public static void main(String[] args) {
		Person p = new Person();
		//p.name = 엘리먼트 타입 그대로 선언되었기 때문에
		//모든 값을 받을 수 있는 Object로 변환됨
		
		Person<String> p1 = new Person<>();
		//p1.name = 제네릭 선언은 String으로 했기 때문에
		//해당 제네릭 변수와 모든 메서드의 제네릭 타입이
		//String으로 변환됨
		
		String a = Person.a("첫번째");
		int b = Person.a(10);
		Person c = Person.a(new Person());
	}

}
