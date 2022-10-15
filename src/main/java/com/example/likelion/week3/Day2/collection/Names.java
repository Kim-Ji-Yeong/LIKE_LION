package com.example.likelion.week3.Day2.collection;



import java.util.ArrayList;
import java.util.List;

public class Names {
    private List<String> students = new ArrayList<>();
    private List<Student> studentObjs = new ArrayList<>();


    public List<Student> getStudetObjs(){
        this.studentObjs.add(new Student(1,"김경록","https://github.com/Kyeongrok/like-lion-java"));
        this.studentObjs.add(new Student(1,"권하준","https://github.com/dongyeon-0822/java-project-exercise"));
        this.studentObjs.add(new Student(1,"조성윤","https://github.com/kang-subin/Java"));
        this.studentObjs.add(new Student(3,"안예은","https://github.com/KoKwanwun/LikeLion.git"));
        this.studentObjs.add(new Student(1,"남우빈","https://github.com/lcomment/Algorithm_Solution--Java/tree/main/LikeLion"));



        return this.studentObjs;
    }


    public List<String> names(){
        this.students.add("조성윤");
        this.students.add("안예은");
        this.students.add("남우빈");
        this.students.add("최경민");
        this.students.add("안준휘");
        this.students.add("하채민");
        this.students.add("허도한");
        this.students.add("배태훈");
        this.students.add("정해성");
        this.students.add("하찬희");
        this.students.add("박도아");
        this.students.add("유경준");
        this.students.add("고다니");
        this.students.add("하이안");
        this.students.add("고유호");
        this.students.add("전민찬");
        this.students.add("배강");
        this.students.add("유서이");
        this.students.add("황도빈");
        this.students.add("강규진");
        this.students.add("임예린");
        this.students.add("양예온");
        this.students.add("곽윤재");
        this.students.add("한단");
        this.students.add("박강현");
        this.students.add("윤성민");
        this.students.add("박재윤");
        this.students.add("서현준");
        this.students.add("노유주");
        this.students.add("전율");
        this.students.add("노아린");
        this.students.add("권아윤");
        this.students.add("송태서");
        this.students.add("정라온");
        this.students.add("서서한");
        this.students.add("문주호");
        this.students.add("오세아");
        this.students.add("이호영");
        this.students.add("손윤아");
        this.students.add("이동우");
        this.students.add("남혜준");
        this.students.add("황솔");
        this.students.add("권은재");
        this.students.add("곽준휘");

        return this.students;
    }
}
