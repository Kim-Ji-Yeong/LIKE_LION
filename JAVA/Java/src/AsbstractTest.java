
abstract class Animal{
	public abstract void move();
}
//abstract�� �ڼ��� �����϶�.


class Lion extends Animal{

	@Override
	public void move() {
		System.out.println("������ move �޼ҵ� �Դϴ�.");
	}
	
}


public class AsbstractTest {

	public static void main(String[] args) {
//		Animal animal = new Animal();
		Lion lion = new Lion();
		lion.move();
	}

}
