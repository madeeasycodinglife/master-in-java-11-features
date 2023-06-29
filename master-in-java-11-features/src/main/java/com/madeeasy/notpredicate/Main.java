package com.madeeasy.notpredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> tutorialsList = Arrays.asList("Java", "\n", "HTML", " ");

        List<String> tutorials = tutorialsList.stream()
                .filter(Predicate.not(String::isBlank))
                .toList();

        tutorials.forEach(System.out::println);
    }
}
