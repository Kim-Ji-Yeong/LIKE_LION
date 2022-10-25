package com.example.likelion.week5.algorithm;

public class RightTriangle {
    public static void main(String[] args) {

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        for(int i =0; i<5; i++) {
            for (int j = 0; j<i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
