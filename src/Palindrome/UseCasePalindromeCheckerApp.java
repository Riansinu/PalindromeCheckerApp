package Palindrome;
import java.util.*;

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
           left++;
           right--;

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
       //UC6: Queue + Stack Method
       // ==========================
       Stack<Character> uc6Stack = new Stack<>();
       Queue<Character> queue = new LinkedList<>();

       for (int i = 0; i < word.length(); i++) {
           uc6Stack.push(word.charAt(i));
           queue.add(word.charAt(i));
       }

       boolean uc6Palindrome = true;

       while (!uc6Stack.isEmpty()) {
           if (!uc6Stack.pop().equals(queue.remove())) {
               uc6Palindrome = false;
               break;
           }
       }

       System.out.println("UC6 Result: " + uc6Palindrome);
       // ==========================
// UC7: Deque Based Method
// ==========================
       Deque<Character> deque = new ArrayDeque<>();

       for (int i = 0; i < word.length(); i++) {
           deque.addLast(word.charAt(i));
       }

       boolean uc7Palindrome = true;

       while (deque.size() > 1) {
           char front = deque.removeFirst();
           char rear = deque.removeLast();

           if (front != rear) {
               uc7Palindrome = false;
               break;
           }
       }

       System.out.println("UC7 Result (Deque Method): " + uc7Palindrome);
   }
}
