package com.example.javaprojectpushexercise;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하세요 : ");
        int money = sc.nextInt();

        System.out.println("50000원 " + money/50000);
        money %= 50000;
        System.out.println("10000원 " + money/10000);
        money %= 10000;
        System.out.println("5000원 " + money/5000);
        money %= 5000;
        System.out.println("1000원 " + money/1000);
        money %= 1000;
        System.out.println("500원 " + money/500);
        money %= 500;
        System.out.println("100원 " + money/100);
        money %= 100;
        System.out.println("50원 " + money/50);
        money %= 50;
        System.out.println("10원 " + money/10);

    }
}
