package com.bridgelabz.logicalprograms.logicalprograms;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to java logical progrmas");
        reverseNumber(452);
    }

    public static void reverseNumber(int number){
        int reverseNUmber = 0;
        System.out.println("Enterred number is " + number);
        while (number != 0){
            int reminder = number % 10;
            reverseNUmber = reverseNUmber * 10 + reminder;
            number /= 10;
        }

        System.out.println("The reverse number is " + reverseNUmber);
    }
}
