package inheritance.good;

public class Student extends Person{
	
	public String school;
	
	public Student (String name, int age, String school) {
		super(name, age);
		this.school = school;
	}

	//상속받은메서드를 자식 클래스에서 다시 구현하는 것 - 제정의
	//override 어노테이션으로 표시 - 없어도 상관없음
	@Override //재정의했다는뜻. 덮어씌움.
	public String speak() {

		return super.speak()+", 학교="+this.school;
	}
	
}
