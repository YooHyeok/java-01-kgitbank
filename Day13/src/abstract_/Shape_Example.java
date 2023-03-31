package abstract_;

public class Shape_Example {

	public static void main(String[] args) {
		printArea(new Triangle(3,7));
		printArea(new Circle(5));
	}
	
	public static void printArea(Shape shape) {
		shape.getArea();
	}

}
