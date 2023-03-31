package poly;

public class Lion extends Predator{

	public Lion() {
		this.name = "사자";
	}
	
	public void eat() {
		System.out.println(this.name+" 는 고기를 먹습니다. ");
	}
}
