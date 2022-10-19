from punkt_alfa import Point
from named_point import NamedPoint


def main():
    w1: Point = Point(2, 3)
    w2: NamedPoint = NamedPoint(4, 3, "W2")
    print(Point.distance(w1, w2))


if __name__ == "__main__":
    main()
