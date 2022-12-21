package pl.uwm.wmii.lab10b;

public class Main {
    public static void main(String[] args)
    {
        Car c1 = new Car();
        System.out.println(c1.getYear());
        c1.setYear(2015);
        System.out.println(c1.getYear());
    }
}
