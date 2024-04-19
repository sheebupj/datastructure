package com.paremal.sheebu.algorithms;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharFromWord {
    public static void printDuplicateFromString(String str) {
        String[] strings = str.split("");
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (String s : strings) {
            if (stringIntegerMap.containsKey(s)) {
                Integer t = stringIntegerMap.get(s) + 1;
                stringIntegerMap.put(s, t);

            } else {
                stringIntegerMap.put(s, 1);
            }
        }
        for(Map.Entry entry:stringIntegerMap.entrySet()){
            if((Integer)entry.getValue()>1){
                System.out.println("duplicate char:"+entry.getKey());
            }
        }
    }
    public static void main(String[] args) {
        String str = "abcafb";
        printDuplicateFromString(str);

    }
}
