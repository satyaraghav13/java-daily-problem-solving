import java.util.ArrayList;
import java.util.Collections;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class Solution01 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        // Add students
        list.add(new Student(101, "Satya"));
        list.add(new Student(102, "Raghav"));
        list.add(new Student(103, "Aman"));

        System.out.println("Student List:");
        for (Student s : list) {
            System.out.println(s);
        }

        // Remove student
        list.remove(1);

        System.out.println("\nAfter Removing Index 1:");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}