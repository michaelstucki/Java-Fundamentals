package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.B2;

public class ChessPlayerController {
    public static void main(String[] args) {
        Bishop bW = new Bishop("WHITE");
        System.out.println(bW.getColor() + " " + bW.getName() + " " + bW.move());
        System.out.println(bW.getColor() + " " + bW.getName() + " " + bW.move(3));
        System.out.println("---------------------------------------");

        Rook rB = new Rook("BLACK");
        System.out.println(rB.getColor() + " " + rB.getName() + " " + rB.move());
        System.out.println(rB.getColor() + " " + rB.getName() + " " + rB.move(5));
        System.out.println("---------------------------------------");
    }
}
