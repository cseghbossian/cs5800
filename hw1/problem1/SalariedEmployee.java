public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // Constructor
    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    // Accessor
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // Mutator
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

}