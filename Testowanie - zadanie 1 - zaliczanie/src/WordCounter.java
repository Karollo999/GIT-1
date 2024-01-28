// WordCounter.java
import java.io.*;
import java.util.*;

public class WordCounter {

    private Map<String, Integer> wordCounts;

    public WordCounter() {
        wordCounts = new HashMap<>();
    }

    public void countWords(String sentence) {
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
    }

    public void displayWordCount() {
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + "-(" + entry.getValue() + ")");
        }
    }

    public void writeWordCountToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                writer.println(entry.getKey() + "-(" + entry.getValue() + ")");
            }
        } catch (FileNotFoundException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with at least 5 words:");
        String sentence = scanner.nextLine();

        while (sentence.split("\\s+").length < 5) {
            System.out.println("The sentence must have at least 5 words. Please try again:");
            sentence = scanner.nextLine();
        }

        wordCounter.countWords(sentence);
        wordCounter.displayWordCount();
        wordCounter.writeWordCountToFile("word_counts.txt");
    }
}