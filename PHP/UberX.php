<?php
// traemos el archivo php para la extension
require_once('Car.php');
class UberX extends Car
{
  public $brand;
  public $model;

  public function __construct($license, $driver, $brand, $model)
  {
    // pasando los parametros a la superclase como en java super aca seria parent
    parent::__construct($license, $driver);

    $this->brand = $brand;
    $this->model = $model;
  }
}
