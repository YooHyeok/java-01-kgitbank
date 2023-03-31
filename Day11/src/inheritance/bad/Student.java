package inheritance.bad;

public class Student {
	
	public String name;
	public int age;
	public String school;
	
	public Student(String name, int age, String school) {
		this.name = name;
		this.age = age;
		this.school = school;
	}
	
	public void speak() {
		System.out.printf("저의 이름은 %s 이고 나이는 %d, 학교는%s 입니다.\n", this.name, this.age, this.school);
	}
}
