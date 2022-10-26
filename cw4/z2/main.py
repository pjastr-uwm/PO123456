from module_adres import Address


def main():
    a1: Address = Address("10-710", "Olsztyn", 54, "Słoneczna", 4)
    a1.show()
    a2: Address = Address("10-900", "Olsztyn", 1, "Plac JP II")
    print(a1.comes_before(a2))


if __name__ == "__main__":
    main()
