// import java lang
public class Person {
    /*
     * default constructor --> public Person() {}
     */
    private String name;

    public Person(String name) {
        this.name = name;
    }

    // overriding --> make sure the method signature is corect
    @Override
    public String toString() {
        return "" + name;
    }
}
