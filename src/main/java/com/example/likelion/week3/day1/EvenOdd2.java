package com.example.likelion.week3.day1;

public class EvenOdd2 {
    public static String getEvenOdd(int num){
        //숫자를 받아서 짝수면 '짝수'리턴 홀수면 '홀수'리턴
        if(num % 2 ==0){
            return "짝수";
        }else{
            return "홀수";
        }

    }

    public static void main(String[] args) {
        int firstNum = 2;
        int secondNum = 3;
        int resultNum = firstNum + secondNum;

        String sFirstNum = getEvenOdd(firstNum);
        System.out.println("+");
        String sSecondNum = getEvenOdd(secondNum);
        System.out.println("=");
        String sResultNum = getEvenOdd(resultNum);
        System.out.printf("%s+%s=%s",sFirstNum,sSecondNum,sResultNum);
    }
}
