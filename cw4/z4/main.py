from transport import Car


def main():
    my_car = Car(20, 40)  # Wydajno´s´c 20 km/litr, pojemno´s´c baku 40
    my_car.add_fuel(30)
    my_car.drive(100)
    print(my_car.get_fuel_level())


if __name__ == "__main__":
    main()
