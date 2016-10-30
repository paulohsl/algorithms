package br.com.paulo.string;


public class StringUniqueCharacters {

    public static void main(String[] args) {

        String name = "Paulo Henrique";

        System.out.println(isUniqueCharacter(name));

    }


    static boolean isUniqueCharacter(String str) {
        if (str.length() > 128) return false;

        boolean[] charset = new boolean[128];

        for (int i = 0; i < str.length(); i++) {

            int val = str.charAt(i);

            if (charset[val]) {
                return false;
            }

            charset[val] = true;
        }

        return true;
    }

}
