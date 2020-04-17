package main;

import java.util.Arrays;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        SumPairInArray sumPairInArray = new SumPairInArray();
        PairSumEqualToRestOfArraySum psetroas = new PairSumEqualToRestOfArraySum();
        PairWithGivenSum pairWithGivenSum = new PairWithGivenSum();
        FibonacciRecursive fb = new FibonacciRecursive();
        FibonacciIterative fbi = new FibonacciIterative();
        findSumPairInArray(sumPairInArray);
        findPairSumEqualsToRestOfArraySum(psetroas);
        countPairInAnArrayWithGivenSum(pairWithGivenSum);
        calculateFibonacciNumber(fb);
        calculateFibonacciNumber(fbi);
    }

    public static void findSumPairInArray(SumPairInArray sumPairInArray) {
        int[] arr ={3,6,5,4,10,-1,9};
        int sum = 9;
        Map<Integer, Integer> finalMap = sumPairInArray.findPairOfNumber(arr, sum);
        finalMap.entrySet().forEach(System.out::println);
    }

    public static void findPairSumEqualsToRestOfArraySum(PairSumEqualToRestOfArraySum psetroas){
        int[] arr= {2, 4, 2, 2, 2};
        psetroas.pairSumArraySum(arr);
    }

    public static void countPairInAnArrayWithGivenSum(PairWithGivenSum pairWithGivenSum) {
        int[] arr = {1, 1, 1, 1};
        int sum = 2;
        int count = pairWithGivenSum.countPairInAnArrayWithGivenSum(arr, sum);
        System.out.println(count);
    }

    public static void calculateFibonacciNumber(FibonacciRecursive fb){

        int num = 7;
        int[] arr = fb.generateFibonacciSeries(num);
        Arrays.stream(arr).forEach(x->{System.out.println(x);});
        System.out.println(fb.calculateFibonacciNumber(num));
    }

    public static void calculateFibonacciNumber(FibonacciIterative fbi){
        int num = 7;
        System.out.println(fbi.getFibonacciNumber(num));
    }
}
