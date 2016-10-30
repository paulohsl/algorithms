package br.com.paulo.string;

/**
 * Created by paulohsl on 9/8/16.
 */
public class Palindrome {
    public static void main(String[] args) {

        String word = "kayak";

        System.out.println(isPalindrome(word));

    }


    public static boolean isPalindrome(String word) {

        char[] charArray = word.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (end > start) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
