package com.kodilla.stream.beautifier;

public class CapitalizingWords {
    public static String capEachWord(String stringToBeautify) {
        String result = "";
        String[] splitString = stringToBeautify.split(" ");
        for (String target : splitString) {
            result += Character.toUpperCase(target.charAt(0))
                    + target.substring(1) + " ";
        }
        return result.trim();
    }
}
