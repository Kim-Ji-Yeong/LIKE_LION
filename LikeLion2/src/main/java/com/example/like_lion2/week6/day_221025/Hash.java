package com.example.like_lion2.week6.day_221025;

public class Hash {
    public int hash(String str) {
        int ascii = 0;
        for(int i = 0; i<str.length(); i++) {
            ascii += str.charAt(i);
        }
        return ascii % 1000;
    }
}