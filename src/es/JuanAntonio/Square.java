package es.JuanAntonio;

public class Square extends Shape {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Square(String color) {
        super(4,4);
        this.color = color;


    }
}
