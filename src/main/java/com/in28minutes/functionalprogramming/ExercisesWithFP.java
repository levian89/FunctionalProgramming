package com.in28minutes.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExercisesWithFP {
    public static void main(String[] args) {
//        IntStream.range(1,11).forEach(p-> System.out.println(p)); // printing from 1 to 10;
//
//        IntStream.range(1,11).map(p->p*p).forEach(p-> System.out.println(p));
//        // printing the squares from 1 to 10.
//
//        List<String> list = new ArrayList<>(List.of("Apple","Ant","Bat"));
//        list.stream().map(e->e.toLowerCase()).forEach(e-> System.out.println(e));
//        //mapping all the elements to lowercase then printing them
//
//        list.stream().map(e->e.length()).forEach(e-> System.out.println(e));
//
//        int sum = IntStream.range(1,11).reduce(0,(n1, n2)->n1+n2); // reduce: it is taking a stream of numbers and it's
//        System.out.println(sum);                                          // converting into one result value; that's what is
//                                                                          // called terminal function (operation);
//
//        Optional<Integer> max = List.of(23,12,34,53).stream().max((n1, n2) -> Integer.compare(n1,n2)); // using an
//        System.out.println(max);                                    // implementation of Comparator interface for finding the
//                                                                    // max
//        int max1 = List.of(23,12,34,53).stream().max((n1, n2) -> Integer.compare(n1,n2)).get();
//        System.out.println(max1);
//
//        int min = List.of(23,12,34,53).stream().min((n1, n2) -> Integer.compare(n1,n2)).get();
//        System.out.println(min);

        List.of(23,12,34,53).stream().filter(e -> e%2==1).forEach(e -> System.out.println(e));

        List<Integer> list1 = List.of(23, 12, 34, 53).stream().filter(e -> e % 2 == 1).collect(Collectors.toList());
        System.out.println(list1);

        List<Integer> list2 = List.of(23, 12, 34, 53).stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(list2);

        IntStream intStream = IntStream.range(1, 11).map(p -> p * p);  // the type of the return thing it's something called
        System.out.println(intStream);                                 // a IntPipeline(it is not really a stream, it's not a
                                                                        // stream of Integer)
        List<Integer> list3 = IntStream.range(1, 11).map(p -> p * p).boxed().collect(Collectors.toList()); // .boxed() allows
        System.out.println(list3);                                                      // to convert this IntStream to a Stream

    }
}
