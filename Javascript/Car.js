function Car(license, driver) {
  this.id;
  this.license = license;
  this.driver = driver;
  this.passegenger;
}
/* con este podemos crear un metodo a
partir de la function Car
*/
Car.prototype.printDataCar = function () {
  console.table(this.driver);
  // mostrara una tabla con todos los datos

  console.log(this.driver.name);
  console.log(this.driver.document);
  // console.log("License: " + this.license + " Name Driver: " + this.driver);
};
