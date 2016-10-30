package br.com.paulo.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulohsl on 8/21/16.
 */
public class Replace {

    public static void main(String[] args) {

        String phrase = "This is a test";
        String replaceChar = "ABC";

        System.out.println(replace(phrase,replaceChar));

    }


    public static String replace(String a, String b) {

        String[] words = a.split("");

        StringBuilder sb = new StringBuilder();

        for(String letter : words){
            if(" ".equals(letter)){
                sb.append(b);
            }else{
                sb.append(letter);
            }
        }

        return sb.toString();

    }


    public static String replace2(String a, String b) {

        StringBuilder sb = new StringBuilder();

        for(char c : a.toCharArray()){
            if(c == ' '){
                sb.append(c);
            }else{
                sb.append(b);
            }
        }

        return sb.toString();
    }



}
