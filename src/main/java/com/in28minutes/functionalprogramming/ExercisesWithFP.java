package com.in28minutes.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ExercisesWithFP {
    public static void main(String[] args) {
        IntStream.range(1,11).forEach(p-> System.out.println(p)); // printing from 1 to 10;

        IntStream.range(1,11).map(p->p*p).forEach(p-> System.out.println(p));
        // printing the squares from 1 to 10.

        List<String> list = new ArrayList<>(List.of("Apple","Ant","Bat"));
        list.stream().map(e->e.toLowerCase()).forEach(e-> System.out.println(e));
        //mapping all the elements to lowercase then printing them

        list.stream().map(e->e.length()).forEach(e-> System.out.println(e));



    }
}
