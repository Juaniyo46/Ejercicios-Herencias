package es.JuanAntonio;

public class ProfesorTitular extends Profesor {
    protected int antiquity;
    protected double salaryYear;

    public ProfesorTitular(String name, String surnames, int age, String telephone, String speciality, int antiquity, double salaryYear) {
        super(name, surnames, age, telephone, speciality);
        this.antiquity = antiquity;
        this.salaryYear = salaryYear;
    }

    public int getAntiquity() {
        return antiquity;
    }

    public void setAntiquity(int antiquity) {
        this.antiquity = antiquity;
    }

    public double getSalaryYear() {
        return salaryYear;
    }

    public void setSalaryYear(double salaryYear) {
        this.salaryYear = salaryYear;
    }

    @Override
    public String toString() {
        return "ProfesorTitular{" +
                "antiquity=" + antiquity +
                ", salaryYear=" + salaryYear +
                ", speciality='" + speciality + '\'' +
                ", name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
