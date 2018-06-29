package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTestSuite {

    @Test
    public void calculateStatisticsWithMockZeroUsersZeroPostsZeroComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int mockPostsCount = 0;
        int mockCommentsCount = 0;
        ArrayList<String> mockNumberOfUser = new ArrayList<String>();

        when(statisticsMock.postsCount()).thenReturn(mockPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);
        when(statisticsMock.usersNames()).thenReturn(mockNumberOfUser);

        StatisticsCalculating statisticsCalculating = new StatisticsCalculating(statisticsMock);
        statisticsCalculating.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfPosts = statisticsCalculating.getNumberOfPosts();
        int quantityOfComments = statisticsCalculating.getNumberOfComments();
        int quantityOfUsers = statisticsCalculating.getNumberOfUsers();

        //Then
        Assert.assertEquals(0, quantityOfPosts);
        Assert.assertEquals(0, quantityOfComments);
        Assert.assertEquals(0, quantityOfUsers);
    }

    @Test

    public void calculateStatisticsWithMockZeroUsersThousandPostsZeroComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int mockPostsCount = 1000;
        int mockCommentsCount = 0;
        ArrayList<String> mockNumberOfUser = new ArrayList<String>();

        when(statisticsMock.postsCount()).thenReturn(mockPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);
        when(statisticsMock.usersNames()).thenReturn(mockNumberOfUser);

        StatisticsCalculating statisticsCalculating = new StatisticsCalculating(statisticsMock);
        statisticsCalculating.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfPosts = statisticsCalculating.getNumberOfPosts();
        int quantityOfComments = statisticsCalculating.getNumberOfComments();
        int quantityOfUsers = statisticsCalculating.getNumberOfUsers();

        //Then
        Assert.assertEquals(0, quantityOfPosts);
        Assert.assertEquals(0, quantityOfComments);
        Assert.assertEquals(0, quantityOfUsers);
    }

    @Test
    public void calculateStatisticsWithMockZeroUsersTenPostsTwentyComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int mockPostsCount = 10;
        int mockCommentsCount = 20;
        ArrayList<String> mockNumberOfUser = new ArrayList<String>();

        when(statisticsMock.postsCount()).thenReturn(mockPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);
        when(statisticsMock.usersNames()).thenReturn(mockNumberOfUser);

        StatisticsCalculating statisticsCalculating = new StatisticsCalculating(statisticsMock);
        statisticsCalculating.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfPosts = statisticsCalculating.getNumberOfPosts();
        int quantityOfComments = statisticsCalculating.getNumberOfComments();
        int quantityOfUsers = statisticsCalculating.getNumberOfUsers();

        //Then
        Assert.assertEquals(0, quantityOfPosts);
        Assert.assertEquals(0, quantityOfComments);
        Assert.assertEquals(0, quantityOfUsers);
    }

    @Test
    public void calculateStatisticsWithMockZeroUsersTwentyPostsTenComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int mockPostsCount = 20;
        int mockCommentsCount = 10;
        ArrayList<String> mockNumberOfUser = new ArrayList<String>();

        when(statisticsMock.postsCount()).thenReturn(mockPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);
        when(statisticsMock.usersNames()).thenReturn(mockNumberOfUser);

        StatisticsCalculating statisticsCalculating = new StatisticsCalculating(statisticsMock);
        statisticsCalculating.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfPosts = statisticsCalculating.getNumberOfPosts();
        int quantityOfComments = statisticsCalculating.getNumberOfComments();
        int quantityOfUsers = statisticsCalculating.getNumberOfUsers();

        //Then
        Assert.assertEquals(0, quantityOfPosts);
        Assert.assertEquals(0, quantityOfComments);
        Assert.assertEquals(0, quantityOfUsers);
    }

    @Test
    public void calculateStatisticsWithMockHundredUsersZeroPostsTenComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int mockPostsCount = 0;
        int mockCommentsCount = 10;
        ArrayList<String> mockNumberOfUser = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            mockNumberOfUser.add("");
        }

        when(statisticsMock.postsCount()).thenReturn(mockPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);
        when(statisticsMock.usersNames()).thenReturn(mockNumberOfUser);

        StatisticsCalculating statisticsCalculating = new StatisticsCalculating(statisticsMock);
        statisticsCalculating.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfPosts = statisticsCalculating.getNumberOfPosts();
        int quantityOfComments = statisticsCalculating.getNumberOfComments();
        int quantityOfUsers = statisticsCalculating.getNumberOfUsers();

        //Then
        Assert.assertEquals(0, quantityOfPosts);
        Assert.assertEquals(0, quantityOfComments);
        Assert.assertEquals(100, quantityOfUsers);
    }

    @Test
    public void calculateStatisticsWithMockHundredUsersThousandPostsZeroComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int mockPostsCount = 1000;
        int mockCommentsCount = 0;
        ArrayList<String> mockNumberOfUser = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            mockNumberOfUser.add("");
        }

        when(statisticsMock.postsCount()).thenReturn(mockPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);
        when(statisticsMock.usersNames()).thenReturn(mockNumberOfUser);

        StatisticsCalculating statisticsCalculating = new StatisticsCalculating(statisticsMock);
        statisticsCalculating.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfPosts = statisticsCalculating.getNumberOfPosts();
        int quantityOfComments = statisticsCalculating.getNumberOfComments();
        int quantityOfUsers = statisticsCalculating.getNumberOfUsers();

        //Then
        Assert.assertEquals(1000, quantityOfPosts);
        Assert.assertEquals(0, quantityOfComments);
        Assert.assertEquals(100, quantityOfUsers);
    }

    @Test
    public void calculateStatisticsWithMockHundredUsersThousandPostsHundredComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int mockPostsCount = 1000;
        int mockCommentsCount = 100;
        ArrayList<String> mockNumberOfUser = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            mockNumberOfUser.add("");
        }

        when(statisticsMock.postsCount()).thenReturn(mockPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);
        when(statisticsMock.usersNames()).thenReturn(mockNumberOfUser);

        StatisticsCalculating statisticsCalculating = new StatisticsCalculating(statisticsMock);
        statisticsCalculating.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfPosts = statisticsCalculating.getNumberOfPosts();
        int quantityOfComments = statisticsCalculating.getNumberOfComments();
        int quantityOfUsers = statisticsCalculating.getNumberOfUsers();

        //Then
        Assert.assertEquals(1000, quantityOfPosts);
        Assert.assertEquals(100, quantityOfComments);
        Assert.assertEquals(100, quantityOfUsers);
    }

    @Test
    public void calculateStatisticsWithMockHundredUsersHundredPostsThousandComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int mockPostsCount = 100;
        int mockCommentsCount = 1000;
        ArrayList<String> mockNumberOfUser = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            mockNumberOfUser.add("");
        }

        when(statisticsMock.postsCount()).thenReturn(mockPostsCount);
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);
        when(statisticsMock.usersNames()).thenReturn(mockNumberOfUser);

        StatisticsCalculating statisticsCalculating = new StatisticsCalculating(statisticsMock);
        statisticsCalculating.calculateAdvStatistics(statisticsMock);

        //When
        int quantityOfPosts = statisticsCalculating.getNumberOfPosts();
        int quantityOfComments = statisticsCalculating.getNumberOfComments();
        int quantityOfUsers = statisticsCalculating.getNumberOfUsers();

        //Then
        Assert.assertEquals(100, quantityOfPosts);
        Assert.assertEquals(1000, quantityOfComments);
        Assert.assertEquals(100, quantityOfUsers);
    }
}
