// Virtual method invocation
// Manager "is a" Employee
// Java strongly typed language --> all variables must have a type
// Manager m --> type Manager. m stores address of the Manager object
// Employee e --> type Employee. e stores address of the Employee object

public class test {
    public static void main(String[] args) {

        // no problems
        Employee e = new Employee();
        Manager m = new Manager();

        // valid can compile, since manager IS an employee
        Employee e = new Manager();

        // wont compile, employee IS NOT an employee, compilation error
        Manager m = new Employee();

        // instanceof and class casting
        Employee e = new Manager(300, 500); // this is fine

        if (e instanceof Manager) {
            Manager m = (Manager) e; // class cast
            System.out.println(m.getSalary());
            System.out.println(m.getBonus());
        }
    }

    public static void isManager() {
        
    }
}