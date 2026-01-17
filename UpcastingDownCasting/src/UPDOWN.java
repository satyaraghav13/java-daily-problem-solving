// Parent class
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {

    // Overriding parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    // Child-specific method
    void bark() {
        System.out.println("Dog is barking loudly");
    }
}

// Main class
public class UPDOWN{

    public static void main(String[] args) {

        // ===============================
        // 1️⃣ UPCASTING
        // ===============================

        // Child object is referred by Parent reference
        Animal a = new Dog();   // Upcasting (automatic)

        // Method call depends on object type (Dog)
        a.sound();   // Output: Dog barks

        // a.bark();  ❌ Compile-time error
        // Reason: Parent reference cannot access child-specific methods


        // ===============================
        // 2️⃣ DOWNCASTING
        // ===============================

        // Parent reference is explicitly converted to Child reference
        Dog d = (Dog) a;   // Downcasting (explicit)

        // Now child-specific method is accessible
        d.bark();          // Output: Dog is barking loudly
        d.sound();         // Output: Dog barks


        // ===============================
        // 3️⃣ SAFE DOWNCASTING (BEST PRACTICE)
        // ===============================

        Animal a2 = new Dog();

        if (a2 instanceof Dog) {     // Safety check
            Dog d2 = (Dog) a2;
            d2.bark();
        }


        // ===============================
        // 4️⃣ INVALID DOWNCASTING
        // ===============================

        Animal a3 = new Animal();

        // Dog d3 = (Dog) a3;   ❌ Runtime Error
        // Exception: ClassCastException
    }
}