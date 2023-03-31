package interface_;

public class Banana extends Fruit implements Food{
	
	public Banana() {
		this.name = "바나나";
	}
	
	@Override
	public String getFood() {
		
		return this.name;
	}
}
