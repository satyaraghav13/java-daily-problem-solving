import java.io.*;

// Step 1: Implement Serializable interface
class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Solution01 {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Satya");

        // Serialization (Object -> File)
        try {
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialization (File -> Object)
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Deserialized Object:");
            System.out.println("ID: " + s2.id);
            System.out.println("Name: " + s2.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}