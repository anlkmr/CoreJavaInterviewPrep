package com.java.CoreJavaInterviewPrep.lamda;



interface  Lambda{
    public void demo();

}







public class Lamda1 {


    public static void main(String[] args) {
        Lambda lambda = () -> System.out.println("Statement 01");

        lambda.demo();
    }
}
