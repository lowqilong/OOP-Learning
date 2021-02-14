import java.util.Scanner;

public class CompanyTest {

    public static void checkEmployee(Company comp, int id) {
        Employee employee = comp.getEmployee(id);

        if (employee.getSpouse() == null) {
            System.out.printf("Name: %s, Salary: %.2f, Status: Single%n", employee.getName(), employee.getSalary());
        } else {
            System.out.printf("Name: %s, Salary: %.2f, Status: Married%n", employee.getName(), employee.getSalary());
            Spouse spouse = employee.getSpouse();
            System.out.println("Spouse's name: " + spouse.getName());
        }
    }

    public static void main(String[] args) {

        Company Ums = new Company("UMS");

        Spouse Kate = new Spouse("Kate", 37);

        Employee John = new Employee("John", 5, 2500, 'M', Kate);

        Ums.addEmployee(John);

        System.out.println("Total salary(before): $" + Ums.getAllEmployeesSalary());

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        String salary = sc.nextLine();

        System.out.print("Enter gender: ");
        char gender = sc.next().charAt(0);

        Employee new_empl = new Employee(name, Integer.parseInt(id), Double.parseDouble(salary), gender);

        Ums.addEmployee(new_empl);

        System.out.println("Total salary(after addition): $" + Ums.getAllEmployeesSalary());

        checkEmployee(Ums, 4);
        checkEmployee(Ums, 5);

    }
}
