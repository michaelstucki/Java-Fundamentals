package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.B2;

public class Bishop extends ChessPlayer implements  ChessPlayerActions {
    private static final String name = "BISHOP";
    private enum Move {UP_LEFT, UP_RIGHT, DOWN_LEFT, DOWN_RIGHT}
    public Bishop(String color) {
        this.color = color;
    }

    public String getName() { return name; }
    public String getColor() { return color; }

    @Override
    public String move() {
        int index = RandomMove.getRandomIndex(Move.values().length);
        Move move = Move.values()[index];
        return String.valueOf(move);
    }

    @Override
    public String move(int places) {
        return move() + " " + places + " places";
    }
}
