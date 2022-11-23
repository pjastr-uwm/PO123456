from osoba import Osoba


def main() -> None:
    o1: Osoba = Osoba("Kowalski", 2000)
    print(o1.nazwisko)
    o1.nazwisko = "Nowak"
    # del o1.nazwisko
    print(o1.nazwisko)


if __name__ == "__main__":
    main()
