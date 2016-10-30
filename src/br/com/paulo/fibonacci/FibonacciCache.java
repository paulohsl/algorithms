package br.com.paulo.fibonacci;

/**
 * Created by paulohsl on 6/26/16.
 */
public class FibonacciCache {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // N fibonacci number
        int n = 50;

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }


        long stopTime = System.currentTimeMillis();

        long elapsedTime = stopTime - startTime;

        System.out.println("Tempo de execução: " + elapsedTime);
    }


    static long fibonacciCache(int n) {
        return fibonacciCache(n, new long[n+1]);
    }


    static long fibonacciCache(int n, long[] cache) {
        if (n < 2) return n;

        if (cache[n] == 0) {
            cache[n] = fibonacciCache(n - 1, cache) + fibonacciCache(n - 2, cache);
        }

        return cache[n];
    }


    static long fiboRecursive(long i) {
        if (i < 2) return i;

        return fiboRecursive(i - 1) + fiboRecursive(i - 2);
    }


    static long fibonacci(int n) {
        if (n == 0) return n;
        long a = 0, b = 1;

        for (int i = 2; i < n; i++) {
            long c = a + b;
            a = b;
            b = c;

        }
        return a + b;
    }


    String s = "Hello";
    String t = s.replace("el", "em");
    boolean x = t.equals("Hemlo");



}
