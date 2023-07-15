import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {

    // map:representa la marca array: representara el modelo
    Map<String, Map<String, Integer>> typeCarAccepted;

    // leather or vinyl
    ArrayList<String> seatsMaterial;

    public UberBlack(
            String license, Account driver,
            Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList<String> seatsMaterial) {

        super(license, driver);

        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

}
