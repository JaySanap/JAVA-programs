package com.company;

public class JAY_PRESET6Q2 {
    public static void main(String[] args) {
        int [] marks={1,2,3,4,5};
        int num=3;
        boolean isInArray=false;
        for (int element:marks){
            if (num==element){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println(" The value is present in Array");
        }
        else{
            System.out.println(" The value is not present in Arrayy ");
        }
    }
}
