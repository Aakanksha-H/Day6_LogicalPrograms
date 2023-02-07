import java.util.Scanner;

public class MinmunNoOfNotes {

    public static void main(String[] args) {
        min();
    }

    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = scanner.nextInt();
        while (amount != 0) {
            System.out.println("Enter the amount");
            int total = scanner.nextInt();
            int note_count = 0;
            int[] arr = {1, 2, 5, 10, 20, 50, 100, 500, 1000, 2000};
            for (int i = 9; i >= 0; i--) {
                if (arr[i] <= total) {
                    note_count += total / arr[i];
                    total %= arr[i];
                }
            }
            System.out.println("The number of notes return " + note_count);
            amount--;
        }
    }
}