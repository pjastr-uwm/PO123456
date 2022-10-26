from random import randint


class Coin:

    def __init__(self) -> None:
        self.side = True

    def show_side(self):
        return self.side

    def throw(self):
        if randint(0, 1):
            self.side = True
        else:
            self.side = False
