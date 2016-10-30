package br.com.paulo.firecode;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by paulohsl on 9/18/16.
 */
public class SingleNumber {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 1, 2, 4, 3, 5};

        singleNumber(arr);

    }


    public static int singleNumber(int[] A) {

        Map<Integer, Integer> table = new Hashtable<>();

        int ret = 0;

        for (int i = 0; i < A.length; i++) {
            int count = table.containsKey(A[i]) ? table.get(A[i]) : 0;
            table.put(A[i], ++count);
        }

        for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
            if (entry.getValue() == 1) ret = entry.getKey();
        }

        return ret;

    }


}
