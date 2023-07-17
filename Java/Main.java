import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        System.out.println("Inicializando...");

        System.out.println("UberX:");
        UberX uberX = new UberX("UBX213",
                new Account("Juan",
                        "ASD212",
                        "juan@hotmail.com",
                        "1234"),
                "chevrolet",
                "Sonic");

        // de esta manera quedaria sin encapsular
        // uberX.passenger = 4;
        // de esta forma ya estaria encapsulado
        uberX.setPassenger(4);
        uberX.printDataCar();

        // creamos el objeto uberVan
        UberVan uberVan = new UberVan("UBX213",
                new Account("Luisa",
                        "ASD212",
                        "Luisa@hotmail.com",
                        "1234"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        // Car car = new Car("AMQ123", new Account("Andres Herrera", "AND1234"));
        // car.passenger = 3;
        // car.printDataCar();

        // Map<String, Map<String, Integer>> typeCarAccepted = new HashMap<>();
        // Map<String, Integer> innerMap = new HashMap<>();
        // innerMap.put("vinyl", 1);
        // typeCarAccepted.put("type", innerMap);

        // UberBlack uberBlack = new UberBlack("QWE123",
        // new Account("AndreA Herrera", "AND1234"),
        // "typeCarAccepted", "vma");
        // uberBlack.passenger = 5;
        // uberBlack.printDataCar();
        // System.out.println(uberBlack.typeCarAccepted);

        // forma 1 donde no hay herencia
        // Car car2 = new Car();
        // car2.license = "QWE123";
        // car2.driver = "Andrea Herrera";
        // car2.passenger = 3;
        // car2.printDataCar();

    }
}