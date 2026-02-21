package entities;

public class Students {

    public String name;
    public double grade1, grade2, grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public boolean pass() {
        return finalGrade() >= 60.0;
    }

    public double missingPoints() {
        if (pass()) {
            return 0.0;
        } else {
            return 60.0 - finalGrade();
        }
        }
    }

