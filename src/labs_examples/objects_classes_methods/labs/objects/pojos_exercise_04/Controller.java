package labs_examples.objects_classes_methods.labs.objects.pojos_exercise_04;

public class Controller {

    public static void main(String[] args) {

        Pojo p1 = new Pojo();
        Pojo p2 = new Pojo("Michael", "Stucki");
        Pojo p3 = new Pojo("Dorothy", "Sayers", 12);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
