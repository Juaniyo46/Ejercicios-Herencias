package es.JuanAntonio;

abstract class InformaticoAbs {
    protected String empresa;
    protected double sueldo;


    public InformaticoAbs(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double pagarSueldo (double horas) {
        double pago = this.sueldo * horas;
        return pago;
    }

}
