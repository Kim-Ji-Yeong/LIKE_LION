package com.example.likelion.week3.Day3.collection.randomNumberSet;

import java.util.HashSet;

public class RadNumbersWithoutDuplicated {

    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        HashSet<Integer> numbers =new HashSet<>();

        for(int i =0; i< 50; i++){
           int r = randomNumberGenerator.generate(20);
            numbers.add(r);
        }
        System.out.println(numbers);
        System.out.println(numbers.size());



    }
}
