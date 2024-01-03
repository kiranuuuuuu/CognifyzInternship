package com.internship;
import java.util.Scanner;

public class Student_Grade_Calculator {
       void meth(){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter The Number Of Grades");
           int size = sc.nextInt();
           int[] arr = new int[size];
           System.out.println("Enter Each Grade");
           for (int i = 0; i < arr.length;i++){
               arr[i]= sc.nextInt();
           }
           double sum = 0;
           for (double x: arr ){
               sum = sum+x;
           }
           sum = sum/size;
           System.out.println("The Average marks is "+ sum);

       }
    public static void main(String[] args) {
        new Student_Grade_Calculator().meth();

    }
}
