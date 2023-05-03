package com.in28minutes.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

    public static void print(Integer number) {
        System.out.println(number);
    }

    public static void main(String[] args) {
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(s->s.length())
                .forEach(s-> System.out.println(s));

        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(s->s.length())
                .forEach(System.out::println); // this is a method reference which is a shortcut for the above one;
                                               // on the left hand side is the class (System.out), and on the right hand
                                               // side is the method (println) with which the class would want to talk to;

        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(s->s.length())
                .forEach(s-> MethodReferencesRunner.print(s));

        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(String::length) // using a method reference which is being called on an instance method
                .forEach(MethodReferencesRunner::print); // using a method reference which is being called on a static method

        Integer max = List.of(23, 45, 67, 34).stream()
                .filter(n -> n % 2 == 0)
                .max((n1, n2) -> Integer.compare(n1, n2))
                .orElse(0);
        System.out.println(max);

        Integer max1 = List.of(23, 45, 67, 34).stream()
                .filter(MethodReferencesRunner::isEven)
                .max(Integer::compare)
                .orElse(0);
        System.out.println(max1);
    }

    public static boolean isEven(Integer number) {
        return number%2==0;
    }
}
