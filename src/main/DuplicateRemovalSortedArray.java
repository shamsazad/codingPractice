package main;

import java.util.ArrayList;
import java.util.List;

public class DuplicateRemovalSortedArray {

    public List<Integer> removeDuplicates(int[] sortedArray) {

        List<Integer> temp = new ArrayList<>();
        if(sortedArray.length == 0) {
            return null;
        } else if(sortedArray.length == 1){
            temp.add(sortedArray[0]);
            return temp;
        } else {
            for(int i=0; i< sortedArray.length; i++) {
                if(!(sortedArray[i] == sortedArray[i+1])) {
                    temp.add(sortedArray[i]);
                    if(i+1==sortedArray.length-1)
                        break;
                }
            }
        }
        temp.add(sortedArray[sortedArray.length-1]);
        return temp;
    }
}
