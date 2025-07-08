package labs_examples.input_output.labs;

class Card {
    String front;
    String back;

    public Card(String front, String back) {
        this.front = front;
        this.back = back;
    }

    public String getFront() { return front; }
    public String getBack() { return back; }

    @Override
    public String toString() {
        return "Card{" +
               "front='" + front + '\'' +
               ", back='" + back + '\'' +
               '}';
    }
}
