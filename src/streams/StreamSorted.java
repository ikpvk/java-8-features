package streams;

import dto.BikeDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {
        List<BikeDTO> bikeList = new ArrayList<>();
        bikeList.add(new BikeDTO("Duke",100));
        bikeList.add(new BikeDTO("Bullet",150));
        bikeList.add(new BikeDTO("Ninja",150));
        bikeList.add(new BikeDTO("Splendor",90));
        System.out.println(bikeList);

        List<BikeDTO> bikeListSorted = bikeList.stream().sorted((bike1,bike2)->bike1.cost<bike2.cost?1:-1).collect(Collectors.toList());
        System.out.println("After sorting : ");
        System.out.println(bikeListSorted);
    }
}
