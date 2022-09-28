package ch220928;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.println("a/b......a? ");
			int n1 = kb.nextInt();
		
			System.out.println("a/b.......b? ");
			int n2 = kb.nextInt();
		
			System.out.printf("%d / %d = %d \n", n1,n2, n1/n2);
		
		}catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
		}catch(Exception e) { // (예외처리는 위에서 아래로)Exception은 최고부모기때문에 
			//모든 에러를 잡아서 제일 위에있을시 밑에 케치문이 있을경우, 빨간줄이 뜸 아래 케치문은 데드코드
			e.printStackTrace(); 
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("무조건 실행");
	}
			System.out.println("Good bye~~!");
}

}
