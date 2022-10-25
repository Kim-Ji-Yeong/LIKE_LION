package com.example.likelion.week3.Day3.collection.randomNumberSet;

public class RandomNumberGenerator implements NumberGenerator{


    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
