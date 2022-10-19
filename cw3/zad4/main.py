from statystyka import Stat
from typing import List


def main():
    lista1: List[float] = [3.4, 5.2, -8.2]
    lista2: List[float] = [1.1, 2.2, -3.2]
    print(Stat(lista1).suma())
    print(Stat(lista2).mini())


if __name__ == "__main__":
    main()
