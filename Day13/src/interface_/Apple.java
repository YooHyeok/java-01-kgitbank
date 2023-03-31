package interface_;

public class Apple extends Fruit implements Food{

	public Apple() {
		this.name = "사과";
	}

	@Override
	public String getFood() {
		
		return this.name;
	}
}
