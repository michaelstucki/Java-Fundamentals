package labs_examples.objects_classes_methods.labs.objects.pojos_exercise_03;

public class Clock {
    String time;

    public Clock(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "time='" + time + '\'' +
                '}';
    }
}
