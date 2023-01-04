package pl.uwm.zade;

class Osoba {

    public Osoba()
    {

    }

    public Osoba(String imie, String nazwisko, int rokUrodzenia)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rokUrodzenia;
    }

    public void wypiszInfo()
    {
        System.out.printf("Osoba. %s %s %d%n", this.imie, this.nazwisko, this.rokUrodzenia);
    }

    protected String imie;
    protected String nazwisko;
    protected int rokUrodzenia;
}
