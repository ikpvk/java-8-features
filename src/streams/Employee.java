package streams;

public class Employee implements  Comparable{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee emp = (Employee) o;
        if(this.salary>emp.salary) {
            return 1;
        } else if (this.salary<emp.salary){
            return -1;
        } else{
            return 0;
        }
    }
}
