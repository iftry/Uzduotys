package com.company.uzdaviniai;

import java.util.Scanner;

public class Uzdavinys11 {

    public void skaiciuotuvasOverload() {

        System.out.println("Labas");
        System.out.println("Ivesk du skaicius");
        Scanner skeneris = new Scanner(System.in);
        int a = skeneris.nextInt();
        int b = skeneris.nextInt();

        System.out.println("Suma " + skaiciavimas((int) a, b) + " Skirtumas " + skaiciavimas((float) a, b) + " Sandauga " + skaiciavimas((double) a, b));
    }

    public static int skaiciavimas(int a, int b){return a+b;}
    public static float skaiciavimas(float a, float b){return a-b;}
    public static double skaiciavimas (double a, double b)
    {
        return a*b;
    }


}
