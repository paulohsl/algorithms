package br.com.paulo.fibonacci;

/**
 * Created by paulohsl on 8/21/16.
 */
public class FibonacciIterative {

    public static void main(String[] args) {

        int n = 2;

        System.out.println(fib(n));

    }



    public static int fib(int n) {

        if(n == 0) return n;

        int x=0,y=1,temp=0;

        for(int i = 2;i<=n;i++){
            temp = x+y;

            x = y;
            y = temp;
        }

        return x + y;
    }
}
