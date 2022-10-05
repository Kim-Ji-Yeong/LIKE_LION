package com.example.javaprojectpushexercise;

public class Calculator {
    //ctrl + e 소스코드 파일 히스토리
    public void plus(int first,int second){
        System.out.println(first + second);
    }
    public void minus(int first,int second){
        System.out.println(first - second);
    }
    public void multiple(int first,int second){
        System.out.println(first * second);
    }
    public void divide(int first,int second){
        float result = (float)first/second;
        System.out.println(result);
    }
}
