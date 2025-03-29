import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Enum for Designation
enum Designation {
    ENGINEER('e', "Engineer"),
    CONSULTANT('c', "Consultant"),
    CLERK('k', "Clerk"),
    RECEPTIONIST('r', "Receptionist"),
    MANAGER('m', "Manager"),
    UNKNOWN('u', "Unknown");

    private final char code;
    private final String name;

    Designation(char code, String name) {
        this.code = code;
        this.name = name;
    }

    public char getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

class Employee {
    int empNo;
    String empName;
    Date joinDate;
    Designation designation;
    String department;
    double basic;
    double hra;
    double it;

    public Employee(int empNo, String empName, String joinDate, Designation designation, String department, double basic, double hra, double it) throws ParseException {
        this.empNo = empNo;
        this.empName = empName;
        this.joinDate = new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);
        this.designation = designation;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }

    public double calculateSalary() {
        double da = getDA();
        return basic + hra + da - it;
    }

    public String getDesignation() {
        return designation.getName();
    }

    private double getDA() {
        switch (designation) {
            case ENGINEER:
                return 20000;
            case CONSULTANT:
                return 32000;
            case CLERK:
                return 12000;
            case RECEPTIONIST:
                return 15000;
            case MANAGER:
                return 40000;
            default:
                return 0;
        }
    }
}

public class Project1 {
    // Constants for department names
    private static final String R_AND_D = "R&D";
    private static final String PM = "PM";
    private static final String ACCT = "Acct";
    private static final String FRONT_DESK = "Front Desk";
    private static final String ENGG = "Engg";
    private static final String MANUFACTURING = "Manufacturing";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[7];

        try {
            employees[0] = new Employee(1001, "Ashish", "01/04/2009", Designation.ENGINEER, R_AND_D, 20000, 8000, 3000);
            employees[1] = new Employee(1002, "Shashi", "23/08/2012", Designation.CONSULTANT, PM, 30000, 12000, 9000);
            employees[2] = new Employee(1003, "Rahul", "12/11/2008", Designation.CLERK, ACCT, 10000, 8000, 1000);
            employees[3] = new Employee(1004, "Chahat", "29/01/2013", Designation.RECEPTIONIST, FRONT_DESK, 12000, 6000, 2000);
            employees[4] = new Employee(1005, "Ranjan", "16/07/2005", Designation.MANAGER, ENGG, 50000, 20000, 20000);
            employees[5] = new Employee(1006, "Suman", "01/01/2000", Designation.ENGINEER, MANUFACTURING, 23000, 9000, 4400);
            employees[6] = new Employee(1007, "Tanmay", "12/06/2006", Designation.CONSULTANT, PM, 29000, 12000, 10000);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("Enter the employee number to search: ");
        int empNoToSearch = scanner.nextInt();

        boolean found = false;
        for (Employee employee : employees) {
            if (employee != null && employee.empNo == empNoToSearch) {
                found = true;
                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(employee.empNo + "\t" + employee.empName + "\t" + employee.department + "\t" + employee.getDesignation() + "\t" + employee.calculateSalary());
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid: " + empNoToSearch);
        }

        scanner.close();
    }
}
