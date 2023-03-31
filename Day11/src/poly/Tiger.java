package poly;

public class Tiger extends Predator{
	
	public Tiger() {
		this.name = "호랑이";
	}

	@Override
	public void eat() {
		System.out.println(this.name+" 는 고기를 먹습니다. ");
	}
	
}
