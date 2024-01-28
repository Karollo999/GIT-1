import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeChecker {
    private FileManager fileManager;
    private ArrayList<String> palindromes;
    private ArrayList<String> nonPalindromes;

    public PalindromeChecker() {
        fileManager = new FileManager();
        palindromes = new ArrayList<>();
        nonPalindromes = new ArrayList<>();
    }

    public void checkPalindromes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words to check for palindromes (type 'exit' to finish):");

        String word;
        while (!(word = scanner.nextLine()).equals("exit")) {
            if (isPalindrome(word)) {
                palindromes.add(word);
            } else {
                nonPalindromes.add(word);
            }
        }

        fileManager.writeToFile("palindromes.txt", palindromes);
        fileManager.writeToFile("nonPalindromes.txt", nonPalindromes);

        scanner.close();
    }

    public boolean isPalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversedWord);
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        checker.checkPalindromes();
    }
}