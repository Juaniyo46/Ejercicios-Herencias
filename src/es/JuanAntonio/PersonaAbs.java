package es.JuanAntonio;

abstract class PersonaAbs {
    protected String name;
    protected String surnames;
    protected int age;
    protected String telephone;

    public PersonaAbs(String name, String surnames, int age, String telephone) {
        this.name = name;
        this.surnames = surnames;
        this.age = age;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
