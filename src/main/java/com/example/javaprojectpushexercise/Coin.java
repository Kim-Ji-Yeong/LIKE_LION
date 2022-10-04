package com.example.javaprojectpushexercise;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("금액을 입력하세요 : ");

//        int[] currencyType = new int[]{50000,10000,5000,1000,500,100,50,10};

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int money = 25000;

        System.out.printf("%d원 %d장 나머지 %d원\n", curr50000, money / curr50000, curr50000);
        money = money % curr50000;
        System.out.printf("%d원 %d장 나머지 %d원\n", curr10000, money / curr10000, curr10000);
        money = money % curr10000;
        System.out.printf("%d원 %d장 나머지 %d원\n", curr5000, money / curr5000, curr5000);
        money = money % curr5000;
        System.out.printf("%d원 %d장 나머지 %d원\n", curr1000, money / curr1000, curr1000);
        money = money % curr1000;
        System.out.printf("%d원 %d장 나머지 %d원\n", curr500, money / curr500, curr500);





//        int money = sc.nextInt();

//        System.out.println("50000원 " + money/50000);
//        money %= 50000;
//        System.out.println("10000원 " + money/10000);
//        money %= 10000;
//        System.out.println("5000원 " + money/5000);
//        money %= 5000;
//        System.out.println("1000원 " + money/1000);
//        money %= 1000;
//        System.out.println("500원 " + money/500);
//        money %= 500;
//        System.out.println("100원 " + money/100);
//        money %= 100;
//        System.out.println("50원 " + money/50);
//        money %= 50;
//        System.out.println("10원 " + money/10);

    }
}
