package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class EvenNumberPredicate implements Predicate<Integer> {  //Predicate - it is a FunctionalInterface

    @Override
    public boolean test(Integer number) {
        return number%2==0;
    }
}

public class LambdaBehindTheScreensRunner {


    public static void main(String[] args) {
        List.of(23, 43, 34, 45, 36, 48).stream()
                .filter(n -> n%2==0)
                .forEach(n-> System.out.println(n));

        List.of(23, 43, 34, 45, 36, 48).stream()
                .filter(new EvenNumberPredicate())
                .forEach(n-> System.out.println(n));


        //Stream<T> filter(Predicate<? super T> predicate);
        //boolean test(T t);

    }
}
