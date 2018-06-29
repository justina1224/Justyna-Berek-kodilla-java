package com.kodilla.testing.forum.statistics;

public class StatisticsCalculating {
    int numberOfPosts;
    int numberOfComments;
    int numberOfUsers;
    double postsPerUser;
    double commentsPerUser;
    double commentsPerPost;
    Statistics statistics;

    public StatisticsCalculating(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getNumberOfPosts() {
        if(numberOfUsers > 0) {
            return numberOfPosts;
        } else {
            return 0;
        }
    }

    public int getNumberOfComments() {
        if(numberOfUsers > 0 && numberOfPosts > 0) {
            return numberOfComments;
        } else {
            return 0;
        }
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public double getPostsPerUser() {
        if(numberOfUsers > 0) {
            return postsPerUser;
        } else {
            return 0;
        }
    }

    public double getCommentsPerUser() {
        if(numberOfUsers > 0 && numberOfPosts >0) {
            return commentsPerUser;
        } else {
            return 0;
        }
    }

    public double getCommentsPerPost() {
        if(numberOfUsers > 0 && numberOfPosts > 0) {
            return commentsPerPost;
        } else {
            return 0;
        }
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {
            this.postsPerUser = numberOfPosts / numberOfUsers;
        } else {
            this.postsPerUser = 0;
        }

        if (numberOfUsers > 0) {
            this.commentsPerUser = numberOfComments / numberOfUsers;
        } else {
            this.commentsPerUser = 0;
        }

        if (numberOfPosts > 0) {
            this.commentsPerPost = numberOfComments / numberOfPosts;
        } else {
            this.commentsPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average number of posts per one user: " + postsPerUser);
        System.out.println("Average number of comments per one user: " + commentsPerUser);
        System.out.println("Average number of comments per one post: " + commentsPerPost);
    }
}