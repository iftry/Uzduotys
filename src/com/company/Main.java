package com.company;

import com.company.uzdaviniai.*;

import java.util.Scanner;

public class Main {
    public static final int UZDAVINYS_0 = 0;
    public static final int UZDAVINYS_1 = 1;
    public static final int UZDAVINYS_2 = 2;
    public static final int UZDAVINYS_3 = 3;
    public static final int UZDAVINYS_4 = 4;
    public static final int UZDAVINYS_5 = 5;
    public static final int UZDAVINYS_6 = 6;
    public static final int UZDAVINYS_7 = 7;
    public static final int UZDAVINYS_8 = 8;
    public static final int UZDAVINYS_9 = 9;
    public static final int UZDAVINYS_10 = 10;
    public static final int UZDAVINYS_11 = 11;
    public static final int UZDAVINYS_12 = 12;

    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        while (true) {
            System.out.println("Pasirinkite uždavinį kurį norite pamatyti");
            System.out.println("Įvedus -1 programa bus baigta");
            int uzdavinioNumeris = skaitytuvas.nextInt();
            switch (uzdavinioNumeris) {
                case UZDAVINYS_0:
                    Uzdavinys0 uzdavinys0 = new Uzdavinys0();
                    uzdavinys0.pasisveikink();
                    break;
                case UZDAVINYS_1:
                    Uzdavinys1 uzdavinys1 = new Uzdavinys1();
                    uzdavinys1.vardas5Kart();
                    break;
                case UZDAVINYS_2:
                    Uzdavinys2 uzdavinys2 = new Uzdavinys2();
                    uzdavinys2.ZodzioSimboliai();
                    break;
                case UZDAVINYS_3:
                    Uzdavinys3 uzdavinys3 = new Uzdavinys3();
                    uzdavinys3.skaiciai1();
                    break;
                case UZDAVINYS_4:
                    Uzdavinys4 uzdavinys4 = new Uzdavinys4();
                    uzdavinys4.skaiciai2();
                    break;
                case UZDAVINYS_5:
                    Uzdavinys5 uzdavinys5 = new Uzdavinys5();
                    uzdavinys5.skaiciaiOverload();
                    break;
                case UZDAVINYS_6:
                    Uzdavinys6 uzdavinys6 = new Uzdavinys6();
                    uzdavinys6.kmi();
                    break;
                case UZDAVINYS_7:
                    Uzdavinys7 uzdavinys7 = new Uzdavinys7();
                    uzdavinys7.kmiMetodas();
                    break;
                case UZDAVINYS_8:
                    Uzdavinys8 uzdavinys8 = new Uzdavinys8();
                    uzdavinys8.sanaudos();
                    break;
                case UZDAVINYS_9:
                    Uzdavinys9 uzdavinys9 = new Uzdavinys9();
                    uzdavinys9.sanaudos2();
                    break;
                case UZDAVINYS_10:
                    Uzdavinys10 uzdavinys10 = new Uzdavinys10();
                    uzdavinys10.skaiciuotuvas();
                    break;
                case UZDAVINYS_11:
                    Uzdavinys11 uzdavinys11 = new Uzdavinys11();
                    uzdavinys11.skaiciuotuvasOverload();
                    break;
              /*  case UZDAVINYS_12:
                    Uzdavinys12 uzdavinys12 = new Uzdavinys12();
                    uzdavinys12.kmi2();
*/
                default:
                    return;
            }
        }
    }
}