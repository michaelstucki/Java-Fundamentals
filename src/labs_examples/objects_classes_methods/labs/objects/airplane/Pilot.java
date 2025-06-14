package labs_examples.objects_classes_methods.labs.objects.airplane;

public class Pilot {
    String name;

    public Pilot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                '}';
    }
}
