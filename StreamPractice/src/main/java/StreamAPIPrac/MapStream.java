package StreamAPIPrac;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
    public static void main(String[] args) {
        //squre all the number present in the list
        List<Integer> numlist = List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.println("-------normal way --------");
        List<Integer> newList = new ArrayList<>();
        int n ;
        for(int i : numlist){
            n=i * i;
            newList.add(n);
        }
        System.out.println(newList);
        System.out.println("-------Streams way --------");
        List<Integer> collected = numlist.stream().map(e -> e * e).collect(Collectors.toList());
        System.out.println(collected);
    }
}
