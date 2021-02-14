public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() {
        return new Person(name, age);
    }

    // object class
    // public Object clone()
    // Person p = (Person) another clone();
    @override
    public Person clone() {
        return new Person(name, age);
    }

    // String s = "abc";
    // String t = "abc";
    // if (s.equals(t))

    // override otherwise will do address comparison
    public boolean equals(Object another) {
        if (!(obj.instanceof Person)) {
            return false;
        }

        Person obj = (Person) another;
        return another.name.equals(name);
    }

    public String toString() {
        return "person(name=" + name + ",age=" + age + ")";
    }
}
