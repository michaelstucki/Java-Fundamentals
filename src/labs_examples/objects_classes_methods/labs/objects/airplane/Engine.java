package labs_examples.objects_classes_methods.labs.objects.airplane;

public class Engine {
    private double thrust; // percentage of maximum
    private boolean isOn;

    public Engine() {}

    public double getThrust() {
        return thrust;
    }

    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "thrust=" + thrust +
                ", isOn=" + isOn +
                '}';
    }
}
