package abstract_;

public class Person extends Fruit{

	
	
	
	public void eat(Fruit fruit) {//먹는기능 - fruit라는 클래스에서 먹는다
		System.out.println("사람이"+fruit.name+"을/를 먹습니다.");
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.eat(new Apple());
		p.eat(new Banana());
		p.eat(new Melon());
		//추상클래스는 인스턴스(객체) 생성불가
//		p.eat(new Fruit());
		//추상클래스를 자료형으로 가지는 객체는 선언 가능
		Fruit f = new Apple();
		
	}
	
}
