<?php
// EJECUTANDO CON EXTENSION DE PHP SERVER EN VSCODE
require_once('Car.php');
require_once('UberX.php');
require_once('UberPool.php');
require_once('Account.php');

$uberX = new UberX("aut220", new Account("Andres", "123023"), "Chevrolet", "spark");
$uberX->printDataCar();

$uberPool = new UberPool("CAS234", new Account("Andrea", "ANDA234"), "Dodge", "Attitud");
$uberPool->printDataCar();


?>


<h1>UberX Driver: <?php $uberX->printDataCar() ?> </h1>
<h1>uberPool Driver: <?php $uberPool->printDataCar() ?> </h1>