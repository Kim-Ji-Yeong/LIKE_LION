package com.example.likelion.week3.Day3.collection.student_list;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students; //private로 해야함

    public ListExercise(){
        this.students = new ArrayList<>(); //생성자에서 new해도됨 생성자가 제일 먼저 만들어지니
        this.students.add("김지영");
        this.students.add("최우식");
        this.students.add("박지민");
        this.students.add("차은우");
    }


    public List<String> getStudents(){
        return this.students;
    }
}
