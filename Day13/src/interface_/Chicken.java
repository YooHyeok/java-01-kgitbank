package interface_;

public class Chicken extends Meat implements Food{
	
	public Chicken() {
		this.name = "닭고기";
	}
	
	@Override
	public String getFood() {
		
		return this.name;
	}
}
