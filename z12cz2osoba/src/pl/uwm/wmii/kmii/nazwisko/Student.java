package pl.uwm.wmii.kmii.nazwisko;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen=sredniaOcen;
    }

    @Override
    public String toString()
    {
        return this.getClass().getSimpleName()+"["+
                getNazwisko()+", "+
                getDataUrodzenia().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))+
                ", "+this.sredniaOcen+"]";
    }

    public Student clone() throws CloneNotSupportedException
    {
        Student cloned = (Student) super.clone();
        return cloned;
    }

    public int compareTo(Osoba s)
    {
        if (s instanceof Student)
        {
            Student s2 = (Student) s;
            int comparision = super.compareTo(s2);
            if (comparision!=0 )
            {
                return comparision;
            }
            return Double.compare(this.sredniaOcen, s2.sredniaOcen);
        }
        return super.compareTo(s);
    }


    public double sredniaOcen;


}
