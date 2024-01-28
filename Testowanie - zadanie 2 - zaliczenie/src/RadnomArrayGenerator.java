import java.util.Scanner;

public class RandomNumberArrayGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        System.out.print("Enter the maximum number for generation: ");
        int maxNumber = scanner.nextInt();
        scanner.close();

        NumberArray array = new NumberArray(length, maxNumber);
        array.generateNumbers();
        array.printNumbers();
        array.saveNumbersToFile("randomNumbers.txt");
    }
}