// 1. 인터페이스 정의는 예전 클래스 자리에 오는 자리이다.
// 2. 메소드의 몸체가 없다(추상 함수만 가질 수 있다.)
// 3. 객체 생성 불가. 참조 변수 선언은 가능 - 추상클래스와 다른점임
// 4. 추상 메소드가 있으니 자식 구현 해야함(대신 키워드는 implement)


interface Printable {
	public abstract void print(String doc);
}

class SPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("삼성 프린터입니다.");
		System.out.println(doc);

	}

}

class LPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("LG 프린터입니다.");
		System.out.println(doc);
	}

}

public class DriverTest {

	public static void main(String[] args) {
		Printable prn = new SPrinterDriver();
		prn.print("출력해주세요");

		prn = new LPrinterDriver();
		prn.print("출력해주세요");
	}

}
