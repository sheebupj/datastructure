package com.paremal.sheebu.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

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
    public void testFindCharPosistions() {
        String str = "The graphic and.";
        List<Integer> expected = Arrays.asList(12);
        FindStringPositionsInSentence fInstance = new FindStringPositionsInSentence();
        List<Integer> actual = fInstance.findWordPositions(str, "and");
        String str1 = "The graphic and and andand";
        List<Integer> expected1 = Arrays.asList(12, 16, 20, 23);
        List<Integer> actual1 = fInstance.findWordPositions(str1, "and");


        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected1, actual1);
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
        Map<Integer, Integer> notesMap2888 = NumberOfNotesFromAmt.getNumberOfNotesFrAmt(2888);
        Assert.assertArrayEquals(getepectedNotesMap2888().entrySet().toArray(), notesMap2888.entrySet().toArray());
        Map<Integer, Integer> notesMapWithStream = NumberOfNotesFromAmt.getNumberOfNotesFrAmtStream(2888);
        Assert.assertArrayEquals(getepectedNotesMap2888().entrySet().toArray(), notesMapWithStream.entrySet().toArray());
        Map<Integer, Integer> notesMap5888 = NumberOfNotesFromAmt.getNumberOfNotesFrAmt(5888);
        Assert.assertArrayEquals(getepectedNotesMap5888().entrySet().toArray(), notesMap5888.entrySet().toArray());
        Map<Integer, Integer> notesMap1Stream = NumberOfNotesFromAmt.getNumberOfNotesFrAmtStream(5888);
        Assert.assertArrayEquals(getepectedNotesMap5888().entrySet().toArray(), notesMap1Stream.entrySet().toArray());

    }

    @Test
    public void checkBalancedWithStackTest() {
        String line = "()";//true
        String line_ = ")(";//false
        String line2 = "([])";//true
        String line2_ = "([)]";//false
        String line4 = "()([])";//true
        String line3 = "({([])})";//true
        String line3_ = "({([])))";//false
        String line5 = "()([]){([])}";//true
        String line4_ = "))([])";//false
        String line5_ = "()([])}([])}";//false
        String line6 = "()([])([{}])()(){}[]{[]}[][][]{}{}{}{}()()(){{{}}}";//true
        String line6_ = ")()([])([{}])()(){}[]{[]}[][][]{}{}{}{}()()(){{{}}}";//false
        String line7_ = "(()()([])([{}])()(){}[]{[]}[][][]{}{}{}{}()()(){{{}}}";//false

        boolean actual = CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line);
        Assert.assertTrue(actual);
        boolean actual1 = CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line_);
        Assert.assertFalse(actual1);
        boolean actual2 = CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line2);
        Assert.assertTrue(actual2);
        boolean actual2_ = CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line2_);
        Assert.assertFalse(actual2_);
        boolean actual4 = CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line4);
        Assert.assertTrue(actual4);
        boolean actual4_ = CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line4_);
        Assert.assertFalse(actual4_);
        boolean actual5 = CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line5);
        Assert.assertTrue(actual5);
        boolean actual3 = CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line3);
        Assert.assertTrue(actual3);
        boolean actual3_ = CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line3_);
        Assert.assertFalse(actual3_);
        boolean actual5_ = CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line5_);
        Assert.assertFalse(actual5_);
        boolean actual6 = CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line6);
        Assert.assertTrue(actual6);
        boolean actual6_ = CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line6_);
        Assert.assertFalse(actual6_);
        boolean actual7_ = CheckOpeningClosingBracketsBalanced.checkBalancedWithStack(line7_);
        Assert.assertFalse(actual7_);
    }

    private static Map<Integer, Integer> getepectedNotesMap2888() {
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

    private static Map<Integer, Integer> getepectedNotesMap5888() {
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

    @Test
    public void testFirstNonRepeatableChars() {
        List<String> wordList = List.of("absolute", "definite", "accomodate", "sofistication");
        String expected = "admf";
        CombinedFirstNonRepeatableCharsFromWords cfnc = new CombinedFirstNonRepeatableCharsFromWords();
        String actual = cfnc.combinedNonRepeatable(wordList);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testLongestStringWithoutVowels() {
        String[] words = {"ada",
                "xyz",
                "absolute",
                "arithmetic1",
                "bcdfghjklm",
                "aithmatic-expression"};
        String[] words1 = {
                "ada",
                "xyz",
                "absolute",
                "arithmetic1",
                "bcdfghjklm",
                "aithmatic-expression",
                "bcdfghjklmww"
        };

        String expected = "bcdfghjklm";
        LongestWithoutVowel longestWithoutVowel = new LongestWithoutVowel();
        String actual = longestWithoutVowel.findLongestStringWithoutvowels(words);
        Assert.assertEquals(expected,actual);
        String expected1 = "bcdfghjklmww";
        String actual1 = longestWithoutVowel.findLongestStringWithoutvowels(words1);
        Assert.assertEquals(expected1,actual1);

    }
    @Test
    public void testFrequencyRankingFromTo1(){
        Integer[] ints={1,3,6,4,2,1,9,3,5,1,8,3,8,5,6,3,2,0,6,4,2,7,9,3,2,1};
        FrequencyRanking ranking= new FrequencyRanking();
        Map<Integer,Integer> expected=new LinkedHashMap<>();
        expected.put(1,4);
        expected.put(2,4);
        expected.put(6,3);
        Map<Integer,Integer> actual=ranking.frequencyRankingFromTo(ints,2,3);
        Assert.assertEquals(expected,actual);
        Integer[] ints1={0,1,2,3,4,5,6,0,1,0,2,0,1,0,5,1,0,2,4};
        Map<Integer,Integer> expected1=new LinkedHashMap<>();
        expected1.put(0,6);
        expected1.put(1,4);
        expected1.put(2,3);
        //expected1.put(5,2);
        expected1.put(4,2);
        Map<Integer,Integer> actual1=ranking.frequencyRankingFromTo(ints1,1,4);
        Assert.assertEquals(expected1,actual1);

    }
    @Test
    public void testFlipRotateTest(){
        List<List<Integer>> inputLList= new ArrayList<>();
        inputLList.add(Arrays.asList(1,2,3));
        inputLList.add(Arrays.asList(4,5,6));
        inputLList.add(Arrays.asList(7,8,9));

        List<List<Integer>> expected= new ArrayList<>();
        expected.add(Arrays.asList(7,4,1));
        expected.add(Arrays.asList(8,5,2));
        expected.add(Arrays.asList(9,6,3));

        List<List<Integer>> actual= FlipRotate.rotateClockWise(inputLList);
        Assert.assertEquals(expected,actual);

        List<List<Integer>> expectedAntiCwise= new ArrayList<>();
        expectedAntiCwise.add(Arrays.asList(3,6,9));
        expectedAntiCwise.add(Arrays.asList(2,5,8));
        expectedAntiCwise.add(Arrays.asList(1,4,7));

        List<List<Integer>> actualAntiClwise= FlipRotate.rotateAntiClockWise(inputLList);
        Assert.assertEquals(expectedAntiCwise,actualAntiClwise);

        List<List<Integer>> expectedHrzdFlip= new ArrayList<>();
        expectedHrzdFlip.add(Arrays.asList(3,2,1));
        expectedHrzdFlip.add(Arrays.asList(6,5,4));
        expectedHrzdFlip.add(Arrays.asList(9,8,7));
        List<List<Integer>> actualHrzdFlip= FlipRotate.horizondalFlip(inputLList);
        Assert.assertEquals(expectedHrzdFlip,actualHrzdFlip);

        List<List<Integer>> expectedVerticalFlip= new ArrayList<>();
        expectedVerticalFlip.add(Arrays.asList(7,8,9));
        expectedVerticalFlip.add(Arrays.asList(4,5,6));
        expectedVerticalFlip.add(Arrays.asList(1,2,3));
        List<List<Integer>> actualVerticalFlip= FlipRotate.verticalFlip(inputLList);
        Assert.assertEquals(expectedVerticalFlip,actualVerticalFlip);
    }
}
