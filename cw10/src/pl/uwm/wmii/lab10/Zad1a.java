package pl.uwm.wmii.lab10;

import java.util.Random;
import java.util.Scanner;

public class Zad1a {

    public static void main(String[] args)
    {
        System.out.println("Podaj ile liczb chcesz wygenerowac");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Random r = new Random();
        r.setSeed(123456);
        int tab[] = new int[n];
        for(int i=0;i<tab.length;i++)
        {
            tab[i] = r.nextInt(1999)-999;
        }
        for(int i=0;i<tab.length;i++)
        {
            System.out.printf("Element nr %d to %d%n", i, tab[i]);
        }
        int counter =0, counter2=0;
        for(int i=0;i<tab.length;i++)
        {
            if (tab[i] %2 != 0)
            {
                counter++;
            }
            else
            {
                counter2++;
            }
        }
        System.out.printf("Nieparzyste: %d %n", counter);
        System.out.printf("Parzyste: %d %n", counter2);
    }
}
