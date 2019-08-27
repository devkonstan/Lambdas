package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Employee, String> employeeToString = Employee::getName;
        List<Employee> employees = Arrays.asList(new Employee("test"), new Employee("test2"));
        showEmployee(employees, employeeToString);
    }
    static void showEmployee(List<Employee> employees, Function<Employee, String> showFunction) {
        for (Employee employee : employees) {
            System.out.println(showFunction.apply(employee));
        }
    }
}