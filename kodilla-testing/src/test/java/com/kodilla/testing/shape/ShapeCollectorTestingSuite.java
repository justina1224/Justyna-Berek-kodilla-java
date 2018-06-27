package com.kodilla.testing.shape;

import org.junit.*;

import static org.junit.Assert.*;

public class ShapeCollectorTestingSuite {
    private static int testCounter = 1;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Starting the suite of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All test are finished");
    }

    @Before
    public void beforeEveryTest() {
        System.out.println("Test number " + testCounter++);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test passed");
    }

    @Test
    public void testAddFigure() {

        //Given
        Triangle triangle = new Triangle(6, 6);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(triangle);

        String expected = "triangle";
        String result = shapeCollector.collection.get(0).getShapeName();
        int size = shapeCollector.collection.size();


        //Then
        assertEquals(expected, result);
        assertEquals(1, size);
        System.out.println("New shape added to the list");

    }

    @Test
    public void testRemoveFigure() {

        //Given
        Triangle triangle = new Triangle(6, 6);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(triangle);

        boolean result = shapeCollector.collection.remove(triangle);
        boolean contains = shapeCollector.collection.contains(triangle);

        //Then
        assertTrue(result);
        assertFalse(contains);
        System.out.println("One shape removed from the list");
    }

    @Test
    public void testGetFigure() {

        //Given
        Triangle triangle = new Triangle(6,6);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(triangle);

        double fieldExpected = 18;
        double fieldResult = shapeCollector.collection.get(0).getField();
        String nameExpected = "triangle";
        String nameResult = shapeCollector.collection.get(0).getShapeName();

        //Then
        assertEquals(fieldExpected, fieldResult, 0);
        assertEquals(nameExpected, nameResult);
        System.out.println("Getting an element from the list is going right");
    }

    @Test
    public void testShowFigures() {

        //Given
        Circle circle = new Circle(6);
        Square square = new Square(6);
        Triangle triangle = new Triangle(6, 6);
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape[] array = new Shape[]{circle, square, triangle};

        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //Then
        assertArrayEquals(array, shapeCollector.showFigures());

    }
}
