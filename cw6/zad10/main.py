from study import Student


def main() -> None:
    s1: Student = Student(1234, "Anna")
    print(s1.__dict__)
    s1.student_class = "IIIc"
    print(s1.__dict__)
    del s1.student_name
    print(s1.__dict__)
    Student.adres ="Słoneczna"
    print(Student.__dict__)

    ## dostanie sie do nazwy klasy instancji
    print(type(s1)) ## typ
    print(type(s1).__name__) ## nazwa klasy instancji (stara wersja)
    print(s1.__class__.__name__) ## nazwa klasy instancji (nowa wersja)


if __name__ == "__main__":
    main()