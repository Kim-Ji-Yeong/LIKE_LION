package com.example.likelion.week3.Day4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class PopulationStatistics {

//    public void readByChar(String filename) throws IOException {
//        FileReader fileReader = new FileReader(filename);
//        // 파일을 읽지 않는다.
//
//        String fileContents = "";
//        while(fileContents.length() < 1_000_000){
//            char c = (char)fileReader.read();
//            fileContents += c;
//            System.out.println(fileContents);
//        }
//        System.out.println(fileContents);
//        // 1byte 읽기
//        // 1줄 씩 읽는 기능
//    }

    //한줄 씩 읽기
    public List<PopulationMove> readByLine(String filename) throws IOException {
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str = reader.readLine()) != null) {
//            System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
    }
    // while문 안에서 string을 PopulationMove로 parsing하여 pml에 add한다.
    // 루트가 끝나면(파일을 모두 읽어서 파싱을 끝냈으면) return한다.

    public void readAllLines(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
        List<PopulationMove> pms = lines.parallelStream()
                .map(item -> {
                    String[] splittedLine = item.split(",");
                    return new PopulationMove(splittedLine[0],splittedLine[6]);
                }).collect(Collectors.toList());
        for(PopulationMove pm : pms){
            System.out.println(pm.getFromSido());
        }
    }

//Files.newBufferedReader의 첫번째 매개변수에는 Path타입의 파일경로가 들어가야한다.
//그래서 Paths.get(String filename)메소드를 이용해 filename경로를 Path타입으로 리턴하게 한다.
    //모던 스타일
   public void readByLine2(String filename) {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }


    public void readByLine3(String filename) throws IOException {
        BufferedReader br= Files.newBufferedReader(
                Paths.get(filename),StandardCharsets.UTF_8);{
            String line;
            while((line = br.readLine())!= null){
                System.out.println(line);
            }
        }
    }


    public PopulationMove parse(String data){
        String[] splittedLine = data.split(",");
//        int fromSido =
        return new PopulationMove(splittedLine[0],splittedLine[1]); // from ,to
    }

    public void createAFile(String filename){
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // List<String>을 지정한 파일에 write
    public void write(List<String> strs, String filename){
        File file = new File(filename);

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for(String str : strs){
                writer.write(str);
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido()+ "," + populationMove.getToSido()+"\n";
    }

    // 1. List<PopulationMove>를 순환하면서 "11,26" 이런 형태의 key를 만든다.
    // 2. moveCntMap에서 해당 key에 해당하는 Object가 없으면 생성하고 1이라고 check한다.
    // 3. key로 꺼내서 +1
    // 4. 리턴 moveCntMap
    public Map<String,Integer> getMoveCntMap(List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }


    public static void main(String[] args) throws IOException {
        String address = "./from_to.txt";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);

        Map<String,Integer> map = populationStatistics.getMoveCntMap(pml);
        String targetFilename = "for_heatmap.txt";
        populationStatistics.createAFile(targetFilename);
        List<String> cntResult = new ArrayList<>();
        for(String key : map.keySet()){
            String[] fromto = key.split(",");
            // 매핑을 해서 저장
            String s = String.format("[%s,%s,%d]\n",fromto[0],fromto[1],map.get(key));
            cntResult.add(s);
//            System.out.printf("key : %s valeu : %d\n",key,map.get(key));
        }
        populationStatistics.write(cntResult,targetFilename);
//        Set<Integer> sidoCodes = new HashSet<>();
//        List<String> strings = new ArrayList<>();
//        for(PopulationMove pm : pml){
//            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(),pm.getToSido());
//            sidoCodes.add(pm.getFromSido());
//            sidoCodes.add(pm.getToSido());
//            String fromTo = populationStatistics.fromToString(pm);
//            strings.add(fromTo);
        }
//        System.out.println(sidoCodes);
//        System.out.println(strings.size());
//        System.out.println(pml.size());
//        populationStatistics.createAFile("./from_to.txt");

//          populationStatistics.write(strings,"./from_to.txt");
    }

