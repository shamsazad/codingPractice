package main;

import java.util.concurrent.TimeUnit;

public class Anagram {

    public void printAnagram(String str, int initial, int len) {
        System.out.println("Inside Anagram");
        if (initial == len) {
            System.out.println(str);
        }
        else
        {
            for (int i = initial; i <= len; i++)
            {
                str = swap(str,initial,i);
                printAnagram(str, initial+1, len);
                str = swap(str,initial,i);
            }
        }

    }

    private String swap(String str, int j, int i) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
