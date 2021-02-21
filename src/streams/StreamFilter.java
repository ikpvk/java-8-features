package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(23);
        numberList.add(24);
        numberList.add(33);
        System.out.println("Before :"+numberList);
        // New list to filter even numbers
        List<Integer> filteredList = numberList.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println("After filtering :"+filteredList);
    }
}
