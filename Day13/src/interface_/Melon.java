package interface_;

public class Melon  implements Food{
	
	private String name;

	public Melon() {
		this.name = "멜론";
	}
	
	@Override
	public String getFood() {
		
		return this.name;
	}
}