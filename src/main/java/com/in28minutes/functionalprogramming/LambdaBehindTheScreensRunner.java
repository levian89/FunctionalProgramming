package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

class EvenNumberPredicate implements Predicate<Integer> {  //Predicate - it is a FunctionalInterface

    @Override
    public boolean test(Integer number) {
        return number%2==0;
    }
}

class SystemOutConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer number) {
        System.out.println(number);
    }
}

public class LambdaBehindTheScreensRunner {


    public static void main(String[] args) {
        List.of(23, 43, 34, 45, 36, 48).stream()
                .filter(n -> n%2==0)
                .forEach(n-> System.out.println(n));

        List.of(23, 43, 34, 45, 36, 48).stream()
                .filter(new EvenNumberPredicate())
                .forEach(new SystemOutConsumer());


        //.filter(n -> n%2==0);
        //Stream<T> filter(Predicate<? super T> predicate); //.filter() it accepts a Predicate interface as a parameter
        //boolean test(T t);

        //.forEach(n-> System.out.println(n));
        //void forEach(Consumer<? super T> action); //.forEach() it accepts a Consumer interface as a parameter
        //void accept(T t);


    }
}
