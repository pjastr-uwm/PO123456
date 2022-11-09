from math import gcd


class Wymierna:
    p: int
    q: int

    def __init__(self, licznik: int = 0, mianownik: int = 1) -> None:
        if mianownik == 0:
            raise ValueError("Mianownik równa się zera!")

        self.p = licznik
        self.q = mianownik
        nwd: int = gcd(licznik, mianownik)
        if nwd != 1:
            self.p //= nwd
            self.q //= nwd

        if mianownik < 0:
            self.p *= (-1)
            self.q *= (-1)

    def __repr__(self) -> str:
        return f"{self.p}/{self.q}"
