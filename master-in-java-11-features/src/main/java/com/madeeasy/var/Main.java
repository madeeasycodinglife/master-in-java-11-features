package com.madeeasy.var;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> tutorialsList = Arrays.asList("Java", "HTML");

        String tutorials = tutorialsList.stream()
                .map((var tutorial) -> tutorial.toUpperCase())
                .collect(Collectors.joining(", "));

        System.out.println("tutorials1 = " + tutorials);
        var tutorials2 = tutorialsList.stream()
                .map((var tutorial) -> tutorial.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println("tutorials2 = " + tutorials2);
    }
}
