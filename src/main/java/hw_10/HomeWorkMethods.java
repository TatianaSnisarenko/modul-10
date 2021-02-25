package hw_10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class HomeWorkMethods {
    //Task 1
    public static String convertListOfNamestoStringWithOddIndex(List<String> names) {
        return names.stream()
                .map(name -> "" + (names.indexOf(name)) + ". " + name)
                .filter(name -> Integer.parseInt(name.substring(0, 1)) % 2 == 1)
                .collect(Collectors.joining(", "));
    }

    //Task 2
    public static List<String> convertListToUpperCaseReverseOrder(List<String> list) {
        return list.stream()
                .map(e -> e.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(toList());
    }

    //Task 3

    public static String convertStringArrayToStringOfSortedInts(String[] strings) {
        return Arrays.stream(strings)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .sorted(Comparator.comparingInt(Integer::parseInt))
                .collect(Collectors.joining(", "));
    }

    //Task 4
    public static Stream<Long> generateRandomNumbersStream(long a, long c, long m, long seed) {
        if (checkParameters(a, c, m, seed)) {
            return Stream.iterate(seed, n -> 1 * (a * n + c) % m);
        } else {
            throw new RuntimeException("Invalid parameters");
        }
    }

    private static boolean checkParameters(long a, long c, long m, long seed) {
        if (m >= 2
                && a >= 0 && a < m
                && c >= 0 && c < m
                && seed >= 0 && seed < m) {
            return true;
        } else {
            return false;
        }
    }

    //Task 5
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        return Stream.concat(first, second).collect(Collectors.collectingAndThen(
                toList(),
                list -> {
                    Collections.shuffle(list);
                    return list.stream();
                }));
    }
}
