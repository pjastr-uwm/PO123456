class TestAdres {

    public static void main(String[] args)
    {
        Adres a1 = new Adres("Słoneczna", 54, "Olsztyn", "10-710");
        Adres a2 = new Adres("Słoneczna", 54,100, "Olsztyn", "10-710");
        a1.pokaz();
        a2.pokaz();
        Adres a3 = new Adres("Słoneczna", 54, "Olsztyn", "10-910");
        System.out.println(a1.przed(a3));
    }
}

class Adres{

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy)
    {
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.numer_mieszkania=numer_mieszkania;
        this.miasto=miasto;
        this.kod_pocztowy=kod_pocztowy;
    }

    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy)
    {
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.numer_mieszkania=-1;
        this.miasto=miasto;
        this.kod_pocztowy=kod_pocztowy;
    }

    public void pokaz()
    {
        System.out.printf("%s %s%n", this.kod_pocztowy, this.miasto);
        System.out.printf("%s %d", this.ulica, this.numer_domu);
        if (this.numer_mieszkania !=-1)
        {
            System.out.printf(" %d",this.numer_mieszkania);
        }
        System.out.printf("%n");
    }

    public boolean przed(Adres other)
    {
        return (this.kod_pocztowy.compareTo(other.kod_pocztowy) < 0);
    }

    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;
}
