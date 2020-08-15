package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinate;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinate = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinate.add(employee);
    }

    public void remove(Employee employee) {
        subordinate.remove(employee);
    }

    public List<Employee> getSubordinate(){
        return subordinate;
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
