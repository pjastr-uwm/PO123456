from module_stud import Student


def main():
    s1: Student = Student("Jan", "Kowalski", 100, 4)
    print(s1.get_total_score())
    s1.add_quiz(20)
    print(s1.get_total_score())
    print(s1.get_average_score())


if __name__ == "__main__":
    main()
