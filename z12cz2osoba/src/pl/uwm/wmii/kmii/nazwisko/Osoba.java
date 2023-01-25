package pl.uwm.wmii.kmii.nazwisko;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Osoba implements Comparable<Osoba>, Cloneable{

    public Osoba(String nazwisko, LocalDate dataUrodzenia)
    {
        this.nazwisko=nazwisko;
        this.dataUrodzenia=dataUrodzenia;
    }

    @Override
    public String toString()
    {
        return this.getClass().getSimpleName()+"["+
                this.nazwisko+", "+
                this.dataUrodzenia.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Osoba osoba = (Osoba) o;
        return this.nazwisko.equals(osoba.nazwisko) &&
                this.dataUrodzenia.equals(osoba.dataUrodzenia);
    }

    @Override
    public int compareTo(Osoba other) {
        int comparision = this.nazwisko.compareTo(other.nazwisko);
        if (comparision!= 0)
            return comparision;
        return this.dataUrodzenia.compareTo(other.dataUrodzenia);
    }

    public Osoba clone() throws CloneNotSupportedException
    {
        Osoba cloned = (Osoba) super.clone();
        return cloned;
    }

    private String nazwisko;
    private LocalDate dataUrodzenia;


}
