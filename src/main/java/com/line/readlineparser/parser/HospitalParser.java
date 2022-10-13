package com.line.readlineparser.parser;

import com.line.readlineparser.domain.Hospital;

public class

HospitalParser implements Parser<Hospital> {

    private String getSubdvision(String name){
        String[] subdvisions = {"내과", "외과", "소아과", "피부과", "성형외과", "정형외과", "산부인과", "관절", "봉합", "화상", "골절", "영유아", "안과", "가정의학과", "비뇨기과", "치과"};
        for(String subdvision : subdvisions){
            if(name.contains(subdvision)){
                return subdvision;
            };
        }

        return "";
    }

    @Override
    public Hospital parse(String str) {
        str =str.replaceAll("\"","");
        String[] splitted = str.split(",");

        String name =splitted[10];
        String subdvision= getSubdvision(name);

        return new Hospital(splitted[0],splitted[1],splitted[2],
                Integer.parseInt(splitted[6]),name,subdvision);
    }
}