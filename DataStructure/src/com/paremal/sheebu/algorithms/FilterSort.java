package com.paremal.sheebu.algorithms;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterSort {

    public static void main(String[] args) {
        String[] strArray = {"POINT,2342342", "POINTS,2341345", "OF,34534345", "VIEWS,2342342223423", "IS,432234", "QWERTY,234234222"};
        FilterSort filterSort=new FilterSort();
        System.out.println(filterSort.filterBasedOn1partSortBased2part(strArray));
    }

    /*
    Given the array of strings. Each string contains two parts - Word and its count separated by comma(,):

    - Filter by word(1st part) length > 4

    - Sort by word count(2nd part) desc

    - Find 2nd highest word based on above sorted result

    Solve using Java Streams API

    String[] strArray = {"POINT,2342342", "POINTS,2341345", "OF,34534345", "VIEWS,2342342223423", "IS,432234", "QWERTY,234234222"};

    Output: QWERTY
     */
    String filterBasedOn1partSortBased2part(String[] strArray){
        Optional<Map.Entry<String,Long>> optME=Stream.of(strArray)
                .map(str-> str.split("[//,]"))
                .filter(sArr-> sArr[0].length()>4 )
                .collect(Collectors
                        .toMap(sArr-> sArr[0], sArr-> Long.valueOf(sArr[1])))
                .entrySet().stream().skip(1).findFirst();
        return optME.isPresent() ? optME.get().getKey():"";
    }
}
