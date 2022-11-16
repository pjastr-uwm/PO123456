from people import Person


def main() -> None:
    print(dir(Person))
    p1: Person = Person("Anna")
    print(dir(p1))
    print(p1.get_name_lenght())
    print(Person.get_name_lenght(p1))


if __name__ == "__main__":
    main()