package es.JuanAntonio;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Profesor profesor1 = new Profesor("Pedro", "Gijon Ordoñez", 30, "632251478", "Lengua");
        Profesor profesor2 = new Profesor("Juan", "Contreras Prueba", 35, "638321478", "Matemáticas");
        Profesor profesor3 = new Profesor("Gonzalo", "Perez Jimenez", 40, "654239875", "Inglés");

        ProfesorTitular titular1 = new ProfesorTitular("Perico", "Jimenez García", 45, "635214798", "IOS", 10,30000);

        ProfesorInterino interino1 = new ProfesorInterino( " Alberto", " Rodriguez Ordaz ", 55, " 679245138", " Java",1200);

        System.out.println(profesor1.toString());

        System.out.println(interino1.name + interino1.surnames + interino1.salaryMonth);

        ListinProfesores lp = new ListinProfesores(new ArrayList<Profesor>());
        lp.getListadoDeProfesores0().add(profesor1);
        lp.getListadoDeProfesores0().add(profesor2);
        lp.getListadoDeProfesores0().add(profesor3);

        System.out.println(lp.getListadoDeProfesores0());




    }
}
