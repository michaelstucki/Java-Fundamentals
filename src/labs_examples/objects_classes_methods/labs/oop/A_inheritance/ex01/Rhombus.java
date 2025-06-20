package labs_examples.objects_classes_methods.labs.oop.A_inheritance.ex01;

public class Rhombus extends Parallelogram {
    public Rhombus(String color, double acuteAngle, double length) {
        super(color, acuteAngle, length, length, length, length);
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "color='" + color + '\'' +
                ", top=" + top +
                ", bottom=" + bottom +
                ", left=" + left +
                ", right=" + right +
                ", acuteAngle=" + acuteAngle +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 4 * bottom;
    }

    @Override
    public double getArea() {
        return Math.pow(bottom, 2) * Math.sin(acuteAngle * Math.PI / 180.0);
    }
}
