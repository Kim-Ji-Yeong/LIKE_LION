import java.util.Scanner;

abstract class Calc {
	protected int a;
	protected int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	abstract int calculate();
}

class Add extends Calc {
	@Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		return a + b;
	}
//	@Override
//	public int calculate() {
//		return super.a + super.b;
//	}
//	@Override
//	public int calculate() {
//		return this.a + this.b;
//	}
}

class Sub extends Calc {
	public int calculate() {
		return a - b;
	}
}

class Mul extends Calc {
	public int calculate() {
		return a*b;
	}
}

class Div extends Calc {
	public int calculate() {
		if (b == 0)
			return -1;
		return a / b;
	}
}

public class CalcTest {

	public static void main(String[] args) { 
		  Scanner sc = new Scanner(System.in);
	        System.out.print("두 정수와 연산자를 입력하세요 >> ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        String operator = sc.nextLine();
	        
	        if (operator.equals(" +")) {
	            Calc calc = new Add();
	            calc.setValue(a, b);
	            System.out.println("계산 결과 = "+calc.calculate());
	}
	}
}
