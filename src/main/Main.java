package main;

import java.util.Map;

public class Main {

    public static void main(String[] args){
        int[] arr ={3,6,5,4,10,-1,9};
        int sum = 9;
        SumPairInArray sumPairInArray = new SumPairInArray();
        Map<Integer, Integer> finalMap = sumPairInArray.findPairOfNumber(arr, sum);
        finalMap.entrySet().forEach(System.out::println);
    }
}
