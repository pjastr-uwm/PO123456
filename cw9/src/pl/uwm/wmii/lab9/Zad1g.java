package pl.uwm.wmii.lab9;

import java.util.Scanner;

public class Zad1g {

    public static void main(String[] args)
    {
        System.out.println("Podaj ile liczb chcesz wprowadzić");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double temp=0;
        double temp2=1;
        for(int i=1;i<=n;i++)
        {
            System.out.printf("Podaj liczbę numer %d%n",i);
            double a = input.nextDouble();
            temp += a;
            temp2 *= a;

        }
        System.out.printf("Suma: %f%n", temp);
        System.out.printf("Iloczyn: %f%n", temp2);
    }
}
