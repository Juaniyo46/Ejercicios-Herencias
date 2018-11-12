package es.JuanAntonio;

public class ProfesorInterino extends Profesor {
    protected double salaryMonth;

    public ProfesorInterino(String name, String surnames, int age, String telephone, String speciality, double salaryMonth) {
        super(name, surnames, age, telephone, speciality);
        this.salaryMonth = salaryMonth;
    }

    public double getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(double salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    @Override
    public String toString() {
        return "ProfesorInterino{" +
                "salaryMonth=" + salaryMonth +
                ", speciality='" + speciality + '\'' +
                ", name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
