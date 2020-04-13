package main;

import java.util.Map;

public class Main {

    public static void main(String[] args){
        SumPairInArray sumPairInArray = new SumPairInArray();
        PairSumEqualToRestOfArraySum psetroas = new PairSumEqualToRestOfArraySum();
        findSumPairInArray(sumPairInArray);
        findPairSumEqualsToRestOfArraySum(psetroas);
    }

    public static void findSumPairInArray(SumPairInArray sumPairInArray) {
        int[] arr ={3,6,5,4,10,-1,9};
        int sum = 9;
        Map<Integer, Integer> finalMap = sumPairInArray.findPairOfNumber(arr, sum);
        finalMap.entrySet().forEach(System.out::println);
    }

    public static void findPairSumEqualsToRestOfArraySum(PairSumEqualToRestOfArraySum psetroas){
        int[] arr= {4,6,8,3,1};
        psetroas.pairSumArraySum(arr);
    }
}
