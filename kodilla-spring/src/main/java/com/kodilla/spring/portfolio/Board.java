package com.kodilla.spring.portfolio;

public final class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = new TaskList();
        this.inProgressList = new TaskList();
        this.doneList = new TaskList();
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void addTaskToTheList(TaskList taskList, String taskName) {
        taskList.getTasks().add(taskName);
    }

    public void removeTaskFromTheList(TaskList taskList, String taskName) {

        if(taskList.getTasks().contains(taskName)) {
            taskList.getTasks().remove(taskName);
        } else {
            System.out.println("There is no " + taskName + " on the list");
        }
    }
}