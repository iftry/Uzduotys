package com.company.uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1 {

    public void vardas5Kart()
    {
        System.out.println("Labas");
        System.out.println("Koks tavo vardas?");
        Scanner skeneris = new Scanner(System.in);
        String vardas = skeneris.nextLine();
        for (int i=0; i<5; i++){
            System.out.println(vardas);
    }

    }
}
