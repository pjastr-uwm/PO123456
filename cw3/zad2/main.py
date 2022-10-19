from moneta import Coin


def main():
    m1: Coin = Coin(True)
    print(m1.show_side())
    m1.throw()
    print(m1.show_side())


if __name__ == "__main__":
    main()
