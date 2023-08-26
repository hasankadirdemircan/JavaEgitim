package builder_design_pattern;

public class Main {
    public static void main(String[] args) {
       // Employee employee = new Employee(); mecbur, Employee constructor'ının
        //istediği tüm bilgileri vermek zorundayım. Kısıtlama veya genişletme yapamam.

        Employee employee1 = new Employee.EmployeeBuilder("Kadir", "Java Developer").build();
        Employee employee2 = new Employee.EmployeeBuilder("hasan", "Data Engineer")
                .setAge(24)
                .setLastName("Demircan").build();

        Employee employee3 = new Employee.EmployeeBuilder("hasan", "Data Engineer")
                .setAge(24)
                .setSalary(1)
                .setLastName("Demircan").build();
        System.out.println();
    }
}
