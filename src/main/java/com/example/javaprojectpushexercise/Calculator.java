package com.example.javaprojectpushexercise;

public class Calculator {

    private int a;
    private int b;

    //ctrl + e 소스코드 파일 히스토리

    //alt + insert 생성자 추가


    public Calculator(int a,int b) {
        this.a = a;
        this.b = b;
    }

    public int plus(){
        return a+b;
    }

    public int minus(){
        return a-b;
    }

    public int multiple(){
        return a*b;
    }

    public float divide(){
        return (float) a / b;
    }
//    public void plus(int first, int second){
//        System.out.println(first + second);
//    }
//    public void minus(int first,int second){
//        System.out.println(first - second);
//    }
//    public void multiple(int first,int second){
//        System.out.println(first * second);
//    }
//    public void divide(int first,int second){
//        float result = (float)first/second;
//        System.out.println(result);
//    }
}
