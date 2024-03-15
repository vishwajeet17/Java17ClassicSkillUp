package ObjectSerialization;

import java.io.*;

class Person implements Serializable {
    // private static final long serialVersionUID = 1L; // Define serialVersionUID
    // to ensure compatibility
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class serDeser {
    public static void main(String[] args) {
        // Serialize object
        serializeObject(new Person("Vishwajeeet", 24), "person.txt");

        // Deserialize object
        Person john = (Person) deserializeObject("person.txt");
        System.out.println("Deserialized object: " + john);
    }

    // Serialize object to a file
    public static void serializeObject(Object obj, String filename) {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(obj);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialize object from a file
    public static Object deserializeObject(String filename) {
        try (FileInputStream fileIn = new FileInputStream(filename);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            Object obj = objectIn.readObject();
            System.out.println("Object deserialized successfully.");
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
