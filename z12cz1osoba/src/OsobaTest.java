import pl.uwm.wmii.kmmi.nazwisko.Osoba;

import java.time.LocalDate;
import java.util.Arrays;

public class OsobaTest {

    public static void main(String[] args)
    {
        Osoba[] grupa = {
                new Osoba("Kowalski", LocalDate.of(2000,1,1)),
                new Osoba("Kowalski", LocalDate.of(1990,4,12)),
                new Osoba("Nowak", LocalDate.of(2010,11,3)),
                new Osoba("Nowak", LocalDate.of(2008,7,5)),
                new Osoba("Arecki", LocalDate.of(2000,1,1))

        };
        System.out.println("Przed");
        for(Osoba elem: grupa)
        {
            System.out.println(elem);
        }
        Arrays.sort(grupa);
        System.out.println("Po");
        for(Osoba elem: grupa)
        {
            System.out.println(elem);
        }
    }
}
