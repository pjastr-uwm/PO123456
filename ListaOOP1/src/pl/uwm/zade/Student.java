package pl.uwm.zade;

class Student extends Osoba{
    public Student()
    {

    }

    public Student(String imie, String nazwisko, int rokUrodzenia, int rok, int numerGrupy, int numerAlbumu)
    {
        //super(imie, nazwisko,rokUrodzenia);
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rokUrodzenia;
        this.rok=rok;
        this.numerGrupy=numerGrupy;
        this.numerAlbumu=numerAlbumu;
    }

    @Override
    public void wypiszInfo()
    {
        System.out.printf("Student. %s %s %d%n", this.imie, this.nazwisko, this.rokUrodzenia);
        System.out.printf("%d %d %d%n",this.rok,this.numerGrupy, this.numerAlbumu);
    }
    private int rok;
    private int numerGrupy;
    private int numerAlbumu;
}
