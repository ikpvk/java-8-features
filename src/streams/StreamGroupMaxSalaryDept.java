package streams;

import dto.EmployeeDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupMaxSalaryDept {
    public static void main(String[] args) {
        List<EmployeeDTO> empList = new ArrayList<>();
        empList.add(new EmployeeDTO(1,"Emp1", "D1", 100));
        empList.add(new EmployeeDTO(2,"Emp2", "D1", 190));
        empList.add(new EmployeeDTO(3,"Emp3", "D1", 10));
        empList.add(new EmployeeDTO(4,"Emp4", "D2", 100));
        empList.add(new EmployeeDTO(5,"Emp5", "D2", 200));
        empList.add(new EmployeeDTO(6,"Emp6", "D2", 300));
        empList.add(new EmployeeDTO(7,"Emp7", "D3", 999));

        Map<String, Double> empMaxSalMap = empList.stream()
                .collect(
                        Collectors.groupingBy(EmployeeDTO::getDept,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(
                                                Comparator.comparingDouble(EmployeeDTO::getSalary)
                                        ),
                                        emp->emp.get().getSalary()
                                ))
                );

        System.out.println(empMaxSalMap);
    }
}
