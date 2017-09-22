package com.company.uzdaviniai;

import java.util.Scanner;

public class Uzdavinys8 {

    public void sanaudos()
    {
        System.out.println("Labas");
        System.out.println("Ivesk kiek kilometru atstumo nuvaziuota");
        Scanner skeneris = new Scanner(System.in);
        double km = skeneris.nextDouble();
        System.out.println("Ivesk kiek litru kuro sunaudota");
        double l = skeneris.nextDouble();
        System.out.println("Vidutiniskai 100km sunaudoja: " + (l*100)/km);
    }
}
