from osoba import Osoba, Pracownik


def main() -> None:
    o1: Osoba = Osoba("Kowalski", 2000)
    print(o1.nazwisko)
    o1.nazwisko = "Nowak"
    # del o1.nazwisko
    print(o1.nazwisko)
    print(o1)
    print(Osoba.get_ile())
    print(o1.get_ile())
    p1: Pracownik = Pracownik("Nowak",2000,2020,5000)
    print(p1.nazwisko)
    print(p1.rok_urodzenia)
    print(p1.rok_zatrudnienia)
    print(p1.pobory)
    print(p1)
    print(p1.get_ile())
    print(Pracownik.get_ile())
    print(p1.pobory)
    p1.pobory = 5678


if __name__ == "__main__":
    main()
