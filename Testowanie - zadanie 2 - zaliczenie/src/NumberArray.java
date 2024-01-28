import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class NumberArray {
    private int[] numbers;
    private int maxNumber;

    public NumberArray(int length, int maxNumber) {
        this.numbers = new int[length];
        this.maxNumber = maxNumber;
    }

    public void generateNumbers() {
        Random random = new Random();
        for (int i = 0; i < this.numbers.length; i++) {
            this.numbers[i] = random.nextInt(this.maxNumber + 1);
        }
    }

    public void printNumbers() {
        for (int number : this.numbers) {
            System.out.println(number);
        }
    }

    public void saveNumbersToFile(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (int number : this.numbers) {
                bw.write(Integer.toString(number));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getMaxNumber() {
        return maxNumber;
    }
}