package com.example.likelion.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TxtMain {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\proje\\Desktop", "Test.txt");
        BufferedReader br;

        try {
            FileReader reader = new FileReader(file);
            br= new BufferedReader(reader);

//            System.out.println(br.readLine()); // 한줄만 읽어왔을 때
            
            String line;
            String result ="";
            while((line = br.readLine()) != null){
                result += line+ "\n";
            }
            System.out.println(result);


        }catch (Exception e) {

        }
    }
}
