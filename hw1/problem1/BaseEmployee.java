import java.util.*;

public class BaseEmployee extends Employee {

    // Variables
    private double baseSalary;

    // Constructor
    public BaseEmployee(String firstName, String lastName, String ssn, double baseSalary) {
        super(firstName, lastName, ssn);
        this.baseSalary = baseSalary;
    }

    // Accessoe
    public double getBaseSalary() {
        return baseSalary;
    }

    // Mutator
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

}