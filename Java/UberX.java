// necesitaria un constructor que coincida con la clase que estoy heredando
class UberX extends Car {

    String brand;
    String model;

    // se requiere un constructor que coincida con la clase que estoy heredando
    // porque automaticamente traemos todos los metodos y atributos que contiene la
    // clase Car
    public UberX(String license, Account driver, String brand, String model) {
        // super es para referirnos al metodo constructor de la clase padre
        super(license, driver);
        this.brand = brand;
        this.model = model;
        // TODO Auto-generated constructor stub
    }

}
