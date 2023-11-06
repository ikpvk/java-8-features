package streams;

import dto.StudentDTO;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGrouping {
    public static void main(String[] args) {
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO(1,"Stud1", 20, new int[] {10,10,10}));
        studentList.add(new StudentDTO(2,"Stud2", 21, new int[] {10,9,8}));
        studentList.add(new StudentDTO(3,"Stud3", 22, new int[] {8,8,8}));
        studentList.add(new StudentDTO(4,"Stud4", 20, new int[] {6,6,6}));
        studentList.add(new StudentDTO(5,"Stud5", 21, new int[] {10,8,10}));
        studentList.add(new StudentDTO(6,"Stud6", 22, new int[] {9,10,10}));
        studentList.add(new StudentDTO(7,"Stud7", 22, new int[] {9,10,10}));

        //1st usage
        Map<Integer,List<StudentDTO>> studentMap = studentList.stream()
                .collect(
                        Collectors.groupingBy(StudentDTO::getAge)
                );
        System.out.println(studentMap);

        //2nd usage
        Map<Integer, Set<StudentDTO>> studentSet = studentList.stream()
                .collect(
                        Collectors.groupingBy(StudentDTO::getAge, Collectors.toSet())
                );
        System.out.println(studentSet);

        //3rd usage
        Map<Integer, List<String>> studentMapAgeName = studentList.stream()
                .collect(
                        Collectors.groupingBy(StudentDTO::getAge, Collectors.mapping(StudentDTO::getName,Collectors.toList()))
                );
        System.out.println(studentMapAgeName);

        //4th usage
        Map<Integer, Long> studentMapAgeCount = studentList.stream()
                .collect(
                        Collectors.groupingBy(StudentDTO::getAge, Collectors.counting())
                );
        System.out.println(studentMapAgeCount);


        //5th usage
        Hashtable<Integer, List<String>> studentHTAgeName = studentList.stream()
                .collect(
                        Collectors.groupingBy(StudentDTO::getAge,
                                Hashtable::new,
                                Collectors.mapping(StudentDTO::getName,
                                Collectors.toList()))
                );
        System.out.println(studentHTAgeName);
    }
}
