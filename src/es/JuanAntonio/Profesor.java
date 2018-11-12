package es.JuanAntonio;

public class Profesor extends PersonaAbs {

    protected String speciality;

    public Profesor(String name, String surnames, int age, String telephone, String speciality) {
        super(name, surnames, age, telephone);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


}
