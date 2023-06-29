package com.madeeasy.collectionstoarray;

import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * Old Way
     * nameArray = nameList.toArray(new String[nameList.size()]);
     * <p>
     * New Way
     * nameArray = namesList.toArray(String[]::new);
     *
     * @param args
     */
    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("Joe", "Julie");
        // Old way
        String[] names = namesList.toArray(new String[namesList.size()]);
        System.out.println(names.length);
        // New way
        names = namesList.toArray(String[]::new);
        System.out.println(names.length);
    }
}
