from __future__ import annotations
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

    def get_licznik(self) -> int:
        return self.p

    def get_mianownik(self) -> int:
        return self.q

    def __float__(self) -> float:
        return self.p / self.q

    def __add__(self, other: Wymierna) -> Wymierna:
        return Wymierna(self.p * other.q + self.q * other.p, self.q * other.q)

    def __sub__(self, other: Wymierna) -> Wymierna:
        return Wymierna(self.p * other.q - self.q * other.p, self.q * other.q)

    # def __eq__(self, other: Wymierna) -> bool:
    #     return self.p == other.p and self.q == other.q

    def __ne__(self, other: Wymierna) -> bool:  # type: ignore[override]
        return self.p != other.p or self.q != other.q

    def __lt__(self, other: Wymierna) -> bool:
        return self.p * other.q < self.q * other.p

    def __le__(self, other: Wymierna) -> bool:
        return self.p * other.q <= self.q * other.p

    def __gt__(self, other: Wymierna) -> bool:
        return self.p * other.q > self.q * other.p

    def __ge__(self, other: Wymierna) -> bool:
        return self.p * other.q >= self.q * other.p

    def __mul__(self, other: Wymierna) -> Wymierna:
        return Wymierna(self.p * other.p, self.q * other.q)

    def __truediv__(self, other: Wymierna) -> Wymierna:
        if other.p == 0:
            raise ValueError("Nie dziel przez zero!")
        return Wymierna(self.p * other.q, self.q * other.p)

    # def __eq__(self, other: Wymierna) -> bool:  # type: ignore[override]
    #     return not (self < other) and not (other < self)

    def __eq__(self, other: object) -> bool:
        if not isinstance(other, Wymierna):
            return NotImplemented

        return self.p == other.p and self.q == other.q
