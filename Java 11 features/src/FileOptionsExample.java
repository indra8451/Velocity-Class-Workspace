import java.nio.file.*;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class FileOptionsExample {
    public static void main(String[] args) {
        Path filePath = Paths.get("example.txt");

        // Write to file, creating it if it doesn't exist, and truncating it if it does
        try {
            Files.writeString(filePath, "Initial content.\n", StandardOpenOption.CREATE, 
            		StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("File created with initial content.");
        } catch (IOException e) {
            System.out.println("Error writing initial content: " + e.getMessage());
        }

        // Append to the same file
        try {
            Files.writeString(filePath, "Appending new line.\n", StandardOpenOption.APPEND);
            System.out.println("Appended content to the file.");
        } catch (IOException e) {
            System.out.println("Error appending content: " + e.getMessage());
        }

        // Try creating a new file without overwriting (throws exception if it exists)
        try {
            Files.writeString(filePath, "This should not overwrite.", StandardOpenOption.CREATE_NEW);
            System.out.println("New file created.");
        } catch (IOException e) {
            System.out.println("Error creating new file: " + e.getMessage());
        }
    }
}
