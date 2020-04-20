package main;

import java.util.Stack;

public class WordReversalInString {

    public String reverseWordInAString(String s) {

        Stack words = new Stack();
        String[] wordArray = s.split(" ");

        for (String word: wordArray) {
            words.push(word);
            words.push(" ");
        }
        StringBuilder sb = new StringBuilder();

        words.pop();
        while(!words.isEmpty()) {
            sb.append(words.pop());
        }
        return sb.toString();
    }
}
