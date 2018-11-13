package es.JuanAntonio;

public class Mago extends Personaje {
    protected String poder;

    public Mago(String nombre,  String poder) {
        super(nombre, 100);
        this.poder = poder;

    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "poder='" + poder + '\'' +
                ", nombre='" + nombre + '\'' +
                ", energia=" + energia +
                '}';
    }

    public String encantar () {
        energia = this.energia - 2;
        return "Te queda " + energia + " de energía, y tu poder es " + this.poder;
    }


}
