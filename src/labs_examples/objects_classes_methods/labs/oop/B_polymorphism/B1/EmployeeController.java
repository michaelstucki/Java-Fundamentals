package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.B1;

import java.util.ArrayList;

public class EmployeeController {
    public static void main(String[] args) {
        Employee devA = new Developer("John Doe");
        Employee manX = new Manager("Joe Smith");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(devA);
        employees.add(manX);

        for(Employee employee : employees) {
            employee.doWork();
            employee.takeBreak();
            employee.takePTO();
            employee.takePTO("Paris", 10);
            System.out.println("--------------------------------------------------------------");
        }
    }
}
