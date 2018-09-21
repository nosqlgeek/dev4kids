package org.nosqlgeek.dev4kids;

public class ProgrammPhilip {

    public static void main(String[] args) {



        //Zahlen

        int zahl1 = 1;
        int zahl2 = 2;
        int zahl3 =3;
        int zahl4 =4;

        int produkt = multipliziere(zahl1, zahl2 ,zahl4);

        System.out.println("Das Produkt ist: " + produkt);

    }

 //Funktion
 public static int multipliziere(int a ,int b ,int c) {

        return (a * b) + c;
 }

}


