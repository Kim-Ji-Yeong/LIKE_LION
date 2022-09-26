

class Shape {
	public void shape() {
		System.out.println("도형입니다.");
	}

	public void draw() {
		System.out.println("도형을 그립니다.");
	}
}

//상속관계에서 부모의 함수을 덮어쓰는 것(바디만 달리하는것)
class Rectangle extends Shape {
	public Rectangle() {
		System.out.println("사각형 생성자");
	}

	@Override
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}
}

class Trangle extends Shape {
	public Trangle() {
		System.out.println("삼각형 생성자");
	}

	@Override
	public void draw() {
		System.out.println("삼각형을 그립니다.");
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		// 1번
		Shape shape = new Shape();
		shape.draw();

		Rectangle rc = new Rectangle();
		rc.draw();

		Shape shape2 = new Rectangle();
		shape2.draw();
//
//		shape2 = new Trangle();
//		shape2.draw();

//		Rectangle rec = new Shape();

//		Shape[] shape = { new Triangle(), new Rectangle2() };

//		for (Shape s : shape) {
//			s.draw();
//		}
	}

}
