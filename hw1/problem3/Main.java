public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Course course = new Course("CS5800: Advanced Software Engineering", instructor, textbook);
        course.print();
    }
}