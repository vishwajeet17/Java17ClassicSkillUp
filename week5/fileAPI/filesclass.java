package fileAPI;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class filesclass {
    public static void main(String[] args) {
        try {
            // Reading from a file
            Path path = Paths.get("example.txt");
            String content = Files.readString(path);
            System.out.println("File content: " + content);
            
            // Writing to a file
            String newText = "Hello, Java!";
            Files.writeString(path, newText);
            System.out.println("File content updated.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

