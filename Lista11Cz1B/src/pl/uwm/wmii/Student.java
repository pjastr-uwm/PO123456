package pl.uwm.wmii;

class Student extends Osoba{

    public Student(String nazwisko, int rokUrodzenia, String kierunek)
    {
        super(nazwisko,rokUrodzenia);
        this.kierunek=kierunek;
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) {
            return false;
        }

        Student other = (Student) otherObject;
        return this.kierunek.equals(other.kierunek);
    }

    public String getKierunek() {
        return kierunek;
    }

    @Override
    public int getRokUrodzenia() {
        return super.getRokUrodzenia();
    }

    @Override
    public String getNazwisko() {
        return super.getNazwisko();
    }

    @Override
    public String toString()
    {
        return getClass().getName() + ", nazwisko: "
                + this.getNazwisko() +", rok urodzenia: "+this.getRokUrodzenia()
                + ", kierunek: "+this.kierunek;
    }

    private String kierunek;
}
