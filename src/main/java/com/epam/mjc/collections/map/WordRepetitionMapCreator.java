package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        StringTokenizer st = new StringTokenizer(sentence, " ,.");
        List<String> words = new ArrayList<>();
        while (st.hasMoreTokens()) {
            words.add(st.nextToken().toLowerCase(Locale.ROOT));
        }
        for (String word:words){
            if (!result.containsKey(word)){
                result.put(word,1);
            }
            else {
                int value = result.get(word);
                result.put(word,value+1);
            }
        }
        return result;
    }
}
