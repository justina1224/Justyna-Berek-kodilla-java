package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {
    @Test
    public void testHomeworkChecking() {
        //Given
        Mentor mentor1 = new Mentor("Andrzej", "Kowalski");
        Mentor mentor2 = new Mentor("Pawel", "Bogatko");
        StudentHomework homework1 = new StudentHomework("Izabela Kowalczyk");
        StudentHomework homework2 = new StudentHomework("Kamil Nowak");
        StudentHomework homework3 = new StudentHomework("Olga Budzynska");
        homework1.registerObserver(mentor1);
        homework2.registerObserver(mentor2);
        homework3.registerObserver(mentor2);
        //When
        homework1.sendHomework(new Task("20.1 Facade"));
        homework1.sendHomework(new Task("20.2 Decorator"));
        homework1.sendHomework(new Task("20.3 Aspects"));
        homework2.sendHomework(new Task("Library App part 1"));
        homework2.sendHomework(new Task("Library App part 2 "));
        homework2.sendHomework(new Task("20.4 Observer"));
        homework3.sendHomework(new Task("13.1 Lambda"));
        homework3.sendHomework(new Task("13.2 Stream"));
        homework3.sendHomework(new Task("13.3 Flatmap "));
        homework3.sendHomework(new Task("13.4 Intstream"));
        //Then
        Assert.assertEquals(3, mentor1.getUpdates());
        Assert.assertEquals(7, mentor2.getUpdates());
    }
}
