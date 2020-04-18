package main;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {

    public List<Character> findDuplicateCharacterInString(String s) {

        char[] str = s.toCharArray();
        int count =1;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : str) {
            count = hashMap.get(c) != null ? count+1 : 1;
            hashMap.put(c, count);
        }

        List<Character> repeatedCharacters =  hashMap.entrySet().stream().filter(x -> x.getValue() > 1).map(x->x.getKey())
                .collect(Collectors.toList());

        return  repeatedCharacters;
    }
}
