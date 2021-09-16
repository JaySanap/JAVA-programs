package com.company;
import java.util.Scanner;
public class JAY_switchcase2 {
    public static void main(String[] args) {
        int age;
        System.out.println(" Enter Your Age ");
        Scanner sc=new Scanner(System.in);
        age= sc.nextInt();
        switch (age){
            case 18:
                System.out.println(" You are adult! ");
                break;
            case 23:
                System.out.println(" You will get a job! ");
                break;
            case 60:
                System.out.println(" You will get reteried! ");
                break;

            default:
                System.out.println(" Enjoy your life! ");
        }
    }
}
