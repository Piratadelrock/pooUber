<?php

class UberPool extends Car
{
  public $typeCarAccepted;
  public $seatsMaterial;

  public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial)
  {
    // pasando los parametros a la superclase como en java super aca seria parent
    parent::__construct($license, $driver);

    $this->typeCarAccepted = $typeCarAccepted;
    $this->seatsMaterial = $seatsMaterial;
  }
}
