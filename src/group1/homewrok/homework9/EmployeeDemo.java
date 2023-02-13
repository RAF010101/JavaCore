package group1.homewrok.homework9;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        EmployeeStorage employeeStorage = new EmployeeStorage();
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        while (isRun) {
            System.out.println("Input 0 for exit");
            System.out.println("Input 1 for add employee");
            System.out.println("Input 2 for print employee");
            System.out.println("Input 3 and search employee by ID");
            System.out.println("Input 4 and search employee by Company");
            System.out.println("Input 5 and search your employee for salary");
            System.out.println("Input 6 for change employee position by id");
            System.out.println("Input 7 for print only active employees ");
            System.out.println("Input 8 for inactive employee by id ");
            System.out.println("Input 9 for activate employee by id");
            String comand = scanner.nextLine();
            switch (comand) {
                case "0":
                    System.out.println("Good Bye");
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Input name");
                    String name1 = scanner.nextLine();
                    System.out.println("Input surname");
                    String surname1 = scanner.nextLine();
                    System.out.println("Input salary");
                    double salary1 = Double.parseDouble(scanner.nextLine());
                    System.out.println("Input company");
                    String company1 = scanner.nextLine();
                    System.out.println("Input position");
                    String position1 = scanner.nextLine();
                    System.out.println("Input id");
                    String id1 = scanner.nextLine();
                    System.out.println("Input your employee activ");
                    boolean active = true;
                    employee.setActive(active);
                    Employee ob1 = new Employee(name1,surname1,salary1,company1,position1,id1);
                    employeeStorage.add(ob1);
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case"3":
                    System.out.println("Input id for search employee");
                    String id2 = scanner.nextLine();
                    employeeStorage.searchById(id2);
                    break;
                case "4":
                    System.out.println("Input company name for search Employee");
                    String company2 = scanner.nextLine();
                    employeeStorage.searchByCompany(company2);
                    break;
                case "5":
                    System.out.println("Input two double price for search Employee");
                    double salarySearch1 = Double.parseDouble(scanner.nextLine());
                    double salarySearch2 = Double.parseDouble(scanner.nextLine());
                    employeeStorage.searchBySalary(salarySearch1,salarySearch2);
                    break;
                case "6":
                    System.out.println("Input id and new position");
                    String id3 = scanner.nextLine();
                    String position2 = scanner.nextLine();
                    employeeStorage.changeById(id3,position2);
                    break;
                case "7":
                    System.out.println("Search by active");
                    employeeStorage.searchByActive();
                    break;
                case "8":
                    System.out.println("Input id ");
                    String id4 = scanner.nextLine();
                    employeeStorage.searchByIdAndInactiveEmployee(id4);
                    break;
                case "9":
                    System.out.println("input id");
                    String id5 = scanner.nextLine();
                    employeeStorage.searchByIdAndActiveEmployee1(id5);
                    break;
                default:
                    System.out.println("Wrong comand please try again");
                    break;
            }
        }
    }
}
