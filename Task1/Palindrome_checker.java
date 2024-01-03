package com.internship;
import java.util.Scanner;
public class Palindrome_checker {
       public Boolean Checking(){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter The String");
           String s1 = sc.nextLine();
           String s2 = s1.toLowerCase();
           StringBuilder s3 = new StringBuilder();
           for (int i  = 0; i<s2.length(); i++){
               if(Character.isLetter(s1.charAt(i))|| Character.isDigit(s1.charAt(i))){
                   s3.append(s2.charAt(i));
               }
           }
           int n = s3.length()-1;
           for (int i = 0; i<s3.length()/2;i++){
               if(s3.charAt(i)!=s3.charAt(n-i))
                   return false;
           }
           return true;
       }
    public static void main(String[] args) {
        System.out.println(new Palindrome_checker().Checking());
    }
}
