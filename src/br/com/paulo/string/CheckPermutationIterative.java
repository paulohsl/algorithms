package br.com.paulo.string;

/**
 * Created by paulohsl on 7/23/16.
 */
public class CheckPermutationIterative {

    public static void main(String[] args) {

        String s = "ab";
        String t = "bc";

        System.out.println(permutation(s,t));

    }


    static boolean permutation(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] letters = new int[128];

        char[] s_array = s.toCharArray();

        for (char c : s_array) {
            letters[c]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int c = t.charAt(i);
            letters[c]--;
            if (letters[c] < 0) return false;
        }
        return true;

    }
}
