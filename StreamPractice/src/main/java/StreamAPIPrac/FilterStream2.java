package StreamAPIPrac;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterStream2 {
    public static void main(String[] args) {
        List<String> namelist = List.of("jayesh", "Dogesh", "Don", "bon", "gone");
        //filter the name which starts form D
        System.out.println("---------- by normal method ------");
        List<String> filterList = new ArrayList<>();
        for(String name : namelist){
            if(name.toLowerCase().startsWith("d")){
                filterList.add(name);
            }
        }
        System.out.println(filterList);
        System.out.println("---------- by Stream method ------");
        List<String> collected = namelist.stream().filter(e -> e.toLowerCase().startsWith("d")).collect(Collectors.toList());
        System.out.println(collected);

    }
}
