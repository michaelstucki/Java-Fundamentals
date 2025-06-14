package labs_examples.objects_classes_methods.labs.objects.airplane;

public class FlightComputer {
    private boolean isOn;
    private double temperature;

    public FlightComputer() {}

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "FlightComputer{" +
                "isOn=" + isOn +
                ", temperature=" + temperature +
                '}';
    }
}
