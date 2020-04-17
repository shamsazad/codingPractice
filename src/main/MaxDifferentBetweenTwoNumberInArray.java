package main;

public class MaxDifferentBetweenTwoNumberInArray {

    public int returnMaxDifferenceInAnArray(int[] num){

        int max = num[0];
        int min = num[0];

        for(int i=1; i < num.length ; i++) {

            if(max < num[i]) {
                max = num[i];
            }
            if(min > num[i]) {
                min = num[i];
            }
        }
        return max-min;
    }
}
