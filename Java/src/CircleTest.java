interface Shape1 {
	final double PI = 3.14;

	void draw();

	double getArea();

	default public void redraw() {
		System.out.println("--- �ٽ� �׸��ϴ�.");
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
		System.out.println("�������� " + radius + "�� �� ��ü");

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
		System.out.println("������ " + donut.getArea());
	}

}
