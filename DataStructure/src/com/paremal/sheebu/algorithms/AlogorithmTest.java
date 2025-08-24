package com.paremal.sheebu.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
    public void findIndexesTest() {
        String str = "sheebu";
        Optional<List<Integer>> optIndexes = FindSubStringIndexesInA_String.findIndexes(str, "e");
        List<Integer> indexes = List.of(2, 3);

        Assert.assertEquals(indexes, optIndexes.get());
        Optional<List<Integer>> optIndexes1 = FindSubStringIndexesInA_String.findIndexes(str, "z");
        Assert.assertEquals(Optional.empty(), optIndexes1);

    }

    @Test
    public void NumberOfNotesFromAmtTest() {
        Integer amount = 2888;
        Map<Integer, Integer> notesMap = NumberOfNotesFromAmt.getNumberOfNotesFrAmt(2888);
        Assert.assertArrayEquals(getepectedNotesMap().entrySet().toArray(), notesMap.entrySet().toArray());
        Map<Integer, Integer> notesMapWithStream = NumberOfNotesFromAmt.getNumberOfNotesFrAmtStream(2888);
        Assert.assertArrayEquals(getepectedNotesMap().entrySet().toArray(), notesMapWithStream.entrySet().toArray());
        Map<Integer, Integer> notesMap1 = NumberOfNotesFromAmt.getNumberOfNotesFrAmt(5888);
        Assert.assertArrayEquals(getepectedNotesMap1().entrySet().toArray(), notesMap1.entrySet().toArray());
        Map<Integer, Integer> notesMap1Stream = NumberOfNotesFromAmt.getNumberOfNotesFrAmtStream(5888);
        Assert.assertArrayEquals(getepectedNotesMap1().entrySet().toArray(), notesMap1Stream.entrySet().toArray());

    }
    @Test
    public void checkBalancedWithStackTest(){
        String line="()";//true
        String line_=")(";//false
        String line2="([])";//true
        String line2_="([)]";//false
        String line4="()([])";//true
        String line3="({([])})";//true
        String line3_="({([])))";//false
        String line5="()([]){([])}";//true
        String line4_="))([])";//false
        String line5_="()([])}([])}";//false
        String line6="()([])([{}])()(){}[]{[]}[][][]{}{}{}{}()()(){{{}}}";//true
        String line6_=")()([])([{}])()(){}[]{[]}[][][]{}{}{}{}()()(){{{}}}";//false

        String actual=CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line);
        Assert.assertEquals("true",actual);
        String actual1=CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line_);
        Assert.assertEquals("false",actual1);
        String actual2=CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line2);
        Assert.assertEquals("true",actual2);
        String actual4_=CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line2_);
        Assert.assertEquals("false",actual4_);
        String actual4=CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line4);
        Assert.assertEquals("true",actual4);
        String actual5=CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line5);
        Assert.assertEquals("true",actual5);
        String actual3=CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line3);
        Assert.assertEquals("true",actual3);
        String actual3_=CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line3_);
        Assert.assertEquals("false",actual3_);
        String actual5_=CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line5_);
        Assert.assertEquals("false",actual5_);
        String actual6=CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line6);
        Assert.assertEquals("true",actual6);
        String actual6_=CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line6_);
        Assert.assertEquals("false",actual6_);
    }

    private static Map<Integer, Integer> getepectedNotesMap() {
        Map<Integer, Integer> expected = new LinkedHashMap<>();
        expected.put(2000, 1);
        expected.put(500, 1);
        expected.put(200, 1);
        expected.put(100, 1);
        expected.put(50, 1);
        expected.put(20, 1);
        expected.put(10, 1);
        expected.put(5, 1);
        expected.put(2, 1);
        expected.put(1, 1);
        return expected;
    }

    private static Map<Integer, Integer> getepectedNotesMap1() {
        Map<Integer, Integer> expected = new LinkedHashMap<>();
        expected.put(2000, 2);
        expected.put(500, 3);
        expected.put(200, 1);
        expected.put(100, 1);
        expected.put(50, 1);
        expected.put(20, 1);
        expected.put(10, 1);
        expected.put(5, 1);
        expected.put(2, 1);
        expected.put(1, 1);
        return expected;
    }

}
