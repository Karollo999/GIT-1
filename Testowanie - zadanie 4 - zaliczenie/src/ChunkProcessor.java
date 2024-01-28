import java.util.ArrayList;
import java.util.List;

public class ChunkProcessor {

    public List<String> createChunks(String input) {
        List<String> chunks = new ArrayList<>();

        for (int i = 0; i < input.length(); i += 4) {
            int end = Math.min(i + 7, input.length());
            chunks.add(input.substring(i, end));
        }

        return chunks;
    }
}