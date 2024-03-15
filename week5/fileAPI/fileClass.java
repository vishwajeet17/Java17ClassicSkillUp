package fileAPI;

import java.io.File;
import java.io.IOException;

public class fileClass {
    public static void main(String[] args) {
        // Creating a File object
        File file = new File("example.txt");
        
        // Checking if the file exists
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
        
        // Creating a new file
        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
