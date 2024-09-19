package demo;

import java.io.*;

public class TransientExample {
    public static void main(String[] args) {
        Example example = new Example("John Doe", "mySecretPassword");

        // Serialize the object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("example.ser"))) {
            out.writeObject(example);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        Example deserializedExample = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("example.ser"))) {
            deserializedExample = (Example) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Print the deserialized object
        System.out.println("Deserialized Object: " + deserializedExample);
    }
}

class Example implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private transient String password;

    public Example(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Password: " + password;
    }
}
