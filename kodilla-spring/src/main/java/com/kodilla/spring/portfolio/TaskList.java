package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    private final List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public final List<String> getTasks() {
        return tasks;
    }
}
