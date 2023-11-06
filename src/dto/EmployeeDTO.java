package dto;

public class EmployeeDTO {
    int empId;
    String name;
    String dept;
    double salary;

    public EmployeeDTO(int empId, String name, String dept, double salary) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
