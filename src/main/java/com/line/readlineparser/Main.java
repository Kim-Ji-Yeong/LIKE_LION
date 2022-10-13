package com.line.readlineparser;

import com.line.readlineparser.domain.Hospital;
import com.line.readlineparser.parser.HospitalParser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "C:\\Users\\proje\\Desktop\\서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        System.out.println(hospitals.size());
        for(Hospital hospital : hospitals){
            System.out.println(hospital.getId());
        }
    }
}
