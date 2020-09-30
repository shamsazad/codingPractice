package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MaximumShareProfit {

    public int calculateMaximumProfit(int[] arr) {
        int maxProfit = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                if(maxProfit < arr[j]-arr[i] && arr[j]-arr[i] > 0) {
                    maxProfit = arr[j]-arr[i];
                }
            }
        }
        return maxProfit;
    }

    public int calculateMaximumProfitEfficiently(int[] arr) {

        Map<Integer, Integer> localMinima = new HashMap<>();
        Map<Integer, Integer> localMaxima = new HashMap<>();
        boolean isLocalMinimaInitialize = false;

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]<arr[i+1] && !isLocalMinimaInitialize) {
                localMinima.put(i,arr[i]);
                isLocalMinimaInitialize = true;
            }
            if(isLocalMinimaInitialize && arr[i]>arr[i+1]) {
                localMaxima.put(i,arr[i]);
                isLocalMinimaInitialize=false;
            }
        }

        if(isLocalMinimaInitialize){
            localMaxima.put(arr.length-1, arr[arr.length-1]);
        }

        Iterator it = localMaxima.entrySet().iterator();
        int maxProfit = Integer.MIN_VALUE;
        int minPrice;
        int maxPrice;

        for (Map.Entry<Integer,Integer> minimumEntry:localMinima.entrySet()) {
            System.out.println("Best day to buy the share is on "+minimumEntry.getKey());
            minPrice = minimumEntry.getValue();
            Map.Entry enty = (Map.Entry) it.next();
            maxPrice = (Integer) enty.getValue();

            System.out.println("Best day to sell a share is on " + enty.getKey());
            if(maxPrice-minPrice > maxProfit) {
                maxProfit = maxPrice - minPrice;
            }
        }

        return maxProfit;
    }
}
