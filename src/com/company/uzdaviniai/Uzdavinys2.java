package com.company.uzdaviniai;

import java.util.Scanner;

public class Uzdavinys2 {

    public void ZodzioSimboliai()
    {
        System.out.println("Labas");
        System.out.println("Ivesk zodi");
        Scanner skeneris = new Scanner(System.in);
        String zodis = skeneris.nextLine();
        System.out.println(zodis.length());
    }
}
