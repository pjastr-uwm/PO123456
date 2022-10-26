from module_soda import SodaCan


def main():
    s1: SodaCan = SodaCan(3.2, 5.3)
    print(s1.get_volume())
    print(s1.get_surface_area())


if __name__ == "__main__":
    main()
