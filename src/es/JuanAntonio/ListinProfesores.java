package es.JuanAntonio;

import java.util.ArrayList;

public class ListinProfesores {
    ArrayList<Profesor> listadoDeProfesores0 = new ArrayList<>();

    public ListinProfesores(ArrayList<Profesor> listadoDeProfesores0) {
        this.listadoDeProfesores0 = listadoDeProfesores0;
    }

    public ArrayList<Profesor> getListadoDeProfesores0() {
        return listadoDeProfesores0;
    }

    public void setListadoDeProfesores0(ArrayList<Profesor> listadoDeProfesores0) {
        this.listadoDeProfesores0 = listadoDeProfesores0;
    }

    @Override
    public String toString() {
        return "ListinProfesores{" +
                "listadoDeProfesores0=" + listadoDeProfesores0 +
                '}';
    }
}
