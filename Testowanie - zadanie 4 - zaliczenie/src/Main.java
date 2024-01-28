import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a random string of characters:");
        String input = scanner.nextLine();

        ChunkProcessor processor = new ChunkProcessor();
        ChunkWriter writer = new ChunkWriter();

        List<String> chunks = processor.createChunks(input);

        try {
            writer.writeChunksToFile(chunks, "output/chunks.txt");
            System.out.println("Chunks written to file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

        scanner.close();
    }
}