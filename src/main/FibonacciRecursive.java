package main;

public class FibonacciRecursive {

    public int calculateFibonacciNumber(int num) {

        if(num < 2){
            return num;
        }
        return calculateFibonacciNumber(num-1)+ calculateFibonacciNumber(num-2);
    }

    public int[] generateFibonacciSeries(int num) {

        int[] fibSeries = new int[num];
        fibSeries[0] = 0;
        if(num == 0){
            return fibSeries;
        }
        fibSeries[1] = 1;
        if(num == 1) {
            return fibSeries;
        }
        for(int i=2; i<num; i++) {
            fibSeries[i] = fibSeries[i-1]+fibSeries[i-2];
        }
        return fibSeries;
    }
}
