package es.JuanAntonio;

public class Programador extends InformaticoAbs{

    public String lenguaje;


    public Programador(String empresa) {
        super(empresa);
    }

    public Programador(String empresa, String lenguaje) {
        super(empresa);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "lenguaje='" + lenguaje + '\'' +
                ", empresa='" + empresa + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
