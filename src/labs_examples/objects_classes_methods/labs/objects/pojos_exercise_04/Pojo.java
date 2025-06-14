package labs_examples.objects_classes_methods.labs.objects.pojos_exercise_04;

public class Pojo {
    String firstName;
    String lastName;
    int age;

    public Pojo() {}
    public Pojo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Pojo(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
