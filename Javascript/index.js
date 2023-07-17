// declarando
var car = new Car("AW213", new Account("Andres", "123ASD"));
car.passenger = 4;
car.printDataCar();

// declarando uberX
var uberX = new UberX(
  "UBX212",
  new Account("Andrea Ferran", "123ASD"),
  "Chevrolet",
  "spark"
);
uberX.passenger = 4;
uberX.printDataCarU(uberX);
