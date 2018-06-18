package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test begin");
    }

    @After
    public void after() {
        System.out.println("Test end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite Begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite End");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given
        ArrayList<Integer> empty = new ArrayList<Integer>();
        ArrayList<Integer> emptyExpected = new ArrayList<Integer>();

        //When
        OddNumberExterminator exterminator = new OddNumberExterminator();
        ArrayList<Integer> resultEmptyList = exterminator.exterminate(empty);
        System.out.println("Testing empty list, contents: " + empty);
        System.out.println("Testing empty list exterminating:  " + resultEmptyList);

        //Then
        Assert.assertEquals(resultEmptyList, emptyExpected);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        ArrayList<Integer> testNumbers = new ArrayList<Integer>();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        testNumbers.add(4);
        testNumbers.add(5);
        testNumbers.add(6);
        testNumbers.add(7);
        testNumbers.add(8);
        testNumbers.add(9);
        testNumbers.add(10);

        ArrayList<Integer> testEvenNumbers = new ArrayList<Integer>();

        ArrayList<Integer> testExpectedEvenNumbers = new ArrayList<Integer>();
        testExpectedEvenNumbers.add(2);
        testExpectedEvenNumbers.add(4);
        testExpectedEvenNumbers.add(6);
        testExpectedEvenNumbers.add(8);
        testExpectedEvenNumbers.add(10);

        //When
        OddNumberExterminator exterminator = new OddNumberExterminator();
        ArrayList<Integer> result = exterminator.exterminate(testNumbers);
        System.out.println("Testing normal list, contents: " + testNumbers);
        System.out.println("Testing normal list exterminating: " + result);

        //Then
        Assert.assertEquals(result, testExpectedEvenNumbers);

    }
}
