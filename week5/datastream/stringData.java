package datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class stringData {
    public static void main(String[] args) {
        try {
            // Writing strings to a file
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("strings.bin"));
            outputStream.writeUTF("Hello");
            outputStream.writeUTF("World");
            outputStream.close();
            
            // Reading strings from a file
            DataInputStream inputStream = new DataInputStream(new FileInputStream("strings.bin"));
            String str1 = inputStream.readUTF();
            String str2 = inputStream.readUTF();
            inputStream.close();
            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
