package com.kodilla.stream;

import com.kodilla.stream.beautifier.CapitalizingWords;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("There is only one way to avoid criticism: do nothing, say nothing, and be nothing", (stringToBeautify) -> stringToBeautify.toUpperCase());
        poemBeautifier.beautify("I can accept failure, everyone fails at something. But I can’t accept not trying", (stringToBeautify) -> "***" + stringToBeautify + "***");
        poemBeautifier.beautify("Doing what you like is freedom. Liking what you do is happiness", (stringToBeautify -> stringToBeautify.replace("o","O")));
        poemBeautifier.beautify("Appearances are deceptive", CapitalizingWords::capEachWord);

    }
}
