public class Student extends Person {
    private String university;

    /*
    public Student() {
        super();
    }
    
    */

    public Student() {
        // super("Amy");
        // calling another class constructor that takes in two arguments
        this("No Name", "No University");
    }

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }
}
