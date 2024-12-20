import java.nio.file.*;
import java.io.IOException;

public class FileReadWriteAfterJava11 {
    public static void main(String[] args) {
        // File path for the example
        Path filePath = Paths.get("example.txt");

        // 1. Writing to a file using Files.writeString()
        try {
            String contentToWrite = "Hello, Java 11 File Enhancements!\nThis is a simple text file.";
            Files.writeString(filePath, contentToWrite);
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

        // 2. Reading from the file using Files.readString()
        try {
            String contentRead = Files.readString(filePath);
            System.out.println("\nContent read from the file:");
            System.out.println(contentRead); // Prints the content of the file
        } catch (IOException e) {
            System.out.println("Error reading from the file: " + e.getMessage());
        }
    }
}
