class Person:
    name: str
    surname: str
    age: int

    def __init__(self, name: str, surname: str, age: int) -> None:
        self.name = name
        self.surname = surname
        self.age = age
