from __future__ import annotations


class Address:
    zipcode: str
    city: str
    nr_house: int
    street: str
    flat: int

    def __init__(self, zipcode: str, city: str, nr_house: int, street: str, flat: int = 0) -> None:
        self.zipcode = zipcode
        self.city = city
        self.nr_house = nr_house
        self.street = street
        self.flat = flat

    def show(self) -> None:
        print(f"Adres: {self.street} {self.nr_house}", end="")
        if self.flat != 0:
            print(f" {self.flat}", end="")

        print()
        print(f"Kod i miasto: {self.zipcode} {self.city}")

    def comes_before(self, other: Address) -> bool:
        return self.zipcode < other.zipcode
