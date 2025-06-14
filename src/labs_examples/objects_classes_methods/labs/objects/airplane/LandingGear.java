package labs_examples.objects_classes_methods.labs.objects.airplane;

public class LandingGear {
    private String state;

    public LandingGear() {
        this.state = "stowed";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "LandingGear{" +
                "state='" + state + '\'' +
                '}';
    }
}
