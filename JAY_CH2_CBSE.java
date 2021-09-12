package com.company;

import java.util.Scanner;

public class JAY_CH2_CBSE {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your physic marks: ");
        int physic=scan.nextInt();
        System.out.println("Enter your english marks:  ");
        int english=scan.nextInt();
        System.out.println("Enter your chemistry marks: ");
        int chemistry=scan.nextInt();
        System.out.println("Enter your math marks: ");
        int math=scan.nextInt();
        System.out.println("Enter your computer marks: ");
        int computer=scan.nextInt();
        float percentage=((physic+english+chemistry+math+computer)/500.0f)*100;
        System.out.println(" Percentage: ");
        System.out.println(percentage);
    }
}
