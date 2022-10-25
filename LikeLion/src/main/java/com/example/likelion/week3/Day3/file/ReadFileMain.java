package com.example.likelion.week3.Day3.file;

public class ReadFileMain {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile("./a_file.txt");

        System.out.println("한글자 : " +readFile.readByte()); //한글자
        System.out.println("두글자 : "+readFile.readTwoByte());
        System.out.println("n글자 : "+readFile.readString(5));
    }
}
