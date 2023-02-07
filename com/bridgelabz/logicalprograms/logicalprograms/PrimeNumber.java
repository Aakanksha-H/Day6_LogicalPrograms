package com.bridgelabz.logicalprograms.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to java logical progrmas");
        primeNumber(3);
    }

    public static boolean primeNumber(int number){
        System.out.println("Enterred number is " + number);

        if((number == 1)) {
            System.out.println("This is not a prime number");
            return false;
        }

        for(int i = 2; i * i <= number; i++) {
            if(number % i == 0) {
                System.out.println("This is not a prime number");
                return false;
            }
        }
        System.out.println("This is a prime number");
        return true;
    }
}
