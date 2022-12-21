package pl.uwm.wmii.lab10;

import java.util.Random;
import java.util.Scanner;

public class Zad1e {

    public static void main(String[] args)
    {
        System.out.println("Podaj ile liczb chcesz wygenerowac");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Random r = new Random();
        //r.setSeed(123456);
        int tab[] = new int[n];
        for(int i=0;i<tab.length;i++)
        {
            tab[i] = r.nextInt(1999)-999;
        }
        for(int i=0;i<tab.length;i++)
        {
            System.out.printf("Element nr %d to %d%n", i, tab[i]);
        }
        int obecnaDlugosc=0, maksymalnaDlugosc=0;
        for(int i=0;i<tab.length;i++)
        {
            if (tab[i] >0)
            {
                obecnaDlugosc++;
                if (maksymalnaDlugosc <obecnaDlugosc)
                {
                    maksymalnaDlugosc = obecnaDlugosc;
                }
            }
            else
            {
                obecnaDlugosc=0;
            }
        }
        System.out.printf("Dlugosc najdluzszego podciagu liczb dodatnich: %d%n", maksymalnaDlugosc);

    }
}
