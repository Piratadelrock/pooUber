
class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo Java");

        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND1234"));
        car.passegenger = 3;
        car.printDataCar();

        Car car2 = new UberBlack("asd123",
                new Account("Andres Herrera", "AND1234"),
                "type", "vinyl");
        car2.passegenger = 5;
        car2.printDataCar();

        // Car car2 = new Car();
        // car2.license = "QWE123";
        // car2.driver = "Andrea Herrera";
        // car2.passegenger = 3;
        // car2.printDataCar();

    }
}