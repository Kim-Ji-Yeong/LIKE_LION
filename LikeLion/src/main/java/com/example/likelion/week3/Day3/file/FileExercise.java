package com.example.likelion.week3.Day3.file;

import java.io.FileReader;
import java.io.IOException;

public class FileExercise {
    private  String filename;


    public String readNChars(int N) throws  IOException{
        FileReader fileReader = new FileReader(this.filename);
        String str=  "";
        for(int i =0; i<N; i++){
            int asciiCd = fileReader.read();
            if(asciiCd == -1){
                return str;
            }
            str += (char) asciiCd;
        }
        return str;
    }
//    public void printFiles() {
//        File dir = new File("./");
//        File files[] = dir.listFiles();
//        System.out.println(files[0]);
//        for (File file : files) {
//            System.out.println(file);
//        }
//    }
//
//    public char readAChar(String filename) throws IOException {
//        FileReader fileReader = new FileReader("./a_file.txt");
//        return (char) fileReader.read();
//    }

//    public String read2Chars(String filename) throws  IOException{
//        FileReader fileReader = new FileReader(filename);
//        String str=  "";
//        str += (char) fileReader.read();
//        str += (char) fileReader.read();
//        return str;
//    }


    public static void main(String[] args) throws IOException {

//        FileExercise fileExercise = new FileExercise();
////        char c = fileExercise.readAChar("a_file.txt");
//        String str = fileExercise.read2Chars("a_file.txt");
//        System.out.println(str);
//         FileExercise fileExercise = new FileExercise("a_file.txt");

    }
}
    /*.\.git
    .\.git
    .\.gitignore
    .\.gradle
    .\.idea
    .\a_file.txt
    .\build
    .\build.gradle
    .\gradle
    .\gradlew
    .\gradlew.bat
    .\HELP.md
    .\settings.gradle
    .\src*/

