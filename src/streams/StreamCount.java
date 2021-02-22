package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamCount {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(9);
        numberList.add(23);
        numberList.add(21);
        numberList.add(33);
        numberList.add(24);
        System.out.println("Before :" + numberList);

        // Count the number of even numbers
        long evenCount = numberList.stream().filter(e -> e % 2 == 0).count();
        System.out.println("Even numbers : " + evenCount);
    }
}
