class Car {
    Integer id;
    String license;
    // se modifica el tipo de dato a Account para heredar los datos
    Account driver;
    Integer passegenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        System.out.println("License: " + license + " Name Driver: " + driver.name);
    }
}