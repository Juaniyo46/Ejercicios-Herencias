package es.JuanAntonio;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Guerrero guerrero1 = new Guerrero("Egipcio", 50, "espada");

        Mago mago1 = new Mago("Roman", "Lanzallamas");


        System.out.println(guerrero1);
        System.out.println(guerrero1.combatir(25)+ "\n");

        System.out.println(mago1);
        System.out.println(mago1.encantar());

    }
}
