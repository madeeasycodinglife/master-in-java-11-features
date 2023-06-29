package com.madeeasy.stringapis;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * String.repeat(int) − Repeats a string given number of times. Returns the concatenated string.
     * <p>
     * String.isBlank() − Checks if a string is empty or have white spaces only.
     * <p>
     * String.strip() − Removes the leading and trailing whitespaces.
     * <p>
     * String.stripLeading() − Removes the leading whitespaces.
     * <p>
     * String.stripTrailing() − Removes the trailing whitespaces.
     * <p>
     * String.lines() − Return the stream of lines of multi-line string.
     */
    public static void main(String[] args) {
        String sample = " abc ";
        System.out.println(sample.repeat(2)); // " abc  abc "
        System.out.println(sample.isBlank()); // false
        System.out.println("".isBlank()); // true
        System.out.println("   ".isBlank()); // true
        System.out.println(sample.strip()); // "abc"
        System.out.println(sample.stripLeading()); // "abc "
        System.out.println(sample.stripTrailing()); // " abc"
        sample = "This\nis\na\nmultiline\ntext.";

        List<String> lines = new ArrayList<>();

        sample.lines().forEach(lines::add);
        lines.forEach(System.out::println);
    }
}
