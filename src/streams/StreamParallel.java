package streams;

import java.util.Arrays;
import java.util.List;

public class StreamParallel {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5);
        listOfNumbers.parallelStream().forEach(number ->
                System.out.println(number)
        );
    }
}
