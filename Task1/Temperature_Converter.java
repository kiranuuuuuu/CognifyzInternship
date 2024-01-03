package com.internship;
import java.util.Scanner;
public class Temperature_Converter {

    void Converter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select One Among The Following Two");
        System.out.println("1.Celsius To Fahrenheit");
        System.out.println("2.Fahrenheit To Celsius");
        int choice = sc.nextInt();
        if(choice==1){
            System.out.println("Enter The Temperature To Convert To Fahrenheit");
            float Temperature = sc.nextFloat();
            System.out.println("The Converted Temperature is "+(Temperature*9/5+32+"F"));
        }else if(choice==2){
            System.out.println("Enter The Temperature To Convert To Celsius");
            float Temperature = sc.nextFloat();
            System.out.println("The Converted Temperature is "+((Temperature-32)*5/9+"C"));
        }else{
            System.out.println("Invalid Choice");
        }
    }
    public static void main(String[] args) {
        new Temperature_Converter().Converter();
    }
}
