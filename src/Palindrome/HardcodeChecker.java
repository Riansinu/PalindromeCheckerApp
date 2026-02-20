package Palindrome;

public class HardcodeChecker {
    public void HardcodeChecker(){
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
