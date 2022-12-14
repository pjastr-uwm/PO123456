package pl.uwm.wmii.lab9;

import java.util.Scanner;

public class Zad1c {

    public static void main(String[] args)
    {
        System.out.println("Podaj ile liczb chcesz wprowadzić");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double temp=0;
        for(int i=1;i<=n;i++)
        {
            System.out.printf("Podaj liczbę numer %d%n",i);
            temp += Math.abs(input.nextDouble());
        }
        System.out.printf("Wynik: %f%n", temp);
    }
}
