
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class tryWithResource {
    public static void main(String[] args) {

        String filePath = "output.txt";
        
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            String data = "Hello, "+ name + "!";
            fos.write(data.getBytes());
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
