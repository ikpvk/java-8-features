package streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EmployeeComparisons {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Tony", 100.0);
        Employee e2 = new Employee(2, "Steve", 200.0);
        Employee e3 = new Employee(3, "Bruce", 150.0);

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        System.out.println("Before sorting : "+empList.stream().toList());
        Collections.sort(empList);
        System.out.println("After sorting : "+empList.stream().toList());

    }
}
