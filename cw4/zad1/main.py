from osoba import Person


def main():
    p1: Person = Person("Jan","Kowalski")
    print(p1.age)
    Person.age = 15
    print(p1.age)
    p1.age = 40
    print(p1.age)
    Person.age = 25
    print(p1.age)

if __name__ == "__main__":
    main()