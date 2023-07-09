from car import Car

# from del lugar donde viene, en este caso seria el nombre del archivo car.py y el nombre de la clase import Car
if __name__ == "__main__":
    print("Hola Mundo py")
    car = Car()
    car.license = "AMS123"
    car.driver = "Andres"
    # si quiero imprimir todos los datos y no necesito crear un metodo especial solo pongo vars y le paso el objeto
    print(vars(car))

    car2 = Car()
    car2.license = "QWE123"
    car2.driver = "Andrea"
    print(vars(car2))
