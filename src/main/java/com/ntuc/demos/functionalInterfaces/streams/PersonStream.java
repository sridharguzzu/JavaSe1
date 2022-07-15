package com.ntuc.demos.functionalInterfaces.streams;

import static com.ntuc.demos.functionalInterfaces.streams.Person.Gender.FEMALE;
import static com.ntuc.demos.functionalInterfaces.streams.Person.Gender.MALE;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Sridhar Guzzu
 */
public class PersonStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Jenny", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        // Printing the names using PersonStream
        people.stream()
                .map(person -> person.getName()) //Get all Names
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        // Printing the lengths of names using PersonStream
        people.stream()
                .map(person -> person.getName())
                .mapToInt(name -> name.length())
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        
        // Printing the list of Genders using streams
        people.stream()
                .map(person -> person.getGender())// Get all genders
                .collect(Collectors.toSet())// filling Genders into a set which removes duplicates
                .forEach(System.out::println); //print the set
    }
}
