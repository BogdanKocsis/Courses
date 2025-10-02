import java.util.Random;

public class EmployeeDemo {

    public enum EmployeeType {
        WORKER,
        MANAGER
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        //First Project
//        employees[0] = new Manager("Bogdan", "Kocsis", 26);
//        employees[1] = new Worker("Alex", "Stefan", 29);
//        employees[2] = new Worker("Cristina", "Voicu", 26);
//        employees[3] = new Manager("Maria", "Ioana", 48);
//        employees[4] = new Worker("Stefan", "Andrei", 38);

        //Second Project
        for (int i = 0; i < 5; i++) {
            EmployeeType employeeType = getEmployeeType();
            Employee currentEmployee;

            if (employeeType == EmployeeType.WORKER) {
                currentEmployee = new Worker("Alex", "Stefan", 29);
            } else {
                currentEmployee = new Manager("Bogdan", "Kocsis", 26);
            }
            employees[i] = currentEmployee;
        }

        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName() + ", age " + employee.getAge() + " says: ");
            System.out.println("\t" + employee.work() + "\n");
        }

    }

    public static EmployeeType getEmployeeType() {
        EmployeeType result;
        Random rand = new Random();
        final int UPPER_BOUND = 2;
        int whichOne = rand.nextInt(UPPER_BOUND);

        if (whichOne == 0) {
            result = EmployeeType.WORKER;
        } else {
            result = EmployeeType.MANAGER;
        }
        return result;
    }
}
