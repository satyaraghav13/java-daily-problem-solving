
// Parent Class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating...");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking...");
    }
}

// Main Class
public class Solution01 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Tommy";

        d.eat();   // Inherited method
        d.bark();  // Own method
    }
}
