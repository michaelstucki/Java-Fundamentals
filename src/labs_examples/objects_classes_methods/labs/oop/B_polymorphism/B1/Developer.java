package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.B1;

public class Developer extends Employee {
    public Developer(String name) {
        this.name = name;
        this.employeeType = "developer";
    }

    @Override
    public void doWork() {
        System.out.println("I, " + name + " (" + employeeType + "), am doing value added work!");
    }

    @Override
    public void takeBreak() {
        System.out.println("I, " + name + " (" + employeeType + "), am taking a much needed coffee break!");
    }

    @Override
    public void takePTO() {
        System.out.println("I, " + name + " (" + employeeType + "), am on PTO, please don't call me!");
        onPTO = true;
    }

    @Override
    public void takePTO(String location, int duration) {
        System.out.println("I, " + name + " (" + employeeType + "), am on PTO in " + location + " for " + duration + " days!");
        onPTO = true;
    }
}
