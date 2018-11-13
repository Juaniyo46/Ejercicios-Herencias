package es.JuanAntonio;

public class Guerrero extends Personaje {
    protected String arma;

    public Guerrero(String nombre, int energia, String arma) {
        super(nombre, energia);
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Guerrero{" +
                "arma='" + arma + '\'' +
                ", nombre='" + nombre + '\'' +
                ", energia=" + energia +
                '}';
    }

    public String combatir (int energia) {
        this.energia -= energia;
        return "Has perdido " + energia + " y has utilizado el arma " + this.arma;
    }
}
