import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;*

class PalindromeCheckerTest {

    @Test
    void testIsPalindromeTrue() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("madam"), "madam should be a palindrome");
        assertTrue(checker.isPalindrome("racecar"), "racecar should be a palindrome");
        assertTrue(checker.isPalindrome("A man a plan a canal Panama").replaceAll("\\s+", "")),
                  "A man a plan a canal Panama should be a palindrome after removing spaces");
    }

    @Test
    void testIsPalindromeFalse() {
        PalindromeChecker checker = new PalindromeChecker();
        assertFalse(checker.isPalindrome("hello"), "hello should not be a palindrome");
        assertFalse(checker.isPalindrome("world"), "world should not be a palindrome");
    }
}