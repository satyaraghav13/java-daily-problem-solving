class Solution01 {

    // Method Overloading - Integer addition
    int add(int a, int b) {
        return a + b;
    }

    // Method Overloading - Double addition
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Solution01 obj = new Solution01();

        int result1 = obj.add(5, 3);
        double result2 = obj.add(5.5, 2.5);

        System.out.println("Integer Addition: " + result1);
        System.out.println("Double Addition: " + result2 );
    }
}
