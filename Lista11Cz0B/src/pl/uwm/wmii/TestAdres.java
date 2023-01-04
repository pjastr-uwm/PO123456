package pl.uwm.wmii;

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

