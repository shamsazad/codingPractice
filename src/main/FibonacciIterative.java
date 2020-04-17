package main;

public class FibonacciIterative {

    public int getFibonacciNumber(int num) {
        int a1 = 0;
        int a2 = 1;
        int sum = 0;
        if(num < 2)
            return num;

        for(int i=2; i<=num ; i++) {
            sum = a1 + a2 ;
            a1 = a2;
            a2 = sum;
        }

        return sum;
    }
}
