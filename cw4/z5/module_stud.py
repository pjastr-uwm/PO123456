class Student:
    name: str
    surname: str
    all: int
    number: int

    def __init__(self, name: str, surname: str, all: int, number: int) -> None:
        self.name = name
        self.surname = surname
        self.all = all
        self.number = number

    def get_name(self) -> str:
        return self.name

    def add_quiz(self, score: int) -> None:
        self.all += score
        self.number += 1

    def get_total_score(self) -> int:
        return self.all

    def get_average_score(self) -> float:
        return self.all / self.number
