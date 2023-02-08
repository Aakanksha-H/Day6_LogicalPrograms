import java.util.Scanner;

public class Binary {
    static int input;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        input = scanner.nextInt();

        toBinary();
        isPowerOfTwo();
        swapNibbles();
    }

    static int swapNibbles() {
        int swapNibbles = ((input & 0x0F) << 4 | (input & 0xF0) >> 4);
        System.out.println("The input is " + input + "Swapnibbles is " + swapNibbles);
        return swapNibbles;
    }

    static boolean isPowerOfTwo() {
        if (input == 0)
            return false;

        while (input != 1) {
            if (input % 2 != 0)
                return false;
            System.out.println("This is not a power of 2");
            input = input / 2;
            System.out.println("This is a power of 2");
        }
        return true;
    }

    public static void toBinary(){
        int [] binaryNum = new int[100];
        for (int i = 0; i < input; i++) {
            binaryNum[i] = input % 2;
            input = input / 2;
            i++;

            for (int j = i - 1; j >= 0; j--) {
                System.out.print("Input number is " + input + '\n' + "The binary num is " + binaryNum[j]);
            }
        }
    }
}
