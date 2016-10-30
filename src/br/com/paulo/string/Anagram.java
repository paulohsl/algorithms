package br.com.paulo.string;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by paulohsl on 9/8/16.
 */
public class Anagram {

    public static void main(String[] args) {

    }

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;

        char[] arrayA = a.toLowerCase().toCharArray();
        char[] arrayB = b.toLowerCase().toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        return Arrays.equals(arrayA, arrayB);
    }


    static boolean isAnagram2(String a, String b) {

        if (a.length() != b.length()) return false;

        char[] arrayA = a.toLowerCase().toCharArray();
        char[] arrayB = b.toLowerCase().toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        boolean isAnagram = true;

        for(int i=0;i<arrayA.length;i++){
            if(arrayA[i] != arrayB[i]){
                isAnagram = false;
            }
        }

        return isAnagram;
    }
}
