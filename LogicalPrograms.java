import java.util.Scanner;

public class LogicalPrograms {
    public static void main(String[] args) {
        System.out.println("Welcome to java logical progrmas");
        fabonacciSeries();
    }

    public static void fabonacciSeries(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you till you want series");
        int number = scanner.nextInt(), firstNumber = 0, secondNumber = 1;


        while (firstNumber <= number){
            System.out.println("Fibonacci Series till " + number + " is as follows:" + '\n' + firstNumber + " ,");

            int nextTerm = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextTerm;
        }
    }
}
