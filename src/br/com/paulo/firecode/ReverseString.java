package br.com.paulo.firecode;

/**
 * Created by paulohsl on 9/3/16.
 */
public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseString(null));

    }


    public static String reverseString(String str){
        if (str == null) return "";
        String inputString = str;
        String outputString = null;

        StringBuilder sb = new StringBuilder();

        for(char c : inputString.toCharArray()){
            sb.append(c);
        }

        outputString = sb.reverse().toString();

        return outputString;
    }
}
