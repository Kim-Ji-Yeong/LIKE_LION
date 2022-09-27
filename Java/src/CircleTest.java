interface Shape1 {
	final double PI = 3.14;

	void draw();

	double getArea();

	default public void redraw() {
		System.out.println("--- 다시 그립니다.");
		draw();
	}
}

class Circle implements Shape1 {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;

	}

	@Override
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원 객체");

	}

	@Override
	public double getArea() {
		return PI * radius * radius;
	}

}

public class CircleTest {

	public static void main(String[] args) {
		Shape1 donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}

}
