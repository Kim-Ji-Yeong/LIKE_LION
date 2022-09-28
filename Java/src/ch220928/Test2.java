package ch220928;


import java.io.IOException;

//throws => 예외처리를 호출한 함수한테 맡긴다는 뜻
// JVM한테 IOException 을 던지겠다(내가 처리 안하고) = 테스트용으로 에러 처리 안하겠다.
public class Test2 {

	public static void main(String[] args) throws IOException {
		byte[] byteArr = { 'a' , 'b' , 'c' };
			
			
//			System.out.write(byteArr);

	//결국 throws 키워드는 JVM에게 예외처리를 맡긴다는 것
	//JVM이 에러처리를 한다는 건 JVM이 에러 메시지를 띄우고 프로그램을 종료하는 것
		
		
		//Throwable 을 상속받은 것은 예외클래스에는 Error 와 Exception이 있다.
		//Exception(예외클래스)은 Checked Exception과 Unchecked Exception이 있다.
		//REuntimeException은 강제로 트라이캐치안해도된다? 에러처리를 강제처리하지않는다?
		//Checked Exception은 트라이캐치로 개발자가 에러 처리해야함(컴파일에러남)대표적으로 IOException
		//Exception은 개발자가 컨트롤할 수 있는데 체크드는 쓰라이캐치로 에러처리반드시해야하고
		//런타인이셉션에 체크드는 예외처리안해도된다.
		
		
		
		
		
	}

}
