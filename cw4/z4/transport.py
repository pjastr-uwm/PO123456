class Car:
    performane: float
    max_fuel_level: float
    current_fuel_level: float

    def __init__(self, performance: float, max_fuel_level: float) -> None:
        self.performane = performance
        self.max_fuel_level = max_fuel_level
        self.current_fuel_level = 0

    def drive(self, length: float) -> None:
        self.current_fuel_level -= length / 1000 / self.performane
        if self.current_fuel_level < 0:
            self.current_fuel_level = 0

    def get_fuel_level(self) -> float:
        return self.current_fuel_level

    def add_fuel(self, fuel: float) -> None:
        self.current_fuel_level += fuel
        if self.current_fuel_level > self.max_fuel_level:
            self.current_fuel_level = self.max_fuel_level
