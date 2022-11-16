from study import Student


def main() -> None:
    print(type(Student))
    s1: Student = Student("Jan")
    print(type(s1))
    print(Student.__dict__)
    print(s1.__dict__)
    print(Student.__module__)
    print(s1.__module__)

if __name__ == "__main__":
    main()