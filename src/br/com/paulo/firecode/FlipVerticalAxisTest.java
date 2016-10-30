package br.com.paulo.firecode;

import static org.junit.Assert.*;


public class FlipVerticalAxisTest {

    @org.junit.Test
    public void testFlipItVerticalAxis() throws Exception {

        int[][] arr = {{1, 0}};

        FlipVerticalAxis.flipItVerticalAxis(arr);

        assertArrayEquals(new int[]{0, 1}, arr[0]);

    }
}