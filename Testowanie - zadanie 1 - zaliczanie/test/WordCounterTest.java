// WordCounterTest.java
import org.junit.jupiter.api.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordCounterTest {

    private WordCounter wordCounter;

    @BeforeEach
    public void setUp() {
        wordCounter = new WordCounter();
    }

    @Test
    public void testCountWords() {
        String testSentence = "hello world hello karol hello";
        wordCounter.countWords(testSentence);
        assertEquals(3, (int) wordCounter.getWordCounts().get("hello"));
        assertEquals(1, (int) wordCounter.getWordCounts().get("world"));
        assertEquals(1, (int) wordCounter.getWordCounts().get("karol"));
    }

    @Test
    public void testWriteWordCountToFile() throws FileNotFoundException {
        String testSentence = "hello world hello karol hello";
        String fileName = "test_word_counts.txt";
        wordCounter.countWords(testSentence);
        wordCounter.writeWordCountToFile(fileName);

        File file = new File(fileName);
        assertTrue(file.exists());

        Scanner scanner = new Scanner(file);
        assertTrue(scanner.nextLine().contains("hello-(3)"));
        assertTrue(scanner.nextLine().contains("world-(1)"));
        assertTrue(scanner.nextLine().contains("karol-(1)"));
        scanner.close();
    }
}