from car import Car
from account import Account

# from del lugar donde viene, en este caso seria el nombre del archivo car.py y el nombre de la clase import Car
if __name__ == "__main__":
    print("Hola Mundo py")

    car = Car("AMS123", Account("Andres", "AND234"))
    # si quiero imprimir todos los datos y no necesito crear un metodo especial solo pongo vars y le paso el objeto
    print(vars(car))
    print(vars(car.driver))
