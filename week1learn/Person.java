public class Person {

  // integral --> 0
  // floating --> 0.0
  // boolean --> false
  // char --> \u0000
  // reference --> null

  //instance variable initialized to their default values

  private int age; // instance variable coz under class definition
  private char gender;
  private String name;

  // Constructor
  public Person(int age, char gender, String name) {
    this.age = age;
    this.gender = gender;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public char getGender() {
    return gender;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return "Person: name" + name + ", Gender=" + gender + "age" + age;
  }

}
