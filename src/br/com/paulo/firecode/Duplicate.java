package br.com.paulo.firecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by paulohsl on 9/4/16.
 */
public class Duplicate {

    public static void main(String[] args) {

    }


    public static String duplicate(int[] numbers) {

        Arrays.sort(numbers);

        ArrayList res = new ArrayList();

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                res.add(numbers[i]);

            }
        }

        return res.toString();
    }

}
