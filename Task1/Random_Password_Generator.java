package com.internship;
import java.security.SecureRandom;
import java.util.Scanner;
public class Random_Password_Generator {
      public String Random(){
          System.out.println("Enter The Size Of The Password According To The Requriement ");
          Scanner sc = new Scanner(System.in);
          int length = sc.nextInt();
          final String var = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&";
          SecureRandom sr = new SecureRandom();
          StringBuilder sb = new StringBuilder();
          for (int i = 0; i<length; i++){
              int randomIndex = sr.nextInt(var.length());
              sb.append(var.charAt(randomIndex));
          }
          return sb.toString();
      }
    public static void main(String[] args) {
        System.out.println(new Random_Password_Generator().Random());
    }
}
