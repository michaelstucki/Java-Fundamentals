package labs_examples.objects_classes_methods.labs.oop.A_inheritance.ex01;

public class Parallelogram {
    protected String color;
    protected double top, bottom, left, right;
    protected double acuteAngle; // degrees
    public Parallelogram(String color, double acuteAngle, double top, double bottom, double left, double right) {
        this.color = color;
        this.acuteAngle = acuteAngle;
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "color='" + color + '\'' +
                ", top=" + top +
                ", bottom=" + bottom +
                ", left=" + left +
                ", right=" + right +
                ", acuteAngle=" + acuteAngle +
                '}';
    }

    public double getPerimeter() {
        return top + bottom + left + right;
    }

    public double getArea() {
        return bottom * left * Math.sin(acuteAngle * Math.PI / 180.0);
    }
}
