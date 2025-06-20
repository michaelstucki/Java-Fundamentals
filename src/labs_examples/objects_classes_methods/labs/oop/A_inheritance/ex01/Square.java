package labs_examples.objects_classes_methods.labs.oop.A_inheritance.ex01;

public class Square extends Rhombus {
    public Square(String color, double acuteAngle, double length) {
        super(color, acuteAngle, length);
    }

    @Override
    public String toString() {
        return "Square  {" +
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
