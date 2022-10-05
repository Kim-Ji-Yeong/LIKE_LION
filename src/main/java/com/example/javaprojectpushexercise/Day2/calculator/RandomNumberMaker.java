package com.example.javaprojectpushexercise.Day2.calculator;

public class RandomNumberMaker implements  NumberMaker{
    @Override
    public int make(int num){
        return (int)(Math.random()*num);
    }
}
