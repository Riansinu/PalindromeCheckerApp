package Palindrome;

public class UseCasePalindromeCheckerApp {
   public  static void main(String[] args) {
       System.out.println("Welcome to  palindrome");
       System.out.println("version 1");
       System.out.println("System initialized successfully");
       String word ="madam";

       boolean isPalindrome = true;

       for(int i = 0; i < word.length() / 2; i++) {
           if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
               isPalindrome = false;
               break;
           }
       }
       System.out.println("word:madam");
       if (isPalindrome) {
           System.out.println("Is it palindrome: True");
       }
       else {
           System.out.println("Is it palindrome: False");
       }

   }
}
