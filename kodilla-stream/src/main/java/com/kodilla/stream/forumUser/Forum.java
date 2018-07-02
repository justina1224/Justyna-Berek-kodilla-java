package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theListOfUsers = new ArrayList<>();

    public Forum() {
        theListOfUsers.add(new ForumUser(1, "John Smith", 'M', LocalDate.of(1988, 12,24), 12));
        theListOfUsers.add(new ForumUser(2, "Joanna Cole", 'F', LocalDate.of(1997, 6,1), 20));
        theListOfUsers.add(new ForumUser(3, "Graham McKinley", 'M', LocalDate.of(1998, 7,4), 2));
        theListOfUsers.add(new ForumUser(4, "Paul Sneddon", 'M', LocalDate.of(1970, 5,5), 3));
        theListOfUsers.add(new ForumUser(5, "Susan Crow", 'F', LocalDate.of(1982, 3,18), 29));
        theListOfUsers.add(new ForumUser(6, "Patricia Cooper", 'F', LocalDate.of(1989, 7,1), 10));
        theListOfUsers.add(new ForumUser(7, "Mark Townsley", 'M', LocalDate.of(1958, 4,21), 18));
        theListOfUsers.add(new ForumUser(8, "Jane Booth", 'F', LocalDate.of(1990, 7,15), 48));
        theListOfUsers.add(new ForumUser(9, "Adam Taylor", 'M', LocalDate.of(2000, 10,10), 33));
        theListOfUsers.add(new ForumUser(10, "Alex Hasselby", 'M', LocalDate.of(1996, 8,4), 51));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theListOfUsers);
    }
}
