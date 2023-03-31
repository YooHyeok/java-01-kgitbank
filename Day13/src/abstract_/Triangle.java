package abstract_;

public class Triangle extends Shape{//shape를 상속.

	@Override
	public void getArea() {
		System.out.println(x*y/2);
	}
	
	public Triangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
