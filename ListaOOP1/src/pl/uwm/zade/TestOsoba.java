package pl.uwm.zade;

class TestOsoba {
    public static void main(String[] args)
    {
        Osoba o1 = new Osoba("Jan","Kowalski",2003);
        o1.wypiszInfo();
        Student s1 = new Student("Anna","Nowak",2001, 3,4,123456);
        s1.wypiszInfo();
        Osoba student2 = new Student();
        student2.wypiszInfo();
        Student student3 = new Student();
        Osoba osoba3 = student3;
        Student student4 = (Student) osoba3;
        student4.wypiszInfo();
    }
}
