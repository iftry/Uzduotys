package com.company.uzdaviniai;

import java.util.Scanner;

public class Uzdavinys4 {

    public void skaiciai2()
    {
        System.out.println("Labas");
        System.out.println("Ivesk du skaicius");
        Scanner skeneris = new Scanner(System.in);
        int a = skeneris.nextInt();
        int b = skeneris.nextInt();
        System.out.println("Suma " + Suma(a,b));
        System.out.println("Skirtumas " + Skirtumas(a,b));
    }

    public static int Suma (int a, int b)
    {
        return a+b;
    }
    public static int Skirtumas (int a, int b)
    {
        return a-b;
    }
}
