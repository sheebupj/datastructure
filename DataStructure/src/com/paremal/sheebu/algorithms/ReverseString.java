package com.paremal.sheebu.algorithms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString=new ReverseString();
        String numberString= "0123456789";
        String reversed1= reverseString.reverseWithoutInbuiltIn(numberString);
        String reversed2= reverseString.reverseWithoutInbuiltInUsingStreamApi(numberString);
        System.out.println(numberString+":"+reversed1);
        System.out.println(numberString+":"+reversed2);
    }

    public String reverseWithoutInbuiltIn(String str){
        String resversed="";

        for(int i=str.length()-1;i>=0;i--){
            resversed=resversed+str.charAt(i);

        }
        return resversed;
    }
    public String reverseWithoutInbuiltInUsingStreamApi(String str){

       return IntStream.iterate(str.length()-1,i-> i>=0,i->i=i-1)
               .boxed()
               .map(str::charAt).map(String::valueOf)
               .collect(Collectors.joining());
    }
}
