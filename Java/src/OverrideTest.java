

class Shape {
	public void shape() {
		System.out.println("�����Դϴ�.");
	}

	public void draw() {
		System.out.println("������ �׸��ϴ�.");
	}
}

//��Ӱ��迡�� �θ��� �Լ��� ����� ��(�ٵ� �޸��ϴ°�)
class Rectangle extends Shape {
	public Rectangle() {
		System.out.println("�簢�� ������");
	}

	@Override
	public void draw() {
		System.out.println("�簢���� �׸��ϴ�.");
	}
}

class Trangle extends Shape {
	public Trangle() {
		System.out.println("�ﰢ�� ������");
	}

	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸��ϴ�.");
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		// 1��
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
