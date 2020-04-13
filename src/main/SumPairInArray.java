package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SumPairInArray {

    public Map<Integer, Integer> findPairOfNumber(int arr[], int sum){
        HashSet hashSet = new HashSet();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++) {
            int temp = sum-arr[i];
            if(hashSet.contains(temp)){
                hashMap.put(arr[i], temp);
            }
            hashSet.add(arr[i]);
        }
        return hashMap;
    }
}
