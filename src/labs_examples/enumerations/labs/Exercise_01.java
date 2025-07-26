package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to its constructor. Demonstrate the use
 *      of this enum from a separate class.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        EnumDemo demo = new EnumDemo();
        SportEvents se = SportEvents.FOOTBALL;
        String go = demo.goStatus(se) ? "go" : "not go";
        int ticketPrice = se.getTicketPrice();
        System.out.println("I will " + go + " watch a " + se.toString().toLowerCase() + " game that cost $" + ticketPrice + "!");

        se = SportEvents.BASEBALL;
        go = demo.goStatus(se) ? "go" : "NOT go";
        ticketPrice = se.getTicketPrice();
        System.out.println("I will " + go + " watch a " + se.toString().toLowerCase() + " game that cost $" + ticketPrice + "!");
    }
}

class EnumDemo {
    boolean goStatus(SportEvents se) {
        return switch (se) {
            case FOOTBALL -> true;
            case BASEBALL -> false;
            case BASKETBALL -> false;
            default -> throw new UnsupportedOperationException();
        };
    }
}

enum SportEvents {
    FOOTBALL(1000), BASEBALL(50), BASKETBALL(200);
    private final int ticketPrice;
    SportEvents(int ticketPrice) { this.ticketPrice = ticketPrice; }
    public int getTicketPrice() { return ticketPrice; }
}
