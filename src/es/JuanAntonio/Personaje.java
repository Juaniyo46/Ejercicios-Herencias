package es.JuanAntonio;

public class Personaje {
    protected String nombre;
    protected int energia;

    public Personaje(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                '}';
    }

    public void alilmentarse (int energia){
        this.energia += energia;
    }
}
