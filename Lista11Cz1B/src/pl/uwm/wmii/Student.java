package pl.uwm.wmii;

class Student extends Osoba{

    public Student(String nazwisko, int rokUrodzenia, String kierunek)
    {
        super(nazwisko,rokUrodzenia);
        this.kierunek=kierunek;
    }
    private String kierunek;
}
