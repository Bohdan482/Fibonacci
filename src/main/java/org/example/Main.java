package org.example;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        System.out.println(fibonacci.fibonacciDynamic(25));
        System.out.println(fibonacci.fibonacciIterative(25));
        System.out.println(fibonacci.fibonacciRecursive(25));
    }
}