package com.example.javaprojectpushexercise.Day1;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("금액을 입력하세요 : ");

//        int[] currencyType = new int[]{50000,10000,5000,1000,500,100,50,10};

        int money;

        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 넣어주세요: ");

        money = sc.nextInt();

        int money50000 = 50000;
        int money10000 = 10000;
        int money5000 = 5000;
        int money1000 = 1000;
        int money500 = 500;
        int money100 = 100;
        int money50 = 50;
        int money10 = 10;

        System.out.printf("50000원 몫: %d, 나머지: %d\n" , money/money50000, money%money50000);
        money = money % money50000;
        System.out.printf("10000원 몫: %d, 나머지: %d\n" , money/money10000, money%money10000);
        money = money % money10000;
        System.out.printf("5000원 몫: %d, 나머지: %d\n" , money/money5000, money%money5000);
        money = money % money5000;
        System.out.printf("1000원 몫: %d, 나머지: %d\n" , money/money1000, money%money1000);
        money = money % money1000;
        System.out.printf("500원 몫: %d, 나머지: %d\n" , money/money500, money%money500);
        money = money % money500;
        System.out.printf("100원 몫: %d, 나머지: %d\n" , money/money100, money%money100);
        money = money % money100;
        System.out.printf("50원 몫: %d, 나머지: %d\n" , money/money50, money%money50);
        money = money % money50;
        System.out.printf("10원 몫: %d, 나머지: %d\n" , money/money10, money%money10);

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
