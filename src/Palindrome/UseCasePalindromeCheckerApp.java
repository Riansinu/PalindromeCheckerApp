package Palindrome;

public class UseCasePalindromeCheckerApp {
   public  static void main(String[] args) {
       //use case 1
       System.out.println("Welcome to  palindrome");
       System.out.println("version 1");
       System.out.println("System initialized successfully");
       String word ="madam";
       //use caqse 2
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
       //use case 3
       String reversed = "";

       for (int i = word.length() - 1; i >= 0; i--) {
           reversed = reversed + word.charAt(i);
       }

       if (word.equals(reversed)) {
           System.out.println("UC3 Result (String Reverse): True");
       } else {
           System.out.println("UC3 Result (String Reverse): False");
       }

   }
}
