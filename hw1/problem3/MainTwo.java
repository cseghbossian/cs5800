public class MainTwo {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Other", "Instructor", "3-3333");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Dirty Code", "Mobert C. Rartin", "Prentice Hall");
        CourseTwo course = new CourseTwo("CS5800: Advanced Software Engineering", instructor1, instructor2, textbook1, textbook2);
        course.print();
    }
}