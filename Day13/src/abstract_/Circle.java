package abstract_;

public class Circle extends Shape {

	private int r;
	
	@Override
	public void getArea() {
	System.out.println(Math.PI*r*r); //r제곱
	}
	public Circle(int r) {
		this.r = r;
	}
}
