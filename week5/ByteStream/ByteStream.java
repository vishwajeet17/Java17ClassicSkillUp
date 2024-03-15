package ByteStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) {
        try {
            // Reading from a byte array
            byte[] bytes = {72, 101, 108, 108, 111}; // ASCII values for "Hello"
            ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.println((char) data);
            }
            inputStream.close();
            
            // Writing to a byte array
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            String text = "Hello, World!";
            byte[] textBytes = text.getBytes();
            outputStream.write(textBytes);
            byte[] result = outputStream.toByteArray();
            outputStream.close();
            System.out.println(result);
            System.out.println(new String(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
