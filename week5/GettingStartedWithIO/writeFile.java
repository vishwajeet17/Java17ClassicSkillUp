package GettingStartedWithIO;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class writeFile {
    public static void main(String[] args) {
        try {
            String content = "Hello, World!";
            Files.write(Paths.get("example.txt"), content.getBytes());
            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
