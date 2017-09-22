package com.company.uzdaviniai;

import java.util.Scanner;

public class Uzdavinys12 {

    public double Svoris;
    public double Ugis;
    Scanner skeneris = new Scanner(System.in);


    public Uzdavinys12 (double svoris, double ugis) {
        Svoris = svoris;
        Ugis = ugis;
    }

    public double svoris = skeneris.nextDouble();
    public double ugis = skeneris.nextDouble();

    public void kmi2()
    {
        System.out.println("Labas");
        System.out.println("Ivesk savo svori");
        double svoris = skeneris.nextDouble();
        System.out.println("Ivesk savo ugi (m.)");
        double ugis = skeneris.nextDouble();
        System.out.println("KMI" + svoris/Math.pow(ugis, 2.0f));
    }
}
