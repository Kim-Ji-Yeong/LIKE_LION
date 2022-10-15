package com.example.likelion.codeUp;

import java.io.*;

public class CodeUp1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        bw.write(a);
        bw.flush();
        bw.close();
    }
}
