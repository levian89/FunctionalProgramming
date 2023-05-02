package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.Optional;

public class OptionalClassIntroduction {
    public static void main(String[] args) {
        Optional<Integer> max = List.of(23, 45, 67, 12).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2));
        System.out.println(max);

        int max1 = List.of(23, 45, 67, 12).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)).get();
        System.out.println(max1);

        Optional<Integer> max2 = List.of(23, 45, 67).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2));
        System.out.println(max2);

        boolean max3 = List.of(23, 45, 67).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)).isPresent();
        System.out.println(max3);

        boolean max4 = List.of(23, 45, 67).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)).isEmpty();
        System.out.println(max4);

        int max5 = List.of(23, 45, 67).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);
        System.out.println(max5);

        int max6 = List.of(23, 45, 67, 34).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);
        System.out.println(max6);
    }
}
