package com.example.likelion.codeUp;

import java.io.*;

public class CodeUp1023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split("\\.");
        for(String n : num){
            bw.write(n + "\n");
        }
        bw.flush();
        bw.close();
    }
}
