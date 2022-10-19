from prosto import Prostokat
from typing import List
from funkcja import wypisz_pole


def main():
    p1: Prostokat = Prostokat(3, 4)
    p2: Prostokat = Prostokat(11, 2)
    lista: List[Prostokat] = [p1, p2]
    # [print(x.pole()) for x in lista]
    for x in lista:
        print(x.pole())

    for x in lista:
        wypisz_pole(x)


if __name__ == "__main__":
    main()
