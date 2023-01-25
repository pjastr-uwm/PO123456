import pl.uwm.wmii.kmii.nazwisko.Osoba;
import pl.uwm.wmii.kmii.nazwisko.Student;

import java.time.LocalDate;
import java.util.ArrayList;


public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> grupa = new ArrayList<>();
        grupa.add(new Student("Kowalski", LocalDate.of(2000,1,1),
                3.4));
        grupa.add(new Student("Kowalski", LocalDate.of(2006,5,31),
                2.9));
        grupa.add(new Student("Nowak", LocalDate.of(2000,1,1),
                4.9));
        grupa.add(new Student("Nowak", LocalDate.of(2000,1,1),
                3.9));
        grupa.add(new Student("Arecki", LocalDate.of(2011,6,21),
                4.2));

        System.out.println("Przed");
        for(Student elem: grupa)
        {
            System.out.println(elem);
        }
        grupa.sort(null);
        System.out.println("Po");
        for(Student elem: grupa)
        {
            System.out.println(elem);
        }
    }
}
