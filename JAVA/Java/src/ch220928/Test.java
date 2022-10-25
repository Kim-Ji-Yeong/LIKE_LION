package ch220928;

public class Test {

	public static void main(String[] args) {
		
		//에러문구를 보여주는 주체는 JVM이다
		
		
		int a = 1; //지역변수에는 초기화가 필요.
		int b = 0;
		
		try {
			
			 b = a / b;
			System.out.println("트라이 안" +a); 
			 
		} catch (Exception e) { //Exception객체임, 객체생성은 JVM이 해줌.
									       //ArithmeticException의 부모객체가 Exception
			e.printStackTrace(); //해당문구에러 뿌려줌. 디버깅을위해 기본적으로 넣어줌(에러체크하기위해)
			
			System.out.println("케치" + a);
			System.out.println("케치" + b);
		
		}finally {
			System.out.println("파이널리입니다.");
		}
		
		System.out.println("트라이케치 바깥");
		System.out.println(a);

	}

}
