package labs_examples.objects_classes_methods.labs.oop.A_inheritance.ex01;

public class Rectangle extends Parallelogram {
    public Rectangle(String color, double acuteAngle, double length, double width) {
        super(color, acuteAngle, length, length, width, width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", top=" + top +
                ", bottom=" + bottom +
                ", left=" + left +
                ", right=" + right +
                ", acuteAngle=" + acuteAngle +
                '}';
    }

    @Override
    public double getArea() {
        return bottom * left;
    }
}
