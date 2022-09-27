// 1. �������̽� ���Ǵ� ���� Ŭ���� �ڸ��� ���� �ڸ��̴�.
// 2. �޼ҵ��� ��ü�� ����(�߻� �Լ��� ���� �� �ִ�.)
// 3. ��ü ���� �Ұ�. ���� ���� ������ ���� - �߻�Ŭ������ �ٸ�����
// 4. �߻� �޼ҵ尡 ������ �ڽ� ���� �ؾ���(��� Ű����� implement)


interface Printable {
	public abstract void print(String doc);
}

class SPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("�Ｚ �������Դϴ�.");
		System.out.println(doc);

	}

}

class LPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("LG �������Դϴ�.");
		System.out.println(doc);
	}

}

public class DriverTest {

	public static void main(String[] args) {
		Printable prn = new SPrinterDriver();
		prn.print("������ּ���");

		prn = new LPrinterDriver();
		prn.print("������ּ���");
	}

}
