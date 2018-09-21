package org.nosqlgeek.dev4kids;

public class Programm1 {


    //Hauptprogramm
    public static void main(String[] args) {

        //Zahlen
        double zahl1 = 1.2334;
        int zahl2 = 6;
        int zahl3 = 7;
        int zahl4 = 1;

        int summe = addiere(zahl3, zahl2,zahl4);

        for (int i = 0; i < 5; i++) {

            summe = addiere(summe, i, 0);
            System.out.println("Die Summe ist: " + summe);

        }

    }

    //Funktion
    public static int addiere(int a, int b,int c) {


        if (a > c) {

            return a + b + c;

        } else {

            return 0;
        }
    }




}
