package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class EvenNumberPredicate implements Predicate<Integer> {  //Predicate - it is a FunctionalInterface

    @Override
    public boolean test(Integer number) {
        return number%2==0;
    }
}

class SystemOutConsumer implements Consumer<Integer> {    // Consumer - a FunctionalInterface

    @Override
    public void accept(Integer number) {
        System.out.println(number);
    }
}

class NumberSquareMapper implements Function<Integer,Integer> {   // Function - a FunctionalInterface

    @Override
    public Integer apply(Integer number) {
        return number * number;
    }
}

public class LambdaBehindTheScreensRunner {

    //1.Storing functions into variables
    //2.Passing functions to methods
    //3.Returning functions from methods
    //These are all possible only because of functional interfaces


    public static void main(String[] args) {

        Predicate<Integer> evenPredicate = n -> n % 2 == 0;
        Predicate<Integer> oddPredicate = n -> n % 2 == 1;

        List.of(23, 43, 34, 45, 36, 48).stream()
                .filter(evenPredicate) // 1. this is storing functions in variables
                .map(n -> n*n)  // 2. we are passing a method, a function to a method
                .forEach(n-> System.out.println(n));

        List.of(23, 43, 34, 45, 36, 48).stream()
                .filter(createEvenPredicate()) // 3. this is returning a function/method back from a method
                .map(n -> n*n)  // 2. we are passing a method, a function to a method
                .forEach(n-> System.out.println(n));

        List.of(23, 43, 34, 45, 36, 48).stream()
                .filter(n -> n%2==0)
                .map(n -> n*n)  // 2. we are passing a method, a function to a method
                .forEach(n-> System.out.println(n));

        List.of(23, 43, 34, 45, 36, 48).stream()
                .filter(new EvenNumberPredicate())
                .map(new NumberSquareMapper())
                .forEach(new SystemOutConsumer());


        //.filter(n -> n%2==0)
        //Stream<T> filter(Predicate<? super T> predicate); //.filter() it accepts a Predicate interface as a parameter
        //boolean test(T t);

        //.forEach(n-> System.out.println(n));
        //void forEach(Consumer<? super T> action); //.forEach() it accepts a Consumer interface as a parameter
        //void accept(T t);

        //.map(n -> n*n)
        //<R> Stream<R> map(Function<? super T, ? extends R> mapper); //.map() it accepts a Function interface as a parameter
        //R apply(T t);


    }

    private static Predicate<Integer> createEvenPredicate() {
        return n -> n % 2 == 0;
    }
}
