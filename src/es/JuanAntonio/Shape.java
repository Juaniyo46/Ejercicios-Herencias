package es.JuanAntonio;

// con abstract no puedes instanciar con la clase shape, sino que tienes que extender con herecia desde otra clase.
abstract class Shape {

    // protected solo lo puede utulizar las herecias hijas
    protected int sides;
    protected int corners;

    public Shape(int sides, int corners) {
        this.sides = sides;
        this.corners = corners;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getCorners() {
        return corners;
    }

    public void setCorners(int corners) {
        this.corners = corners;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "sides=" + sides +
                ", corners=" + corners +
                '}';
    }


}
