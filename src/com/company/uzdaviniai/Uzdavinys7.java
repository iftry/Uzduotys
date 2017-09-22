package com.company.uzdaviniai;

import java.util.Scanner;

public class Uzdavinys7 {

    public static double kmi(double svoris,double ugis)
    {
        return (svoris/Math.pow(ugis, 2.0f));
    }

    public void kmiMetodas()
    {
        System.out.println("Labas");
        System.out.println("Ivesk savo svori");
        Scanner skeneris = new Scanner(System.in);
        double svoris = skeneris.nextDouble();
        System.out.println("Ivesk savo ugi (m.)");
        double ugis = skeneris.nextDouble();
        System.out.println(kmi(svoris,ugis));
    }
}
