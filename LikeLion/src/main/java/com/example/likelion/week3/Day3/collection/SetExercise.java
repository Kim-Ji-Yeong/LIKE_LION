package com.example.likelion.week3.Day3.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(); //tree set
        // set 중복을 허용하지 않음
        set1.add("김지영");
        set1.add("김지영");
        set1.add("공지철");

        // set에 넣어서 중복 검사를 할 수 있음
        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);

        System.out.println(set1);
        System.out.println(setInteger);
    }
}
