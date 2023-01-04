package pl.uwm.zadb;

class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setPojemnoscSilnika(4.2);
        System.out.printf("Pojemnosc silnika: %f%n", c1.getPojemnoscSilnika());
        Car c2 = new Car(4.3,"Fiat");
    }
}
