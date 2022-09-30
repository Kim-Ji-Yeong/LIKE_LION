package ch220929;

public class Test {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		
		String s3 = new String("java");
		String s4 = new String("java");

		if(s1 == s2) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		if(s3 == s4) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		if(s3.equals(s4)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}

}
