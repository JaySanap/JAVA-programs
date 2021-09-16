package com.company;
import java.util.Scanner;
public class JAY_SWITCHCASE1 {
    public static void main(String[] args) {
        int age;
        System.out.println(" Enter your age ");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if (age>56){
            System.out.println(" You are experinced!");
        }
        else if(age>46){
            System.out.println(" You are semi experinced! ");
        }
        else if(age>36){
            System.out.println(" You are semi semi experinced! ");
        }
        else{
            System.out.println(" You are not experinced! ");
        }
    }
}
