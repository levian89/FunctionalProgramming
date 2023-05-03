package com.in28minutes.functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(4,6,8,13,3,15));

        //Imperative style of programming (OOP and structured programming) (we are telling what to do, how to do it,
        //and the code is undergoing mutation of the variables) vs functional programming
        // which allows a declarative style of programming (you just tell what to do);


//        printBasic(numbers);
//
//        printWithFP(numbers);
//
//        int sum = normalSum(numbers);
//        System.out.println(sum);
//
        int sum = fpSum(numbers);
        System.out.println(sum);
//
//        int sum = normalSumWithFiltering(numbers);
//        System.out.println(sum);

//        int sum = fpSumWithFiltering(numbers);
//        System.out.println(sum);
    }

    private static int fpSumWithFiltering(List<Integer> numbers) {
        return numbers.stream().filter(number -> number%2 == 1).reduce(0, (number1, number2) -> number1 + number2);
    }


    private static int fpSum(List<Integer> numbers) {    // here we are just saying what to do
                                                        // in fp we avoid mutation of variable and we focus on telling
                                                        // what to do
        return numbers.stream()
                .reduce(0, (number1, number2) -> {     // lambda expression: in the lambda expression, we create method
                    System.out.println(number1 + " " +number2);  // definition in shortcut format; a lambda expression
                    return number1 + number2;                   // has parameters (number1, number2) and has a body: sout and
                });                                             // return
    }


    private static int normalSumWithFiltering(List<Integer> numbers) {
        int sum = 0;
        for (int number: numbers) {
            if (number%2==1) {
                sum += number;
            }
        }
        return sum;
    }

    private static int normalSum(List<Integer> numbers) {
        int sum = 0;    // we are saying what to do and how to do it
        for (int number: numbers) {
            sum += number;  // mutations
        }
        return sum;
    }

    private static void printWithFP(List<Integer> numbers) {
        numbers.stream().forEach(element -> System.out.println(element));
    }

    private static void printBasic(List<Integer> numbers) {
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
