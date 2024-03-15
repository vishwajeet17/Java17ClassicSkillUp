package GettingStartedWithIO;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) {
        try {
            String content = Files.readString(Paths.get("example.txt"));
            System.out.println("File content: " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

