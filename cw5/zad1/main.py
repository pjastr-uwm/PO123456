from liczby import Wymierna


def main():
    w1: Wymierna = Wymierna(4, 2)
    print(w1)
    print(float(w1))
    print(type(float(w1)))
    w2: Wymierna = Wymierna(1, 2)
    w3: Wymierna = Wymierna(1, -3)
    print(w2 + w3)
    print(w2 - w3)
    w4: Wymierna = Wymierna(5, 10)
    print(w2 == w4)
    print(w2 != w4)
    print(w2 < w4)
    print(w2 <= w4)
    print(w2 > w4)
    print(w2 >= w4)
    print(w2 < w3)
    print(w2 <= w3)
    print(w2 > w3)
    print(w2 >= w3)
    print(w2*w3)
    print(w2 / w3)
    zero: Wymierna = Wymierna()
    # print(w2/zero)


if __name__ == "__main__":
    main()
