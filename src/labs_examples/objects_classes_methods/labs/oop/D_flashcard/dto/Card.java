package labs_examples.objects_classes_methods.labs.oop.D_flashcard.dto;

public class Card {
    private static int nextId = 1;
    private int id = nextId++;
    private String front;
    private String back;

    public Card(String front, String back) {
        setFront(front);
        setBack(back);
    }

    public int getId() { return id; }

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return front + " : " + back;
    }
}
