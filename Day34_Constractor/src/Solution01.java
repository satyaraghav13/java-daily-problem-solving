class Car {
    String brand;
    int year;

    Car(String b, int y) {
        brand = b;
        year = y;
    }

    void show() {
        System.out.println(brand + " - " + year);
    }
}

public class Solution01 {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 2024);
        c1.show();
    }
}