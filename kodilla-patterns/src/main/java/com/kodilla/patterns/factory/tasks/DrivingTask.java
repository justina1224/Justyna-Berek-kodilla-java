package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    final boolean executed;

    public DrivingTask(final String taskName, final String where, final String using, final boolean executed) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.executed = executed;
    }

    @Override
    public String executeTask() {
        return "Driving " + where + " by " + using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
