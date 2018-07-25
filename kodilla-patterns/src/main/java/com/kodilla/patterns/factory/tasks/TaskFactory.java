package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass) {
        switch(taskClass) {
            case SHOPPING:
                return new ShoppingTask("shopping", "gifts for friends", 2, true);
            case PAINTING:
                return new PaintingTask("painting", "white", "living room", false);
            case DRIVING:
                return new DrivingTask("driving", "home", "car",true);
            default:
                return null;
        }
    }
}
