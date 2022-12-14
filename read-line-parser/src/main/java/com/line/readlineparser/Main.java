package com.line.readlineparser;

import com.line.readlineparser.domain.Hospital;
import com.line.readlineparser.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileController<Hospital> hospitalFileController = new FileController<>(new HospitalParser());
        String filename = "C:\\Users\\proje\\Desktop\\seoul_hospitals_infos.csv";
        List<Hospital> hospitals = hospitalFileController.readLines(filename);

        List<String> sqlStatements = new ArrayList<>();
        for(Hospital hospital: hospitals){
            sqlStatements.add(hospital.getSqlInsertQuery());
        }
        String sqlFilename = "seoul_hospital_insert.sql";
        hospitalFileController.createANewFile(sqlFilename);
        hospitalFileController.writeLines(sqlStatements,sqlFilename);


//        System.out.println(hospitals.size());
//        List<String> lines = new ArrayList<>();
//        for(Hospital hospital : hospitals){
//            lines.add(hospital.getSqlInsertQuery());
////            System.out.printf("%s,%s,%s,%s,%d,%s,%s\n",
////                    hospital.getId(),hospital.getAddress(),hospital.getDistrict()
////            ,hospital.getCategory(),hospital.getEmergencyRoom(),hospital.getName(),
////                    hospital.getSubdivision());
//        }
//        String sqlFilename = "hospital_insert.sql";
//        hospitalFileController.createANewFile(sqlFilename);
//        hospitalFileController.writeLines(lines,sqlFilename);
    }
}
