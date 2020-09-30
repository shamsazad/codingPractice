package main;

import java.util.Objects;

public class Test {

    public static void main(String s[]) {
        String fName = null;
        String lName = null;
        String s1 = Objects.toString(fName, " ");
        String s2 = Objects.toString(lName, " ");
        System.out.println(s1+ " " +s2);
    }
}
