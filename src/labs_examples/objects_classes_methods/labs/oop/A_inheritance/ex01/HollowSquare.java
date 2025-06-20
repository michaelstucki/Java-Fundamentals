package labs_examples.objects_classes_methods.labs.oop.A_inheritance.ex01;

public class HollowSquare extends Square {
    private double innerLength;
    public HollowSquare(String color, double acuteAngle, double length, double innerLength) {
        super(color, acuteAngle, length);
        this.innerLength = innerLength;
    }

    @Override
    public String toString() {
        return "HollowSquare  {" +
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
        return super.getArea() - Math.pow(innerLength, 2);
    }
}
