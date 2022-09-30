package ch220929;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test4 {

	public static void main(String[] args) {
	 
		Scanner sc= new Scanner(System.in);
		
		while(true) {
		 
			try {
				System.out.print(">>");
				String st = sc.nextLine();
				if (st.equals("그만")) {
					System.out.println("종료");
					break;
				}
				String[] words = st.split(" ");
				System.out.println("어절 갯수는 " + words.length);
				
				
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("프로그램을 새롭게 시작합니다.");  
				continue;
				
			}
	    
		}
	}
	}

