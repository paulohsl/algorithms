package br.com.paulo.string;

/**
 * Created by paulohsl on 7/31/16.
 */
public class PalindromePermutation {

    public static void main(String[] args) {

        String phrase = "paulo";

        System.out.println(isPermutationOfPalindrome(phrase));

    }

   public static boolean isPermutationOfPalindrome(String phrase){

        int[] table = buildCharFrequencyTable(phrase);

        return checkMaxOneOdd(table);

    }

    public static boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for(int count : table){
            if(count % 2 == 1){
                if(foundOdd){
                    return false;
                }
                foundOdd =  true;
            }
        }

        return true;
    }

    public static int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') +1];

        for(char c : phrase.toCharArray()){
            int x = getCharNumber(c);

            if(x != -1){
                table[x]++;
            }
        }
        return table;

    }


    public static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if(val >= a && val <= z){
            return val - a;
        }

        return -1;
    }




}
