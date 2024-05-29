package com.company;
import java.util.Arrays;
import java.util.function.Function;
public class MinValueOfFunction {
    public String apply(Integer[] numbers) {
        String sortedString = Arrays.stream(numbers)
                .distinct()
                .sorted()
                .map(String::valueOf)
                .reduce("", String::concat);
        return
                String.valueOf(Integer.parseInt(sortedString));
    }
}

