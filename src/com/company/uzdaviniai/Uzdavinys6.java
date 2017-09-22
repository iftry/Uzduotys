package com.company.uzdaviniai;

import java.util.Scanner;

public class Uzdavinys6 {
    public void kmi()
    {
        System.out.println("Labas");
        System.out.println("Ivesk savo svori");
        Scanner skeneris = new Scanner(System.in);
        double svoris = skeneris.nextDouble();
        System.out.println("Ivesk savo ugi (m.)");
        double ugis = skeneris.nextDouble();
        System.out.println("KMI" + svoris/Math.pow(ugis, 2.0f));
    }
}
