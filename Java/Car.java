class Car {
    Integer id;
    String license;
    // se modifica el tipo de dato a Account para heredar los datos
    Account driver;
    // modificador de acceso si no tiene nada toma el modificador como default
    private Integer passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if (passenger != null) {
            System.out
                    .println("License: " + license + " Name Driver: " + driver.name + " passengers: " + passenger);
        }
    }

    public Integer getPassenger() {
        return passenger;
    }

    void setPassenger(Integer passenger) {
        if (passenger == 4) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

}