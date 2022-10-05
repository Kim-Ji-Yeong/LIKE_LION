package com.example.javaprojectpushexercise.calculator;

public class RandomNumberMaker implements  NumberMaker{
    @Override
    public int make(int num){
        return (int)(Math.random()*num);
    }
}
