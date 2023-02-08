public class DecimalToBinary {
    public static void main(String[] args) {
        toBinary(17);
    }

    public static void toBinary(int input){
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
