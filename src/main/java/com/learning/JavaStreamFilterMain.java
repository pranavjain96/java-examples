package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaStreamFilterMain {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//
//        list.stream().filter(i -> i%2==0).forEach(System.out::println);
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Peter", "Pumpkin"), new Person("Peter", "Pan"),
                new Person("Minnie", "Mouse"), new Person("Mickey", "Mouse")
        ));

        persons.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName).reversed());
        persons.forEach(System.out::println);
    }
}
