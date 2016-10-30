package br.com.paulo.firecode.test;

import br.com.paulo.firecode.SingleNumber;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paulohsl on 9/18/16.
 */
public class SingleNumberTest {

    @Test
    public void testSingleNumber() throws Exception {

        //{1,2,3,4,1,2,4,3,5} ==> 5

        int[] arr = {1, 2, 3, 4, 1, 2, 4, 3, 5};

        int ret = SingleNumber.singleNumber(arr);

        assertEquals(5, ret);

    }
}