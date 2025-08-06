package com.paremal.sheebu.algorithms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountNotesFromAmout {

    public static void main(String[] args) {
        getNoteCountFromAmount(2888).entrySet()
                .forEach(es->
                        System.out.println(es.getKey()+":"+es.getValue()));

    }

    static Map<Integer,Integer> getNoteCountFromAmount(Integer amt){
        Map<Integer,Integer> notemap= new LinkedHashMap<>();
        for(Integer value:getNotes()){
            if(amt>=value){
                int count=amt/value;
                notemap.put(value,count);
                amt=amt-(value*count);
            }
        }
        return notemap;

    }
    static List<Integer> getNotes(){
        List<Integer> notes= new ArrayList<>();
        notes.add(2000);
        notes.add(500);
        notes.add(200);
        notes.add(100);
        notes.add(50);
        notes.add(20);
        notes.add(10);
        notes.add(5);
        notes.add(2);
        notes.add(1);
        return  notes;
    }
}
