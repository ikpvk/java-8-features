package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(23);
        numberList.add(24);
        numberList.add(33);
        System.out.println("Before :"+numberList);
        // New list to add 1 to each element
        List<Integer> mappedList = numberList.stream().map(e->e+1).collect(Collectors.toList());
        System.out.println("After filtering :"+mappedList);
    }
}
