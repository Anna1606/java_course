public class Main {
    public static void main(String[] args) {

        Car car = new Car(160, "Car");
        Bus bus = new Bus(120, "Bus");
        SpeedCalculation speedCalculation = new SpeedCalculation();
        System.out.println(speedCalculation.calculateAllowedSpeed(car));
        System.out.println(speedCalculation.calculateAllowedSpeed(bus));

    }
}