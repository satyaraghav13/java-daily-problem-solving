//import java.util.Scanner;
//
//public class Solution02{
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Password Rules:");
//        System.out.println("1. Length must be at least 8 characters");
//        System.out.println("2. First letter must be CAPITAL");
//        System.out.println("3. Must contain:");
//        System.out.println("   - lowercase letters");
//        System.out.println("   - one digit");
//        System.out.println("   - one special character");
//
//        System.out.print("Enter password: ");
//        String password = sc.nextLine();
//
//        boolean hasLower = false;
//        boolean hasDigit = false;
//        boolean hasSpecial = false;
//
//        // Rule 1: length check
//        if (password.length() < 8) {
//            System.out.println("Invalid Password");
//            return;
//        }
//
//        // Rule 2: first letter capital check
//        char firstChar = password.charAt(0);
//        if (!(firstChar >= 'A' && firstChar <= 'Z')) {
//            System.out.println("Invalid Password");
//            return;
//        }
//
//        // Rule 3: check remaining characters
//        for (int i = 1; i < password.length(); i++) {
//            char ch = password.charAt(i);
//
//            if (ch >= 'a' && ch <= 'z') {
//                hasLower = true;
//            } else if (ch >= '0' && ch <= '9') {
//                hasDigit = true;
//            } else {
//                hasSpecial = true; // anything other than letter & digit
//            }
//        }
//
//        // Final validation
//        if (hasLower && hasDigit && hasSpecial) {
//            System.out.println("Valid Password");
//        } else {
//            System.out.println("Invalid Password");
//        }
//
//        sc.close();
//    }
//}



import java.util.Scanner;

public class Solution02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Password Rules:");
        System.out.println("1. Length must be at least 8 characters");
        System.out.println("2. First letter must be CAPITAL");
        System.out.println("3. Must contain:");
        System.out.println("   - lowercase letters");
        System.out.println("   - one digit");
        System.out.println("   - one special character");

        while (true) {   // 🔁 keep asking until valid

            System.out.print("\nEnter password: ");
            String password = sc.nextLine();

            boolean hasLower = false;
            boolean hasDigit = false;
            boolean hasSpecial = false;

            // Rule 1: length check
            if (password.length() < 8) {
                System.out.println("❌ Invalid Password (Length must be at least 8)");
                continue;   // retry
            }

            // Rule 2: first letter capital check
            char firstChar = password.charAt(0);
            if (!(firstChar >= 'A' && firstChar <= 'Z')) {
                System.out.println("❌ Invalid Password (First letter must be CAPITAL)");
                continue;   // retry
            }

            // Rule 3: check remaining characters
            for (int i = 1; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (ch >= 'a' && ch <= 'z') {
                    hasLower = true;
                } else if (ch >= '0' && ch <= '9') {
                    hasDigit = true;
                } else {
                    hasSpecial = true;
                }
            }

            // Final validation
            if (hasLower && hasDigit && hasSpecial) {
                System.out.println("✅ Valid Password");
                break;   // 🔚 exit loop when valid
            } else {
                System.out.println("❌ Invalid Password (Missing required characters)");
            }
        }

        sc.close();
    }
}

