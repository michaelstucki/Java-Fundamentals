package labs_examples.objects_classes_methods.labs.objects.airplane;

public class Airplane {
    private LandingGear landingGear;
    private Engine engine;
    private FlightComputer flightComputer;
    private Pilot pilot;
    private double fuelCapacity;
    private double currentFuelLevel;

    public Airplane(LandingGear landingGear, Engine engine, FlightComputer flightComputer) {
        this.landingGear = landingGear;
        this.engine = engine;
        this.flightComputer = flightComputer;
    }

    public LandingGear getLandingGear() {
        return landingGear;
    }

    public void setLandingGear(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public FlightComputer getFlightComputer() {
        return flightComputer;
    }

    public void setFlightComputer(FlightComputer flightComputer) {
        this.flightComputer = flightComputer;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "landingGear=" + landingGear +
                ", engine=" + engine +
                ", flightComputer=" + flightComputer +
                ", pilot=" + pilot +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }

    public static void main(String[] args) {

        Engine engine = new Engine();
        LandingGear landingGear = new LandingGear();
        FlightComputer flightComputer = new FlightComputer();
        Pilot pilot = new Pilot("Ollie");

        Airplane airplane = new Airplane(landingGear, engine, flightComputer);

        engine.setThrust(50);
        engine.setOn(true);
        System.out.println(engine.toString());

        landingGear.setState("deployed");
        System.out.println(landingGear.toString());

        flightComputer.setOn(true);
        flightComputer.setTemperature(20);
        System.out.println(flightComputer.toString());

        System.out.println(pilot.toString());

        System.out.println(airplane.toString());

    }
}
