import java.io.*;
import java.nio.file.*;

public class FileReadWriteBeforeJava11 {
    public static void main(String[] args) {
        // File path for the example
        Path filePath = Paths.get("example.txt");

        // 1. Writing to a file using BufferedWriter and FileWriter
        try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
            String contentToWrite = "Hello, Java I/O (Before Java 11)!\nThis is a simple text file.";
            writer.write(contentToWrite);
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

        // 2. Reading from the file using BufferedReader and FileReader
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            System.out.println("\nContent read from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // Print each line of the file
            }
        } catch (IOException e) {
            System.out.println("Error reading from the file: " + e.getMessage());
        }
    }
}
