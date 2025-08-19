package com.paremal.sheebu.algorithms;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckOpeningClosingBracketsBalanced {


    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line="";
        try {
             line=reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(checkBalancedWithStack(line));


    }


    static boolean checkBalancedWithStack(String line) {
        List<String> inputs = Stream.of(line.trim().split("")).collect(Collectors.toList());
        List<String> openingList=new ArrayList<>();
        List<String> closingList=new ArrayList<>();
        openingList=List.of("(","{","[");
        closingList=List.of(")","}","]");
        Map<String,String> openingClosing= new HashMap<>();
        openingClosing.put("(",")");
        openingClosing.put("{","}");
        openingClosing.put("[","]");
      
        Stack openingValueStack = new Stack(inputs.size());
        for(String ch:inputs){
            if(openingList.contains(ch)){
                openingValueStack.push(ch);
            }
            else if (closingList.contains(ch)){
                if(!openingValueStack.isEmpty()) {
                    String stackInverted = openingClosing.get(openingValueStack.pop());
                    if (!ch.equals(stackInverted)) {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
        }

        return openingValueStack.isEmpty();
    }
}



class Stack {
    String[] arr;
    int top = -1;

    public Stack(int capacity) {
        arr = new String[capacity];
    }

    int size() {
        return arr.length;
    }
    void push(String str) {
        arr[++top] = str;
    }

    String pop() {
        return arr[top--];
    }
    boolean isEmpty(){return top==-1;}
}



