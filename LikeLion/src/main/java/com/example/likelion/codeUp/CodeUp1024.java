package com.example.likelion.codeUp;

import java.io.*;

public class CodeUp1024 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] word = br.readLine().split("");

        for (String w : word) {
            bw.write("'" + w + "'" + "\n");
        }
        bw.flush();
        bw.close();

        }
    }
