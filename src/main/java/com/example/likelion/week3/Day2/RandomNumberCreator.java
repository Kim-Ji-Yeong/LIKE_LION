package com.example.likelion.week3.Day2;

public class RandomNumberCreator implements  NumberCreator{
    @Override
    public int randomNumberCreator(){
        return  (int)(Math.random()*9);
    }
}
