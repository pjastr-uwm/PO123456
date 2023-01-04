package pl.uwm.wmii;

class Osoba {

    public Osoba(String nazwisko, int rokUrodzenia)
    {
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rokUrodzenia;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString()
    {
        return getClass().getName() + ", nazwisko: " + this.nazwisko +", rok urodzenia: "+rokUrodzenia;
    }

    public boolean equals(Object otherObject) {
        // sprawdzamy czy obie referncje: this oraz otherObject
        // odnoszą sie do tego samego obiektu
        if (this == otherObject) {
            return true;
        }

        // zwracamy false gdy argument ma wartość null
        if (otherObject == null) {
            return false;
        }

        // zwracamy false gdy obiekty różnych klas
        if (getClass() != otherObject.getClass()) {
            return false;
        }

        Osoba other = (Osoba) otherObject;
        return this.nazwisko.equals(other.nazwisko) && this.rokUrodzenia == other.rokUrodzenia;
    }


    private String nazwisko;
    private int rokUrodzenia;
}
