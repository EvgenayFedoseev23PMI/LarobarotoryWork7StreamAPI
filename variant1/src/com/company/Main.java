package com.company;
import java.util.Arrays;
import java.util.function.Function;
public class Main {
    public static void main(String[] args) {
	Integer[] numbers={1,3,1};
	MinValueOfFunction minValueOfFunction=new MinValueOfFunction();
	String resultOfProject = minValueOfFunction.apply(numbers);
        System.out.println(resultOfProject);
    }
}
