package Palindrome;

public class UseCasePalindromeCheckerApp {
   public  static void main(String[] args) {
       //use case 1
       System.out.println("Welcome to  palindrome");
       System.out.println("version 1");
       System.out.println("System initialized successfully");
       String word ="madam";
       //use case 2
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
       //use case 4
       char[] characters = word.toCharArray();
       boolean isPalindromeUC4 = true;
       int left =0;
       int right =characters.length-1;
       while (left<right){
           if (characters[left] != characters[right]) {
               isPalindromeUC4 = false;
               break;
           }
       }
       if (isPalindromeUC4) {
           System.out.println("UC4 Result (Character Array Method): True");
       } else {
           System.out.println("UC4 Result (Character Array Method): False");
       }

       if (word.equals(reversed)) {
           System.out.println("UC3 Result (String Reverse): True");
       } else {
           System.out.println("UC3 Result (String Reverse): False");
       }
       // UC5
       System.out.println("\n--- UC5: Stack-Based Check ---");

       java.util.Stack<Character> stack = new java.util.Stack<>();


       for (int i = 0; i < word.length(); i++) {
           stack.push(word.charAt(i));
       }

       boolean uc5Palindrome = true;


       for (int i = 0; i < word.length(); i++) {
           if (word.charAt(i) != stack.pop()) {
               uc5Palindrome = false;
               break;
           }
       }

       System.out.println("UC5 Result (Stack): " + uc5Palindrome);

   }
}
