package com.example.likelion.week4.Day5.algorithm;

public class Solution {
    public int solution(int n) {
        String str = String.valueOf(n);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return result;
    }
}
//    public static void main(String[] args) {
//        int answer = 0;
//
//            while (true) {
//                answer += n % 10;
//                if (n < 10)
//                    break;
//
//                n = n / 10;
//            }
//
//
//            System.out.println("Hello Java");
//
//            return answer;
//        }
//    }

