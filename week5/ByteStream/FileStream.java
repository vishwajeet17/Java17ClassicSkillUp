package ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
    public static void main(String[] args) {
        try {
            // Reading from a file
            FileInputStream inputStream = new FileInputStream("example.txt");
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
            inputStream.close();
            
            // Writing to a file
            FileOutputStream outputStream = new FileOutputStream("output.txt");
            String text = "Hello, World!";
            byte[] bytes = text.getBytes();
            outputStream.write(bytes);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
