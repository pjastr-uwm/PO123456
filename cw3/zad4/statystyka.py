from typing import List

class Stat:

    def __init__(self, lista: List[float]) -> None:
        self.x = lista

    def suma(self) -> float:
        return sum(self.x)

    def mini(self) -> float:
        return min(self.x)

    def maks(self) -> float:
        return max(self.x)