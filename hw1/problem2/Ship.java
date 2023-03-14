public class Ship {

    // Variables
    private String name;
    private String year;

    // Constructor
    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    // Print
    public void print() {
        System.out.println("Name: " + getName() + "\nYear Built: " + getYear());
    }
}
