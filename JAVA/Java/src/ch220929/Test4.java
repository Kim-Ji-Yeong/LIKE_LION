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
				if (st.equals("�׸�")) {
					System.out.println("����");
					break;
				}
				String[] words = st.split(" ");
				System.out.println("���� ������ " + words.length);
				
				
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("���α׷��� ���Ӱ� �����մϴ�.");  
				continue;
				
			}
	    
		}
	}
	}

