package com.example.likelion.week3.Day4;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //ReadLineContext를 생성할 때 Type을 넣어서 생성을 합니다.
        //ReadLineContext를 new할 떄 파싱로직(DoSomething의 구현체를 넣어서 생성)
        ReadLineContext<PopulationMove> readLineContext =
                new ReadLineContext<>();
        List<PopulationMove> result = readLineContext.readByLine("");
    }
}