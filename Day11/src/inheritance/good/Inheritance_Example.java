package inheritance.good;

public class Inheritance_Example {

	public static void main(String[] args) {

		Person p = new Person("유재혁", 28);
		Employee e = new Employee("남궁찬", 28, "아이티꿈나무");
		Student s = new Student("김민광", 14, "광명중학교");
		System.out.println(p.speak());
		System.out.println(e.speak());
		System.out.println(s.speak());
		
		//다형성 - 부모는 자식이 될 수 없지만 자식은 부모가 될 수 있음.
		Person p1 = e;
		
		Person[] pArray = new Person[3];
		pArray[0] = p;
		pArray[1] = e;
		pArray[2] = s;
	
		for(Person per : pArray) {
			//재정의 규칙 - 재정의 된 메서드가 있는 다형적 객체의 경우
			//컴파일은 부모의 메서드로 실행 - 부모형태이기 때문에 부모의 멤버만 참조 가능
			//실행은 자식의 재정의 된 메서드 - 부모와 형태가 똑같기 때문에 컴파일 후 참조 가능
			System.out.println(per.speak());
		}
	}
	

}
