package inheritance.good;

public class Employee extends Person {
	
	public String job;
	
	public Employee(String name, int age, String job) {
		//super - 부모를 가리키는 키워드. 부모의 변수, 메서드, 생성자 호출 가능
		//super. - 부모의 변수 , 메서드 호출. 
		//super() - 부모의 생성자 호출
		//변수와 메서드는 물려밭기(참조) 때문에 호출하는 경우가 많이 없지만
		//생성자는 물려받지 않기 때문에 필요한 경우 참조해서 사용.
		super(name, age);
		this.job = job;
	}
	
	public String speak() {
		return super.speak()+ ", 직업="+this.job;
	}
}
