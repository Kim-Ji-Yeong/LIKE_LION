package ch220930;

import java.util.Calendar;
import java.util.Scanner;

public class StringBuffer {

	public static void main(String[] args) {

		
//		Calendar now = Calendar.getInstance();
//		System.out.println(now);
//		int year = now.get(Calendar.YEAR);
//		int month = now.get(Calendar.MONTH);
//		int date = now.get(Calendar.DATE);
//		int hour12 = now.get(Calendar.HOUR);
//		int hour24 = now.get(Calendar.HOUR_OF_DAY);
//		int minute = now.get(Calendar.MINUTE);
//		int second = now.get(Calendar.SECOND);
//		
//		int miliSecond = now.get(Calendar.MILLISECOND);
//		int timeZone = now.get(Calendar.ZONE_OFFSET);
//		int lastDay = now.getActualMaximum(Calendar.DATE);
//		
//		System.out.println(year + " : " + month + " : " + date);
//		System.out.println(hour12 + " : " + hour24 + " : " + minute + " : " + second + ":" + miliSecond);
//		System.out.println(timeZone + " : " + lastDay);
		
		
		  Calendar now = Calendar.getInstance();
	        int hour = now.get(Calendar.HOUR_OF_DAY);
	        int minute= now.get(Calendar.MINUTE);
	        System.out.println("���� �ð��� " + hour +"�� " + minute +"���Դϴ�.");
	        if(4 <= hour && hour < 12) {
	            System.out.println("Good Morning");
	        }else if(hour < 18) {
	            System.out.println("Good Afternoon");
	        }else if( hour < 22) {
	            System.out.println("Good Evening");
	        }else {
	            System.out.println("Good Night");
	        }
	    }
		
//		double radian45 = Math.toRadians(45);
//		System.out.println("����45" + Math.sin(radian45));
//		System.out.println("�ڽ���45" + Math.cos(radian45));
//		System.out.println("ź��Ʈ45" + Math.tan(radian45));
//		
//		System.out.println("2�� 16�� : " + Math.pow(2, 16));
//		System.out.println("�α� 25 : " + Math.log(25));
//		
//		int num = (int) (Math.random()*100)+1;
//		System.out.println(Math.PI);
		
//		String str = "Hello";
//		String str2 = "World";
//		
//		String str3 = str.concat(str2);
//		System.out.println(str3);

		
//		StringBuilder sb= new StringBuilder("1234");
//		System.out.println();
//		System.out.println(sb.toString());
//
//		sb.append(4567);
//		sb.delete(4, 6);
//		
//		
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("���ڿ��� �Է��ϼ��� ��ĭ�̾� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
//        String str = sc.nextLine();
//
//        for (int i = 1; i < str.length(); i++) {
//            System.out.print(str.substring(i));
//            System.out.println(str.substring(0, i));
//        }
//
//        sc.close();
//    }
		
		
	}


