package streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,3,5,6);

        //sum using reduce
        System.out.println(intList.stream()
                .reduce(0,(a,b)->a+b));

        //product using reduce
        System.out.println(intList.stream()
                .reduce(1,(a,b)->a*b));

        //max value using reduce
        System.out.println(intList.stream()
                .reduce(0,(a,b)->a>b?a:b));
    }
}
