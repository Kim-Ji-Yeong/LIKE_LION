package other;

class Shape {
	double width;
	double height;

	public Shape(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return 0.0;
	}
}

class Triangle extends Shape {
	public Triangle(double width, double height) {
		super(width, height);
	}

	@Override
	public double getArea() {
		return width * height * 0.5;
	}
}

class Rectangle extends Shape {
	public Rectangle(double width, double height) {
		super(width, height);
	}

	@Override
	public double getArea() {
		return width * height;
	}
}

class Circle extends Shape {
	double radius;

	public Circle(double radius) {
		super(0, 0);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * 3.14;
	}
}

//public static void print(Shape shape) {
//	if(shape instanceof Rectangle) { //ĳ���� ���� ���θ� ����
//		System.out.println("����Ÿ���� Rectangle �Դϴ�.");
//	}else if(shape instanceof Circle) {
//		System.out.println("���� Ÿ���� Circle �Դϴ�.");
//	}else {
//		System.out.println("�� �� ���� Ÿ���Դϴ�.");
//	}
//}

public class AreaTest {

	public static void main(String[] args) {
		Shape[] shape = { new Triangle(10, 10), new Rectangle(10, 10), new Circle(10) };

//        print(shapeArr[0]);
		double sumArea = 0;

		for (Shape s : shape) {
			sumArea += s.getArea();
		}

		System.out.println(sumArea);
	}

}
