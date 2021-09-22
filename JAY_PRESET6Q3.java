package com.company;

public class JAY_PRESET6Q3 {
    public static void main(String[] args) {
        int[] marks = {80,90,30,40};
        int sum =0;
        for (int element:marks){
            sum=sum+element;
        }
        System.out.println(" value of average marks is "+sum/ marks.length);
    }
}

