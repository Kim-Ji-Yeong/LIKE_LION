package com.example.likelion.week3.Day3.collection;

import java.util.HashMap;

public class AlphabetCnt {
    public static void main(String[] args) {
        String addr = "https://github.com/Kim-Ji-Yeong/LIKE_LION";
        HashMap<Character, Integer> alphabetCnt = new HashMap<>();

        //map 초기화 : key에 알파벳 셋팅
        for(int i = 0; i < 26; i++){
            alphabetCnt.put((char)('A'+ i), 0);
        }


        //주어진 문자열 알파벳 갯수 세서 map에 넣기
        for(int j = 0; j < addr.length(); j++) {
            char currChar = addr.charAt(j); //https://github.com/Kim-Ji-Yeong/LIKE_LION
            //알파벳인지 판단
            if(isAlphabet(currChar)){
                char currUpper = Character.toUpperCase(currChar);
                int currcnt = alphabetCnt.get(currUpper);
                alphabetCnt.put(currUpper,++currcnt);
            }
        }

        //알파벳별 개수 출력
        System.out.println(alphabetCnt);
    }
    //알파벳인지 판단하는 함수
    static boolean isAlphabet(char currChar){
        if((currChar >=65 && currChar <=90) || (currChar>=97 && currChar<=122)){ //65~90 = A~Z , 97~122 = a~z
            return true;
        }else{
            return false;
        }
    }
}