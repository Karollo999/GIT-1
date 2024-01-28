import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ChunkWriter {

    public void writeChunksToFile(List<String> chunks, String filePath) throws IOException {
        File file = new File(filePath);
        file.getParentFile().mkdirs(); // Ensure the directory exists

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String chunk : chunks) {
                writer.write(chunk);
                writer.newLine();
            }
        }
    }
}