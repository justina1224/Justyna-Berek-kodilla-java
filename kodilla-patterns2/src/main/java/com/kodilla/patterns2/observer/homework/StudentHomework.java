package com.kodilla.patterns2.observer.homework;

import java.util.*;

public class StudentHomework implements Observable {
    private final String studentName;
    private Deque<Task> homeworkList;
    private List<Observer> mentors;

    public StudentHomework(String studentName) {
        this.studentName = studentName;
        this.mentors = new ArrayList<>();
        homeworkList = new ArrayDeque<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        mentors.add(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : mentors) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        mentors.remove(observer);
    }

    public String getStudentName() {
        return studentName;
    }

    public Deque<Task> getHomeworkList() {
        return homeworkList;
    }

    public void sendHomework(Task task) {
        homeworkList.offerLast(task);
        notifyObserver();
    }
}
