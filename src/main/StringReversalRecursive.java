package main;

public class StringReversalRecursive {

    public void printStringReversal(String str) {

        if(str.length() == 1) {
            System.out.println("The reversed String is " +str);
        } else {
            System.out.println("The reversed String is " +str.charAt(str.length()-1));
            printStringReversal(str.substring(0,str.length()-1));
        }
    }
}
