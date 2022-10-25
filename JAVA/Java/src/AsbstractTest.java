
abstract class Animal{
	public abstract void move();
}
//abstract는 자손이 구현하라.


class Lion extends Animal{

	@Override
	public void move() {
		System.out.println("사자의 move 메소드 입니다.");
	}
	
}


public class AsbstractTest {

	public static void main(String[] args) {
//		Animal animal = new Animal();
		Lion lion = new Lion();
		lion.move();
	}

}
