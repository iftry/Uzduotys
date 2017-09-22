package com.company.uzdaviniai;

import java.util.Scanner;

public class Uzdavinys10 {

    public void skaiciuotuvas() {
        System.out.println("Labas");
        System.out.println("Ivesk du skaicius");
        Scanner skeneris = new Scanner(System.in);
        int a = skeneris.nextInt();
        int b = skeneris.nextInt();

        System.out.println("Suma " + suma(a,b) + " Skirtumas " + skirtumas(a,b) + " Sandauga " + sandauga(a,b));
    }
    public static int suma(int a, int b)
    {
        return a+b;
    }
    public static int skirtumas (int a, int b)
    {
        return a-b;
    }
    public static int sandauga (int a, int b)
    {
        return a*b;
    }


}