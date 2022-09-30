package ch220930;

import java.math.BigInteger;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		ArrayList<Integer> arr = null;
	
		Integer n1 = Integer.valueOf(5);
		int n2 = Integer.valueOf("1234");  //알아보기
		System.out.println("큰 수" + Integer.max(n1,n2));
		System.out.println("큰 수" + Integer.min(n1,n2));
		System.out.println("합 : " +  Integer.sum(n1, n2));
		
		System.out.println("2진 표현 " + Integer.toBinaryString(12));
		System.out.println("8진 표현 " + Integer.toOctalString(12));
		System.out.println("16진 표현 " + Integer.toHexString(12));
		
		System.out.println("정수의 최대값" + Integer.MAX_VALUE);
		System.out.println("정수의 최대값" + Integer.MIN_VALUE);
		
		System.out.println("LONG 최대값" + Long.MAX_VALUE);
		System.out.println("LONG 최소값" + Long.MAX_VALUE);
		
		BigInteger big1 = new BigInteger("10000000000000000000000");
		BigInteger big2 = new BigInteger("-9999999999999999999999");
		
		BigInteger result = big1.add(big2);
		System.out.println(result);
		
		result =  big1.multiply(big2);
		System.out.println(result);
		
		
		
	}
}
