package com.paremal.sheebu.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class AlogorithmTest {


    @Test
    public  void ReverseStringTesst(){
        ReverseString reverseString= new ReverseString();
        String numberString = "0123456789";
        String numberString1 = "012 345 6789";
        String reversed1 = reverseString.reverseWithoutInbuiltIn(numberString);
        Assert.assertEquals("9876543210",reversed1);
        String reversed2 = reverseString.reverseWithoutInbuiltInUsingStreamApi(numberString);
        Assert.assertEquals("9876543210",reversed2);
        String reversed3 = reverseString.reverseEachWords(numberString1);
        Assert.assertEquals("210 543 9876 ",reversed3);
        String reversed4 = reverseString.reverseEachWordsInALine(numberString1);
        Assert.assertEquals("210 543 9876 ",reversed4);

    }
    @Test
    public void FilterSortTest(){
        FilterSort filterSort= new FilterSort();
        String[] strArray = {"POINT,2342342", "POINTS,2341345", "OF,34534345", "VIEWS,2342342223423", "IS,432234", "QWERTY,234234222"};
        String[] strArray1 = {"POINT,23423422234231", "POINTS,2341345", "OF,34534345", "VIEWS,2342342223423", "IS,432234", "QWERTY,234234222"};
        String actual= filterSort.filterBasedOn1partSortBased2part(strArray);
        String actual1= filterSort.filterBasedOn1partSortBased2part(strArray1);
        Assert.assertEquals("QWERTY",actual);
        Assert.assertEquals("VIEWS",actual1);



    }
}
