import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class ChunkProcessorTest {

    @Test
    public void testCreateChunks() {
        ChunkProcessor processor = new ChunkProcessor();

        String input = "abcdefghijk";
        List<String> expected = List.of("abcd", "efgh", "ijk");

        List<String> actual = processor.createChunks(input);

        Assert.assertEquals(expected, actual);
    }
}