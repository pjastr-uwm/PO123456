package pl.uwm.wmii.lab9;

import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args)
    {
        System.out.println("Podaj ile liczb chcesz wprowadzić");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double tab[] = new double[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("Podaj liczbę numer %d%n",i+1);
            tab[i] = input.nextDouble();
        }
        for(int i=1;i<n;i++)
        {
            System.out.printf("Liczba numer %d to %f%n",i+1,tab[i]);
        }
        System.out.printf("Liczba numer 1 to %f%n",tab[0]);
    }
}
