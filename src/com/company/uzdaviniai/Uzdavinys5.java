package com.company.uzdaviniai;

import java.util.Scanner;

public class Uzdavinys5 {

    public static int Skaiciuok (int a, int b) {
        return a+b;
    }
    public static float Skaiciuok (float a, float b) {
        return a-b;
    }

    public void skaiciaiOverload()
    {
        System.out.println("Labas");
        System.out.println("Ivesk du skaicius");
        Scanner skeneris = new Scanner(System.in);
        int a = skeneris.nextInt();
        int b = skeneris.nextInt();
        System.out.println(Skaiciuok(a,b));
        System.out.println(Skaiciuok((float)a,(float)b));

    }
}
