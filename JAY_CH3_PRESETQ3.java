package com.company;

public class JAY_CH3_PRESETQ3 {
    public static void main(String[] args) {
        String letter="Dear<|name|>,Thanks a lot!";
        letter=letter.replace("<|name|>", " Jay ");
        System.out.println(letter);
    }
}
