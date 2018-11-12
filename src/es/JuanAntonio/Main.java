package es.JuanAntonio;

public class Main {

    public static void main(String[] args) {

        Programador programador1 = new Programador("Dergachi","PHP");
        Programador programador2 = new Programador("Dergachi", "Java");
        Analista analista1 = new Analista("Dergachi", "Arquitectura de software");

        programador1.setSueldo(25.5);

        programador2.setSueldo(37.6);

        analista1.setSueldo(55);

        System.out.println(programador1);
        System.out.println(programador2);
        System.out.println(analista1);
    }
}
