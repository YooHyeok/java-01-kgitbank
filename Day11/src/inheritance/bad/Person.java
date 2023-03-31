package inheritance.bad;

public class Person {

	public String name;
	public int age;

	public Person() {
		this.name = "이름없음";
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void speak() {
		System.out.printf("저의 이름은 %s 이고 나이는 %d 입니다.\n",this.name, this.age);
	}
	

}
