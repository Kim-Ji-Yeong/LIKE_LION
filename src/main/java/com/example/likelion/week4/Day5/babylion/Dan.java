package com.example.likelion.week4.Day5.babylion;
interface Operation{
    int operation(int a , int b);
}

public class Dan {
    public void printGugudanTemplate(int dan, String operator, Operation operation){
        for(int i=1; i<=9; i++){
            System.out.printf("%d %s %d = %d\n", dan,operator, i ,operation.operation(dan,i));
        }
    }

        public void printPlusGugu(int dan){
        printGugudanTemplate(dan,"+", new Operation(){
            @Override
            public int operation(int a,int b){
                return a + b;
            }
        });
    }
//    public void printPlusGugu(int dan) {
//        printGugudanTemplate(dan, "+", (a, b) -> a + b);
//    }
//
//    public void printMultipleGugu(int dan) {
//        printGugudanTemplate(dan, "*", (a, b) -> a * b);
//    }

    public void printMultipleGugu(int dan){
        printGugudanTemplate(dan,"*", new Operation(){
            @Override
            public int operation(int a,int b){
                return a * b;
            }
        });
    }


    public static void main(String[] args) {
        Dan dan = new Dan();
        for(int j =2; j<=9; j++){
            dan.printPlusGugu(j);
            dan.printMultipleGugu(j);
            System.out.println();
        }
//        dan.printGugudan(2);
    }
}
