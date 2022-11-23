from study import Student

def main() -> None:
    s1: Student = Student()
    print(type(s1))  ## nie o to chodzi
    print(type(s1).__name__)  ## stara wersja
    print(s1.__class__.__name__)  ## rekomendowana


if __name__ == "__main__":
    main()

