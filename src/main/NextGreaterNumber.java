package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextGreaterNumber {

    public int computeNextGreaterNumber(int num) {

        Stack<Integer> s = new Stack();

        List<Integer> number = new ArrayList<>();
        int counter = 0;

        while(num > 0) {
            s.push(num%10);
            num = num/10;
        }

        while(!s.empty()){
            number.add(s.pop());
        }

        int index = 0;
        for(int i=number.size()-1;i>0;i--) {
            if(number.get(i) > number.get(i-1)) {
                index = i;
                break;
            }
        }

        int min = number.get(index);
        int k = 0;

        for(int i = index; i< number.size(); i++){
            if(min > number.get(i) && number.get(index-1) < number.get(i)) {
                min = number.get(i);
                k=i;
            }
        }

        StringBuilder sb = new StringBuilder();
        int temp = number.get(index-1);

        if(k!=0) {
            number.set(index-1, number.get(k));
            number.set(k, temp);
            Object[] test = number.toArray();

            Arrays.sort(test, index, number.size());
            Arrays.stream(test).forEach(x->sb.append(x));
        } else {
            number.set(index-1, number.get(index));
            number.set(index, temp);
            Object[] test = number.toArray();
            Arrays.stream(test).forEach(x->sb.append(x));
        }

        return Integer.parseInt(sb.toString());
    }
}
