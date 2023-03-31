package poly;

public class Zoo {
	
	public static void main(String[] args) {
//		Tiger t = new Tiger();
//		feed(new t());
		feed(new Predator());
		feed(new Tiger());
		feed(new Lion());
		
	}
	public static void feed(Predator pre) {
		pre.eat();
	}
}
