package pl.uwm.wmii;

class TestOsoba {

    public static void main(String[] args)
    {
        Osoba o1 = new Osoba("Kowalski", 1999);
        System.out.println(o1);
        System.out.println(o1.toString());
        Student s1 = new Student("Nowak",2002,"Informatyka");
        System.out.println(s1);
    }
}
