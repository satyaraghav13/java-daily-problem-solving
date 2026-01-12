import java.util.Scanner;

public class Solution01 {

    public static void main(String[] args) {
//
//        String password = "Java1234";
    	
    	  Scanner sc = new Scanner(System.in);
          System.out.println("It must contain at least:\r\n"
        		 + " Password length must be at least 8 characters.\r\n"
          		 + "   - one uppercase letter\r\n"
          		 + "   - one lowercase letter\r\n"
          		 + "   - one digit");
          
          System.out.print("Enter password: ");
          String password = sc.nextLine();   // input from user


        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        // Rule 1: length check
        if (password.length() < 8) {
            System.out.println("Invalid Password");
            return;
        }

        // Rule 2: character check
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            } else if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            } else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
        }

        // Final validation
        if (hasUpper && hasLower && hasDigit) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
