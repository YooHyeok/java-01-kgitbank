package interface_;

public class Pork extends Meat implements Food{
	
	public Pork() {
		this.name = "돼지고기";
	}
	
	@Override
	public String getFood() {
		
		return this.name;
	}
}
