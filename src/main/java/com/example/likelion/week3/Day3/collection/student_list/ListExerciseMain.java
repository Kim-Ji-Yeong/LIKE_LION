package com.example.likelion.week3.Day3.collection.student_list;

import java.util.List;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();
//        listExercise.students.add("김나나"); //private 으로 해줘야함

        List<String> students = listExercise.getStudents();
        for(String student : listExercise.getStudents()){
            System.out.println(student);
        }
        System.out.println(students.size());
    }

}
