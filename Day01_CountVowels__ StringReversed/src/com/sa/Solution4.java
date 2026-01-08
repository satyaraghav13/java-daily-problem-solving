package com.sa;
public class Solution4{
    public static void main(String[] args) {

        String input = "madam";

        int start = 0;
        int end = input.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
