public class Course {

    // VAriables
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    // Constructor
    public Course(String name, Instructor instructor, Textbook textbook) {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    // Print
    public void print() {
        System.out.println("Course Name: " + name);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("Instructor Office Number: " + instructor.getOfficeNumber());
        System.out.println("Textbook: " + textbook.getTitle());
        System.out.println("Textbook Author: " + textbook.getAuthor());
        System.out.println("Textbook Publisher: " + textbook.getPublisher());
    }
}
