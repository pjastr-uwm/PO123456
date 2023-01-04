package pl.uwm.wmii;

public class NazwanyPunktDemo
{

    public static void main(String[] args)
    {
        NazwanyPunkt a = new NazwanyPunkt(3, 5, "port");
        a.show();
        Punkt b = new Punkt(3, 5);
        b.show();
        Punkt c = new NazwanyPunkt(3, 6, "tawerna");
        c.show();
        // a = b;                // --- powoduje błąd kompilacji  (dlaczego ?)
        // a = (NazwanyPunkt) b;  //--- powoduje błąd wykonania   (dlaczego ?)
        //a = c;                // --- powoduje błąd kompilacji  (dlaczego ?)
        //a = (NazwanyPunkt) c;
        a.show();
        System.out.println(a.equals(a));
        Punkt x1 = new NazwanyPunkt(3,6,"X1");
        NazwanyPunkt x2 = new NazwanyPunkt(3,66,"X1");
        Punkt p3 = new Punkt(3,6);
        System.out.println(x1.equals(p3));
    }

}
