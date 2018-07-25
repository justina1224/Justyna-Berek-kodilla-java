package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.createTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("shopping", shopping.getTaskName());
        Assert.assertEquals("Buying gifts for friends", shopping.executeTask());
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.createTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("painting", painting.getTaskName());
        Assert.assertEquals("Painting living room, chosen color: white", painting.executeTask());
        Assert.assertFalse(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.createTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("driving", driving.getTaskName());
        Assert.assertEquals("Driving home by car", driving.executeTask());
        Assert.assertTrue(driving.isTaskExecuted());
    }
}


