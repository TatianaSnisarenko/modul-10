package hw_10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Ivan", "Igor", "Peter", "Olga", "Kate", "Vlad", "Elena", "Nick", "John");
        String[] strings = {"1, 2, 0", "4, 5"};

        System.out.println("Testing task 1: converting List of names into String with odd Index:\n"
                + HomeWorkMethods.convertListOfNamestoStringWithOddIndex(names));

        System.out.println("-----------------------------");

        System.out.println("Testing task 2: converting List of names to UpperCase in reverse order:\n"
                + HomeWorkMethods.convertListToUpperCaseReverseOrder(names));

        System.out.println("-----------------------------");

        System.out.println("Testing task 3: converting List of strings with ints to string of odered ints:\n"
                + HomeWorkMethods.convertStringArrayToStringOfSortedInts(strings));

        System.out.println("-----------------------------");

        System.out.println("Testing task 4: random numbers generator:\n"
                + HomeWorkMethods.generateRandomNumbersStream(25214903917l, 11, (long) Math.pow(2, 48), 29)
                .limit(20)
                .collect(Collectors.toList()));

        System.out.println("-----------------------------");

        System.out.println("Testing task 5: shuffling 2 streams while the least has next element for ints:\n"
                + HomeWorkMethods.zip(Stream.of(1, 2, 3, 4, 5), Stream.of(21, 22, 23)).collect(Collectors.toList()));

        System.out.println("-----------------------------");

        System.out.println("Testing task 5: shuffling 2 streams while the least has next element for Strings:\n"
                + HomeWorkMethods.zip(Stream.of("1", "2", "3", "4", "5"), Stream.of("21", "22", "23", "24", "25", "26", "27")).collect(Collectors.toList()));

    }
}
