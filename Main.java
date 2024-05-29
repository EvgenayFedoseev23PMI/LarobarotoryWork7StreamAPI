package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List <Integer>numbersOfProgramm = new ArrayList<>();
        numbersOfProgramm.add(1);
        numbersOfProgramm.add(2);
        numbersOfProgramm.add(3);
        numbersOfProgramm.add(4);
        numbersOfProgramm.add(5);
        double averageOfNumbers = numbersOfProgramm.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(averageOfNumbers);
    }
}