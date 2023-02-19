package pl.uwm.wmii;

class Nauczyciel extends Osoba{

    public Nauczyciel(String nazwisko, int rokUrodzenia, double pensja)
    {
        super(nazwisko,rokUrodzenia);
        this.pensja=pensja;
    }
    private double pensja;
}
