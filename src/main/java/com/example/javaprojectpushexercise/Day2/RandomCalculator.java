package com.example.javaprojectpushexercise.Day2;

public class RandomCalculator {
 private int randonTo;
 private NumberCreator random;


 public RandomCalculator(NumberCreator random){
     this.randonTo =random.randomNumberCreator();
 }
 public void plus(int a){
     System.out.println(a+ randonTo);
 }
 public void minus(int a){
     System.out.println(a - randonTo);
 }
 public void mutiple(int a){
     System.out.println(a * randonTo);
 }
 public void divide(int a){
     try {
         float divide=(float)a/randonTo;
         System.out.println(divide);
     }catch (Exception e){
         System.out.println("랜덤하게 생성된 숫자가 0입니다.");
     }
 }
}
