package function;

import java.util.function.Function;

public class FunctionExample03 {
    public static void main(String[] args) {
        Function<Employee, String> employeeToStringName = e -> e.getName();
        Employee emp = new Employee("hkdemircan", 25);
        System.out.println(employeeToStringName.apply(emp));
    }
}
class Employee {
    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}