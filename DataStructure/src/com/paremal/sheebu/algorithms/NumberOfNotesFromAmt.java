package com.paremal.sheebu.algorithms;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberOfNotesFromAmt {
    public static void main(String[] args) throws InterruptedException {

        Map<Integer,Integer> notesMap=getNumberOfNotesFrAmt(2888);
        notesMap.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    static Map<Integer,Integer> getNumberOfNotesFrAmt(Integer amt){
        Map<Integer,Integer> notesMap=getNotesMap();
        Integer value=0, noteCount;
        Map<Integer,Integer> result= new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> noteEntry:notesMap.entrySet()) {
            value = noteEntry.getValue();
            if (amt >= value) {
                noteCount = amt / value;
                result.put(value, noteCount);
                amt = amt - (noteCount * value);
            }
        }
        return result;
    }
    private static Map<Integer, Integer> getNotesMap() {
        Map<Integer,Integer> notesMap= new LinkedHashMap<>();
        notesMap.put(0,2000);
        notesMap.put(1,500);
        notesMap.put(2,200);
        notesMap.put(3,100);
        notesMap.put(4,50);
        notesMap.put(5,20);
        notesMap.put(6,10);
        notesMap.put(7,5);
        notesMap.put(8,2);
        notesMap.put(9,1);
        return  notesMap;
    }
}
