package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.B1;

public class Manager extends Employee {
    public Manager(String name) {
        this.name = name;
        this.employeeType = "manager";
    }

    @Override
    public void doWork() {
        System.out.println("I, " + name + " (" + employeeType + "), appear to be working by attending meetings!");
    }

    @Override
    public void takeBreak() {
        System.out.println("I, " + name + " (" + employeeType + "), am taking a nap!");
    }

    @Override
    public void takePTO() {
        System.out.println("I, " + name + " (" + employeeType + "), am on yet more PTO!");
        onPTO = true;
    }

    @Override
    public void takePTO(String location, int duration) {
        System.out.println("I, " + name + " (" + employeeType + "), am on yet more PTO in " + location + " for " + duration + " days!");
        onPTO = true;
    }
}
