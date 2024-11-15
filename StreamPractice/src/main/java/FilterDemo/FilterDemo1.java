package FilterDemo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo1 {

    public static void main(String[] args) {
        // create list of integers and get only even numbers
        List<Integer> numList = Arrays.asList(1, 2, 1, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 10, 21, 68, 68);

        List<Integer> evenList = numList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);
        // create list of integers and get only odd numbers

        System.out.println("--------------");
        List<Integer> oddList = numList.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println(oddList);

        System.out.println("Removing Duplicates Integers ");
        List<Integer> dupRemove = numList.stream().distinct().collect(Collectors.toList());
        System.out.println(dupRemove);

        //2) How do you remove duplicate elements from a list using Java 8 streams?
        System.out.println("Removing Duplicates Charecters ");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> dupcharRemove = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(dupcharRemove);

        //3) How do you find frequency of each character in a string using Java 8 streams?
        String inputString = "Java Concept Of The Day";
        Map<Character, Long> freqCal = inputString.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqCal);

//        4) How do you find frequency of each element in an array or a list?
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> freqCheck = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqCheck);

//       5) How do you sort the given list of decimals in reverse order?
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Double> sortedDouble = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedDouble);

//        6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        List<String> appList = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedString = appList.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinedString);

//        7) From the given list of integers, print the numbers which are multiples of 5?
//        List<Integer> numList = Arrays.asList(1, 2, 1, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 10, 21, 68, 68);
        List<Integer> countFive = numList.stream().filter(n -> n % 5 == 0).collect(Collectors.toList());
        System.out.println(countFive);

//        8) Given a list of integers, find maximum and minimum of those numbers?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> sortedList = listOfIntegers.stream().sorted().collect(Collectors.toList());
        Integer first = sortedList.get(0);
        Integer last = sortedList.get(sortedList.size()-1);

        System.out.println(sortedList);
        System.out.println(first);
        System.out.println(last);

//        9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?
        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        int[] concatedSorted = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(concatedSorted));


    }
}
