import pl.uwm.wmii.kmii.nazwisko.Osoba;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestOsoba {

    public static void main(String[] args)
    {
        ArrayList<Osoba> grupa = new ArrayList<>();
        grupa.add(new Osoba("Kowalski", LocalDate.of(2000,1,1)));
        grupa.add(new Osoba("Kowalski", LocalDate.of(2006,5,31)));
        grupa.add(new Osoba("Nowak", LocalDate.of(2000,1,1)));
        grupa.add(new Osoba("Nowak", LocalDate.of(2006,5,11)));
        grupa.add(new Osoba("Arecki", LocalDate.of(2011,6,21)));
        System.out.println("Przed");
        for(Osoba elem: grupa)
        {
            System.out.println(elem);
        }
        grupa.sort(null);
        System.out.println("Po");
        for(Osoba elem: grupa)
        {
            System.out.println(elem);
        }


    }
}
