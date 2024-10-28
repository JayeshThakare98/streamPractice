package StreamAPIPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream1 {
    public static void main(String[] args) {
        // create a list and print even numbers from list
        Integer [] nums = {1,2,3,4,5,6,7,8,9,10};

        // create a list and print even numbers from list
        // without stream
        for(int i=0 ; i<= nums.length ; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        // with stream
        System.out.println("--------- Using stream  Collection method--------");
        List<Integer> numb = new ArrayList<>(Arrays.asList(nums));
        List<Integer> evenStream = numb.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenStream);
        System.out.println("--------- Using stream --------");
        numb.stream().filter(i -> i % 2 == 0).forEach(System.out::println);


        //Print numc who is greater than 6
        System.out.println("--------- Using normal method--------");
        for(int i=0 ;i<=nums.length;i++){
           if(i>=6){
               System.out.println(i);
           }
        }
        System.out.println("--------- Using stream  Collection method--------");
        List<Integer> collect = numb.stream().filter(i -> (i >= 6)).collect(Collectors.toList());
        System.out.println(collect);
        numb.stream().filter(i -> (i >= 6)).forEach(System.out::println);
    }
}
