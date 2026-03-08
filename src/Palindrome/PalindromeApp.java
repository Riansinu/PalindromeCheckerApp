package Palindrome;

public class PalindromeApp {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String str = "madam";

        if (checker.checkPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}