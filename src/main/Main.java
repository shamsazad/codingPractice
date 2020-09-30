package main;

import java.util.*;

public class Main {

    public static void main(String[] args){
        SumPairInArray sumPairInArray = new SumPairInArray();
        PairSumEqualToRestOfArraySum psetroas = new PairSumEqualToRestOfArraySum();
        PairWithGivenSum pairWithGivenSum = new PairWithGivenSum();
        FibonacciRecursive fb = new FibonacciRecursive();
        FibonacciIterative fbi = new FibonacciIterative();
        MaxDifferentBetweenTwoNumberInArray maxDifferentBetweenTwoNumberInArray = new MaxDifferentBetweenTwoNumberInArray();
        Anagram anagram = new Anagram();
        WordReversalInString wordReversalInString = new WordReversalInString();
        DuplicateCharactersInString duplicateCharactersInString = new DuplicateCharactersInString();
        StringReversalRecursive stringReversalRecursive = new StringReversalRecursive();
        NextGreaterNumber nextGreaterNumber = new NextGreaterNumber();
        DuplicateRemovalSortedArray duplicateRemovalSortedArray = new DuplicateRemovalSortedArray();
        StackWithArray stackWithArray = new StackWithArray();
        MaximumShareProfit maximumShareProfit = new MaximumShareProfit();
        findSumPairInArray(sumPairInArray);
        findPairSumEqualsToRestOfArraySum(psetroas);
        countPairInAnArrayWithGivenSum(pairWithGivenSum);
        calculateFibonacciNumber(fb);
        calculateFibonacciNumber(fbi);
        calculateMaxDiffInAnArray(maxDifferentBetweenTwoNumberInArray);
        printAnagram(anagram);
        findDuplicateCharactersInString(duplicateCharactersInString);
        reverseStringWithRecursion(stringReversalRecursive);
        computeNextGreaterNumber(nextGreaterNumber);
        reverseAllTheWordsInString(wordReversalInString);
        removeDuplicatesFromSortedArray(duplicateRemovalSortedArray);
        stackImplementation(stackWithArray);
        calculateMaximumProfitOfShares(maximumShareProfit);
    }

    public static void findSumPairInArray(SumPairInArray sumPairInArray) {
        int[] arr ={3,6,5,4,10,-1,9};
        int sum = 9;
        Map<Integer, Integer> finalMap = sumPairInArray.findPairOfNumber(arr, sum);
        finalMap.entrySet().forEach(System.out::println);
    }

    public static void findPairSumEqualsToRestOfArraySum(PairSumEqualToRestOfArraySum psetroas) {
        int[] arr= {2, 4, 2, 2, 2};
        psetroas.pairSumArraySum(arr);
    }

    public static void countPairInAnArrayWithGivenSum(PairWithGivenSum pairWithGivenSum) {
        int[] arr = {1, 1, 1, 1};
        int sum = 2;
        int count = pairWithGivenSum.countPairInAnArrayWithGivenSum(arr, sum);
        System.out.println(count);
    }

    public static void calculateFibonacciNumber(FibonacciRecursive fb) {

        int num = 7;
        int[] arr = fb.generateFibonacciSeries(num);
        Arrays.stream(arr).forEach(x->{System.out.println(x);});
        System.out.println(fb.calculateFibonacciNumber(num));
    }

    public static void calculateFibonacciNumber(FibonacciIterative fbi) {
        int num = 7;
        System.out.println(fbi.getFibonacciNumber(num));
    }

    public static void calculateMaxDiffInAnArray(MaxDifferentBetweenTwoNumberInArray maxDifferentBetweenTwoNumberInArray) {
        int[] arr ={3,6,5,4,10,-1,9};
        int diff = maxDifferentBetweenTwoNumberInArray.returnMaxDifferenceInAnArray(arr);
        System.out.println("Diff "+diff);
    }

    public static void printAnagram(Anagram anagram) {
        String s = "ABC";
        anagram.printAnagram(s,0,s.length()-1);
    }

    public static void findDuplicateCharactersInString(DuplicateCharactersInString duplicateCharactersInString) {
        String s = "shams";
        List<Character> chars = duplicateCharactersInString.findDuplicateCharacterInString(s);
        System.out.println("The duplicate characters are" +chars);
    }

    public static void reverseStringWithRecursion(StringReversalRecursive stringReversalRecursive) {
        String s = "Shams";
        stringReversalRecursive.printStringReversal(s);
    }

    public static void computeNextGreaterNumber(NextGreaterNumber nextGreaterNumber) {
        int num = 1234;
        int greaterNumber = nextGreaterNumber.computeNextGreaterNumber(num);
        System.out.println(greaterNumber);
    }

    public static void reverseAllTheWordsInString(WordReversalInString wordReversalInString) {
        String s = "I am a student";
        String reverseString = wordReversalInString.reverseWordInAString(s);
        System.out.println(reverseString);
    }

    public static void removeDuplicatesFromSortedArray(DuplicateRemovalSortedArray duplicateRemovalSortedArray) {
        int[] arr = {};
        System.out.println(duplicateRemovalSortedArray.removeDuplicates(arr));
    }

    public static void stackImplementation(StackWithArray stackWithArray) {
        stackWithArray.push(5);
        stackWithArray.push(6);
        stackWithArray.push(1);
        stackWithArray.push(7);

        System.out.println(stackWithArray.pop());
        System.out.println(stackWithArray.pop());
        System.out.println(stackWithArray.pop());
        System.out.println(stackWithArray.pop());
        System.out.println(stackWithArray.pop());
    }

    private static void calculateMaximumProfitOfShares(MaximumShareProfit maximumShareProfit) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maximumShareProfit.calculateMaximumProfit(arr));
        int[] array = {100, 180, 260, 310, 40, 535, 695};
        int maxProfit = maximumShareProfit.calculateMaximumProfitEfficiently(array);
        System.out.println("The maximum profit is "+maxProfit);
    }
}
