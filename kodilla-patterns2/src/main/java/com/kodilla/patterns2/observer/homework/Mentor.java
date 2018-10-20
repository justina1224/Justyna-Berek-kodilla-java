package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String firstname;
    private final String lastname;
    private int updates;

    public Mentor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.updates = updates;
    }

    @Override
    public void update(StudentHomework studentHomeWork) {
        System.out.println(firstname + ", new exercise is waiting for your approval, student name: " +
                studentHomeWork.getStudentName() + ", title: " + studentHomeWork.getHomeworkList().peekLast().getTitle());
        updates++;
        System.out.println("You've got " + updates + (updates == 1?" new excecise":" new exercises"));
    }

    public int getUpdates() {
        return updates;
    }
}
