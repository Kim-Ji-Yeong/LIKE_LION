package ch220928;

public class Test {

	public static void main(String[] args) {
		
		//���������� �����ִ� ��ü�� JVM�̴�
		
		
		int a = 1; //������������ �ʱ�ȭ�� �ʿ�.
		int b = 0;
		
		try {
			
			 b = a / b;
			System.out.println("Ʈ���� ��" +a); 
			 
		} catch (Exception e) { //Exception��ü��, ��ü������ JVM�� ����.
									       //ArithmeticException�� �θ�ü�� Exception
			e.printStackTrace(); //�ش繮������ �ѷ���. ����������� �⺻������ �־���(����üũ�ϱ�����)
			
			System.out.println("��ġ" + a);
			System.out.println("��ġ" + b);
		
		}finally {
			System.out.println("���̳θ��Դϴ�.");
		}
		
		System.out.println("Ʈ������ġ �ٱ�");
		System.out.println(a);

	}

}
