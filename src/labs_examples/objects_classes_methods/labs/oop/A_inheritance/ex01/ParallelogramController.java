package labs_examples.objects_classes_methods.labs.oop.A_inheritance.ex01;

import java.util.ArrayList;

public class ParallelogramController {
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram("green", 30.0, 2.5, 2.5, 1.0, 1.0);
        double RIGHT_ANGLE = 90.0;
        Rectangle rectangle = new Rectangle("yellow", RIGHT_ANGLE, 1.5, 2.0);
        Rhombus rhombus = new Rhombus("blue", 15.0, 1.2);
        Square square = new Square("red", RIGHT_ANGLE, 2.2);
        HollowSquare hollowSquare = new HollowSquare("purple", RIGHT_ANGLE, 2.2, 1.0);

        ArrayList<Parallelogram> parallelograms = new ArrayList<>();
        parallelograms.add(parallelogram);
        parallelograms.add(rectangle);
        parallelograms.add(rhombus);
        parallelograms.add(square);
        parallelograms.add(hollowSquare);

        for(Parallelogram element : parallelograms) {
            double perimeter = element.getPerimeter();
            double area = element.getArea();
            System.out.println(element.toString() + ", perimeter: " + perimeter + ", area: " + area);
        }
    }
}
