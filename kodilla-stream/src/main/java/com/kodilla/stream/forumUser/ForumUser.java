package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(int userId, String userName, char sex, LocalDate dateOfBirth, int numberOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return userId == forumUser.userId &&
                sex == forumUser.sex &&
                numberOfPosts == forumUser.numberOfPosts &&
                Objects.equals(userName, forumUser.userName) &&
                Objects.equals(dateOfBirth, forumUser.dateOfBirth);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, userName, sex, dateOfBirth, numberOfPosts);
    }
}
