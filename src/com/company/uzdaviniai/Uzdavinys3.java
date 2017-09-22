package com.company.uzdaviniai;

import java.util.Scanner;

public class Uzdavinys3 {

    public void skaiciai1()
    {
        System.out.println("Labas");
        System.out.println("Ivesk du skaicius");
        Scanner skeneris = new Scanner(System.in);
        int a =skeneris.nextInt();
        int b = skeneris.nextInt();
        int suma = a+b;
        int skirtumas = a-b;
        System.out.println("suma " + suma);
        System.out.println("skirtumas " + skirtumas);
    }

}
