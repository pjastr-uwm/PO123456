class Person:
    name: str

    def __init__(self, name: str) -> None:
        self.name = name

    def get_name_lenght(self) -> int:
        return len(self.name)