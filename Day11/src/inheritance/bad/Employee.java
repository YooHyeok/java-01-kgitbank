package inheritance.bad;

public class Employee {

	public String name;
	public int age;
	public String job;
	
	public Employee(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public void speak() {
		System.out.printf("저의 이름은 %s 이고 나이는 %d, 직업은 %s 입니다.\n", this.name, this.age, this.job);
		
	}
	
}
