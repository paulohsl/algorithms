package br.com.paulo.firecode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by paulohsl on 9/4/16.
 */
public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String input = "aaaa";

        System.out.println(firstNonRepeatedCharacter2(input));

    }

    public static Character firstNonRepeatedCharacter(String str) {
        Map<Character, Integer> characterMap = new HashMap<>();
        Character res = ' ';

        for (Character c : str.toCharArray()) {
            if (!characterMap.containsKey(c)) {
                characterMap.put(c, 1);
            } else {
                characterMap.put(c, characterMap.get(c) + 1);
            }

        }

        for (Character ch : str.toCharArray()) {
            if (characterMap.get(ch) == 1) {
                res = ch;
                break;
            }

        }


        return res;


    }

    public static Character firstNonRepeatedCharacter2(String str) {

        if (str == null || str.length() == 0) return null;

        int[] charQuantity = new int[256];
        for (char currentCharacter : str.toCharArray()) {
            charQuantity[currentCharacter] += 1;
        }
        for (char currentCharacter : str.toCharArray()) {
            if (charQuantity[currentCharacter] == 1) {
                return currentCharacter;
            }
        }
        return null;


    }
}
