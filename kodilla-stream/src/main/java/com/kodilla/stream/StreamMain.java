package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        LocalDate today = LocalDate.now();
        Map<Integer, ForumUser> theMapOfForumUsers = forum.getUserList().stream()
                .filter(user -> user.getNumberOfPosts() > 1)
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getDateOfBirth().plusYears(20).compareTo(today) <= 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("The number of users fulfilling criteria : " + theMapOfForumUsers.size() + "\n");
        theMapOfForumUsers.entrySet().stream()
                .map(entry -> "User ID: " + entry.getKey() + ", Details: " + entry.getValue())
                .forEach(System.out::println);
    }
}
