package datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataType {
    public static void main(String[] args) {
        try {
            // Writing primitive data types to a file
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("data.bin"));
            outputStream.writeInt(123);
            outputStream.writeDouble(3.14);
            outputStream.writeBoolean(true);
            outputStream.close();
            
            // Reading primitive data types from a file
            DataInputStream inputStream = new DataInputStream(new FileInputStream("data.bin"));
            int intValue = inputStream.readInt();
            double doubleValue = inputStream.readDouble();
            boolean booleanValue = inputStream.readBoolean();
            inputStream.close();
            System.out.println("Int value: " + intValue);
            System.out.println("Double value: " + doubleValue);
            System.out.println("Boolean value: " + booleanValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
