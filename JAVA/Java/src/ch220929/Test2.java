package ch220929;

import java.util.Scanner;

public class Test2 {
	
//	public static int stringCount(String[] arr) {
//	int count = 0;
//	for(int i = 0; i<arr.length; i++) {
//		count += arr[i].length();
//	}
//	return count;
	public static int stringCount(String[] strArr) {
		int count = 0;
		for (String str : strArr) {
			count += str.length();
		}
		return count;

	}

	public static void main(String[] args) {

		String[] strArr = { "��", "����", "����", "�ܿ�" };
		int total = stringCount(strArr);
		System.out.println(total);
	}

//	String subject = "�ڹ� ���α׷���";
//	char charValue = subject.charAt(3);
//	System.out.println(charValue);

//	Scanner sc = new Scanner(System.in);
//	char ch = sc.next().charAt(0);

//	System.out.println(ch);

//	String str = "The cat is on the table";
//	int index = str.indexOf("table1");
//	//��Ī���� ������ -1�� ���ϵ�
//
//	if(index == -1) {
//		System.out.println("ã�� ���ڿ��� �����ϴ�.");
//	}
//	
//	System.out.println(str.length());
//	
//	System.out.println(index);
//	

}
