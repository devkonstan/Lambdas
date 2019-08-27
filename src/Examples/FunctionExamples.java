package Examples;

import java.util.function.Function;

public class FunctionExamples {

    static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Function<String, Employee> stringEmployeeFunction = (String name) -> {
            return new Employee(name);
        };
        Employee employee = stringEmployeeFunction.apply("Piotr");
        System.out.println(employee);

        Function<Employee, String> employeeStringFunction  = (Employee emp) -> {
            String name = emp.getName();
            return name;
        };
        System.out.println("Name: " + employeeStringFunction.apply(employee));
    }
}
