package com.company;
import java.util.Scanner;
public class JAY_PRSET4Q1 {
    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter your physics marks ");
        m1=sc.nextInt();
        System.out.println(" Enter your chemistry marks ");
        m2= sc.nextInt();
        System.out.println(" Enter your maths marks ");
        m3= sc.nextInt();
        float avg=(m1+m2+m3/3.0f);
        System.out.println(" Your overall percentage:"+avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
            System.out.println(" Congrulation; You have been promoted");
        }
        else{
            System.out.println(" Sorry; You have not been promoted");
        }
        }
    }
