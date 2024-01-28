import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileManager {

    public void writeToFile(String fileName, List<String> words) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String word : words) {
                writer.write(word + ",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}