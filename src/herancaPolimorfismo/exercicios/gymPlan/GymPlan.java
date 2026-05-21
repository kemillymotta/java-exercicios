package herancaPolimorfismo.exercicios.gymPlan;

public abstract class GymPlan {

    private String memberName;
    private double monthlyFee;

    public GymPlan() {
    }

    public GymPlan(String memberName, double monthlyFee) {
        this.memberName = memberName;
        this.monthlyFee = monthlyFee;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public abstract String planType();

    public abstract String planSummary();

    public abstract double monthlyTotal();
}
