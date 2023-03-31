package interface_;

public class Person {

	public void eat(Food food) {
		System.out.println("사람이"+food.getFood()+"을/를먹습니다.");
	}
	
	
	
	public static void main(String[] args) {
		Person p = new Person();
		p.eat(new Apple());
		p.eat(new Banana());
		p.eat(new Melon());
		p.eat(new Pork());
		p.eat(new Beef());
		p.eat(new Chicken());
		//추상클래스는 인스턴스(객체) 생성불가
//		p.eat(new Fruit());
		//추상클래스를 자료형으로 가지는 객체는 선언 가능
		Fruit f = new Apple();
		
	}
	
}
