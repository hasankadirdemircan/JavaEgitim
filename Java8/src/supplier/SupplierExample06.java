package supplier;

import java.util.Optional;
import java.util.function.Supplier;

public class SupplierExample06 {
    public static void main(String[] args) {
        // we can imagine to db request
        Employee employee = findNameById(2L).orElseGet(() -> factory(() -> new Employee(2L, "java8", 2020)));
        System.out.println(employee.toString());
    }

    public static Employee factory(Supplier<? extends Employee> s) {
        Employee employee = s.get();
        return employee;
    }

    public static Optional<Employee> findNameById(Long id){
        Employee employee;
        if(id == 1){
            employee = factory(() -> new Employee(1L, "java8", 25));
        }else{
            employee = null;
        }
        return Optional.ofNullable(employee);
    }

}

class Employee{

    private Long id;
    private String name;
    private Integer age;

    public Employee(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
