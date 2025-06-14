package labs_examples.objects_classes_methods.labs.objects.pojos_exercise_03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {
    Clock clock;
    Person person;

    public Controller(Clock clock, Person person) {
        this.clock = clock;
        this.person = person;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "clock=" + clock.toString() +
                ", person=" + person +
                '}';
    }

    public static void main(String[] args) {

        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        Clock clock = new Clock(time);
        Person person = new Person("Michael", "Stucki", 16);
        Controller controller = new Controller(clock, person);

        System.out.println(controller.toString());
    }
}
