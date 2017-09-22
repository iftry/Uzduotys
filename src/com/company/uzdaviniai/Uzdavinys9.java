package com.company.uzdaviniai;

import java.util.Scanner;

public class Uzdavinys9 {

    Scanner skeneris = new Scanner(System.in);

    public double Skaiciuok (double km, double l)
    {
        return (double) l*100/km;
    }

    public void sanaudos2()
    {
        System.out.println("Labas");
        System.out.println("Ivesk kiek kilometru atstumo nuvaziuota");
        double km = skeneris.nextDouble();
        System.out.println("Ivesk kiek sunaudojo litru kuro");
        double l = skeneris.nextDouble();
        System.out.println(Skaiciuok(l, km));
    }


}
