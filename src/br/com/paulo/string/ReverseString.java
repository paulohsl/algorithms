package br.com.paulo.string;

import java.util.Stack;

/**
 * Created by paulohsl on 9/8/16.
 */
public class ReverseString {

    public static void main(String[] args) {
        String phrase = "Olha o gato ae";

        System.out.println(reverseUsingStack(phrase));
    }

    public static String reverseString(String phrase) {

        char[] charString = phrase.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = charString.length - 1; i >= 0; i--) {
            sb.append(charString[i]);
        }

        return sb.toString();
    }

    static String reverseUsingStack(String sentence) {

        char[] charArray = sentence.toCharArray();

        Stack<Character> wordStack = new Stack<>();

        for (Character ch : charArray) {
            wordStack.push(ch);
        }

        StringBuilder sb = new StringBuilder();

        while (!wordStack.empty()) {
            sb.append(wordStack.peek());
            wordStack.pop();
        }

        return sb.toString();
    }
}
