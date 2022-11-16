package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, String> element : sourceMap.entrySet()) {
            if (!result.containsKey(element.getValue())) {
                result.put(element.getValue(), element.getKey());
            } else {
                if (result.get(element.getValue()) > element.getKey()) {
                    result.put(element.getValue(), element.getKey());
                }
            }
        }
        return result;
    }
}
