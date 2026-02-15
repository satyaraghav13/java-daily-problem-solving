final class Student {

    private final int id;
    private final String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter methods only (no setters)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class Solution01 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Ravi");

        System.out.println(s1);

        // Try to modify (Not possible)
        // s1.id = 200; ❌ Error
    }
}