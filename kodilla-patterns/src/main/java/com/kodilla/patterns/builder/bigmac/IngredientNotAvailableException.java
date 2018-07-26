package com.kodilla.patterns.builder.bigmac;

public class IngredientNotAvailableException extends Exception {
    public IngredientNotAvailableException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}