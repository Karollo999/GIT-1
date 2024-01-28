import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class NumberArrayTest {

    private NumberArray array;
    private final int length = 10;
    private final int maxNumber = 50;

    @BeforeEach
    void setUp() {
        array = new NumberArray(length, maxNumber);
    }

    @Test
    void testArrayLengthAfterGeneration() {
        array.generateNumbers();
        assertEquals(length, array.getNumbers().length, "Array length does not match expected value.");
    }

    @Test
    void testArrayValuesWithinRange() {
        array.generateNumbers();
        for (int number : array.getNumbers()) {
            assertTrue(number >= 0 && number <= maxNumber, "Array contains values out of the expected range.");
        }
    }

    @Test
    void testArrayValuesAreRandom() {
        array.generateNumbers();
        int[] firstGeneration = array.getNumbers().clone();
        array.generateNumbers();
        int[] secondGeneration = array.getNumbers().clone();
        boolean areDifferent = false;
        for (int i = 0; i < length; i++) {
            if (firstGeneration[i] != secondGeneration[i]) {
                areDifferent = true;
                break;
            }
        }
        assertTrue(areDifferent, "Two generations of the array seem to be identical, which is unlikely for random values.");
    }

    @Test
    void testMaxNumberIsPresent() {
        array.generateNumbers();
        Set<Integer> generatedNumbers = new HashSet<>();
        for (int number : array.getNumbers()) {
            generatedNumbers.add(number);
        }
        assertTrue(generatedNumbers.contains(maxNumber), "Max number should be present in the array.");
    }
}