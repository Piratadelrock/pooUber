class Car {
    private Integer id;
    private String license;
    // se modifica el tipo de dato a Account para heredar los datos
    private Account driver;
    // modificador de acceso si no tiene nada toma el modificador como default
    protected Integer passenger;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

}