package herancaPolimorfismo.exercicios.zoo;

public class Dog extends Animal {

    private String breed;
    private boolean vaccineOk;

    public Dog() {
    }

    public Dog(String name, int age, String breed, boolean vaccineOk) {
        super(name, age);
        this.breed = breed;
        this.vaccineOk = vaccineOk;
    }

    public boolean isVaccineOk() {
        return vaccineOk;
    }

    public void setVaccineOk(boolean vaccineOk) {
        this.vaccineOk = vaccineOk;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String bark(){
        return "Woof!";
    }

    @Override
    public String soundCard() {
        return getName()
        + " ("
        + getBreed()
        + ", "
        + getAge()
        + " yr) - "
        + bark()
        + "[vaccines: "
        + (vaccineOk ? "ok" : "OVERDUE") // condicao ? valorsetrue : valorsefalse
        + "]";
    }
}
