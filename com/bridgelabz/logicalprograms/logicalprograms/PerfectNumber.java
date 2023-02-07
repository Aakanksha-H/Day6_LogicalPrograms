package com.bridgelabz.logicalprograms.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
    public void perfectNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int sum = 0;
        int temp = 1;

        while(temp <= number/2)
        {
            if(number % temp == 0)
            {
                sum += temp;
            }
            temp++;
        }
        if (number == sum){
            System.out.println("This is perfect number");
        } else if (number <= 0){
            System.out.println("Please enter positive number");
        } else {
            System.out.println("This is not a perfect number");
        }
    }
}
