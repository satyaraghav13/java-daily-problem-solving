public class Solution01 {
    public static void main(String[] args) {
        String str = "Satya";
        String reversed = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}
