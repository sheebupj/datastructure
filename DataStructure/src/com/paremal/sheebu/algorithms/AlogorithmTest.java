package com.paremal.sheebu.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class AlogorithmTest {


    @Test
    public void ReverseStringTesst() {
        ReverseString reverseString = new ReverseString();
        String numberString = "0123456789";
        String numberString1 = "012 345 6789";
        String reversed1 = reverseString.reverseWithoutInbuiltIn(numberString);
        Assert.assertEquals("9876543210", reversed1);
        String reversed2 = reverseString.reverseWithoutInbuiltInUsingStreamApi(numberString);
        Assert.assertEquals("9876543210", reversed2);
        String reversed3 = reverseString.reverseEachWords(numberString1);
        Assert.assertEquals("210 543 9876 ", reversed3);
        String reversed4 = reverseString.reverseEachWordsInALine(numberString1);
        Assert.assertEquals("210 543 9876 ", reversed4);

    }

    @Test
    public void FilterSortTest() {
        FilterSort filterSort = new FilterSort();
        String[] strArray = {"POINT,2342342", "POINTS,2341345", "OF,34534345", "VIEWS,2342342223423", "IS,432234", "QWERTY,234234222"};
        String[] strArray1 = {"POINT,23423422234231", "POINTS,2341345", "OF,34534345", "VIEWS,2342342223423", "IS,432234", "QWERTY,234234222"};
        String actual = filterSort.filterBasedOn1partSortBased2part(strArray);
        String actual1 = filterSort.filterBasedOn1partSortBased2part(strArray1);
        Assert.assertEquals("QWERTY", actual);
        Assert.assertEquals("VIEWS", actual1);
    }

    @Test
    public void findClosestToZeroTest() {

        int[] data = {2, 3, -2, 4, -5, -1, 1};
        int[] result1 = ClosestZeroInArray.findClosestToZero(data);
        Assert.assertArrayEquals(new int[]{-1, 1}, result1);
        int[] result2 = ClosestZeroInArray.findClosestToZeroUsingStreamApi(data);
        Assert.assertArrayEquals(new int[]{-1, 1}, result2);
        int[] data1 = {2, 3, -2, 4, -5, -1, 1, 0};
        int[] result3 = ClosestZeroInArray.findClosestToZero(data1);
        Assert.assertArrayEquals(new int[]{-1, 0}, result3);
        int[] result4 = ClosestZeroInArray.findClosestToZeroUsingStreamApi(data1);
        Assert.assertArrayEquals(new int[]{-1, 0}, result4);
    }
    @Test
    public void findIndexesTest(){
        String str="sheebu";
        Optional<List<Integer>> optIndexes=FindSubStringIndexesInA_String.findIndexes(str,"e");
        List<Integer>  indexes=List.of(2,3);

        Assert.assertEquals(indexes, optIndexes.get());
        Optional<List<Integer>> optIndexes1=FindSubStringIndexesInA_String.findIndexes(str,"z");
        Assert.assertEquals(Optional.empty(), optIndexes1);

    }
}
