package com.example.likelion.codeUp;

import java.io.*;

public class CodeUp1025 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split("");
        for (int i = 0; i < arr.length; i++) {   //75264
            System.out.print(String.format("[%s", arr[i]));
            for (int j = arr.length - 1; j > i; j--) {
                System.out.print(String.format("%d", 0));
            }
            System.out.println("]");
        }
    }
}
