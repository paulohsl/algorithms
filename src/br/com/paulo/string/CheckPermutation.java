package br.com.paulo.string;

import java.util.Arrays;

/**
 * Created by paulohsl on 7/23/16.
 */
public class CheckPermutation {

    public static void main(String[] args) {

        String a = "raca";
        String b = "cara";

        System.out.println(isPermutation(a,b));


    }

    static boolean isPermutation(String a, String b){
        if(a.length() != b.length()) return false;

         return sort(a).equals(sort(b));
}

    static String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }


}
