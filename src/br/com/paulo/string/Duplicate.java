package br.com.paulo.string;

import java.util.*;

/**
 * Created by paulohsl on 8/21/16.
 */
public class Duplicate {

    public static void main(String[] args) {

        int[] numbers = {1,3,4,2,1,3,4,1,5,2};

        System.out.println(duplicate(numbers));
        System.out.println(myDuplicate(numbers));

    }

    private static String duplicate(int[] numbers) {

        Set<Integer> map = new HashSet<>();
        Set<Integer> list = new TreeSet<>();

        for(int number : numbers){
            if(map.contains(number)){
                list.add(number);
            }else{
                map.add(number);
            }
        }

        return list.toString();
    }


    public static String myDuplicate(int[] numbers) {

        TreeSet<Integer> res = new TreeSet<>();

        Arrays.sort(numbers);

        for(int i = 1;i<numbers.length;i++){
            if(numbers[i] == numbers[i-1]){
                res.add(numbers[i]);
            }
        }

        return res.toString();

    }
}
