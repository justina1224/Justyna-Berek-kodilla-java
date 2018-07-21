package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        TaskList toDoTasks = board.getToDoList();
        TaskList inProgressTasks = board.getInProgressList();
        TaskList doneTasks = board.getDoneList();

        //When
        board.addTaskToTheList(toDoTasks, "shopping");
        board.addTaskToTheList(inProgressTasks, "cleaning");
        board.addTaskToTheList(doneTasks, "baking");

        //Then
        Assert.assertEquals(1, toDoTasks.getTasks().size());
        Assert.assertEquals("shopping", toDoTasks.getTasks().get(0));
        Assert.assertEquals(1, inProgressTasks.getTasks().size());
        Assert.assertEquals("cleaning", inProgressTasks.getTasks().get(0));
        Assert.assertEquals(1, doneTasks.getTasks().size());
        Assert.assertEquals("baking", doneTasks.getTasks().get(0));
    }
}