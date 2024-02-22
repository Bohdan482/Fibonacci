package org.example;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static final Map<Integer, Long> memo = new HashMap<>();

    //часова складсність - O(2^n), просторова складність - O(n)
    public long fibonacciDynamic(int n){
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long fib = fibonacciDynamic(n - 1) + fibonacciDynamic(n - 2);
        memo.put(n, fib);
        return fib;
    }

    //часова складсність - O(n), просторова складність - O(1)
    public int fibonacciIterative(int n) {
        if(n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    //часова складсність - O(2^n), просторова складність - O(n)
    public long fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
