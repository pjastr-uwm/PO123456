package pl.uwm.wmii.lab9;

import java.util.Scanner;

public class Rozw1c {

    public static void main(String[] args)
    {
        System.out.println("Podaj ile liczb chcesz wprowadzić");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int counter =0;
        for(int i=1;i<=n;i++)
        {
            System.out.printf("Podaj liczbę numer %d%n",i);
            int liczba = input.nextInt();
            if (liczba%2 ==0)
            {
                for(int j=0;j<=liczba/2;j++)
                {
                    if (j*j == liczba)
                    {
                        counter++;
                        break;
                    }
                }
            }
        }
        System.out.printf("Wynik: %d%n", counter);
    }
}
