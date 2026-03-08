package Palindrome;

import java.util.Stack;

public class PalindromePerformance {

    // Method 1: Two Pointer
    public static boolean twoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // Method 2: Using Stack
    public static boolean stackMethod(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "racecar";

        // Two Pointer Timing
        long start1 = System.nanoTime();
        boolean result1 = twoPointer(word);
        long end1 = System.nanoTime();

        // Stack Timing
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(word);
        long end2 = System.nanoTime();

        System.out.println("Two Pointer Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println();

        System.out.println("Stack Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");
    }
}