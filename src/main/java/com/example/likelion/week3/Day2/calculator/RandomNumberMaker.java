package com.example.likelion.week3.Day2.calculator;

public class RandomNumberMaker implements  NumberMaker{
    @Override
    public int make(int num){
        return (int)(Math.random()*num);
    }
}
