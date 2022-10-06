package com.example.javaprojectpushexercise.Day3.collection.randomAlphbetSet;

public class RandomAlphabet implements Generator{
    @Override
    public char generate() {
        return (char) ((int) (Math.random() * 26) + 65);
    }
}