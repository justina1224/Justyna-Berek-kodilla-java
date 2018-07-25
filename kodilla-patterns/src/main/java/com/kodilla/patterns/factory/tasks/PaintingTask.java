package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    final boolean executed;

    public PaintingTask(final String taskName, final String color, final String whatToPaint, final boolean executed) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.executed = executed;
    }

    @Override
    public String executeTask() {
        return "Painting " + whatToPaint + ", chosen color: white";
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
