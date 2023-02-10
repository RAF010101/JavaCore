package group1.homewrok.homework9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        EmployeeStorage employeeStorage = new EmployeeStorage();
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        while(isRun){
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 add employee");
            System.out.println("Please input 2 all employee");
            System.out.println("Please input 3 search employee id");
            System.out.println("Please input employee company");
            String comand = scanner.nextLine();
            switch (comand){
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input employee name");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee surname");
                    String surname = scanner.nextLine();
                    System.out.println("PLease input employee salary");
                    String salary = scanner.nextLine();
                    System.out.println("Please input employee company");
                    String company = scanner.nextLine();
                    System.out.println("Please input employee id");
                    String id = scanner.nextLine();
                    System.out.println("Please input position");
                    String position = scanner.nextLine();
                    Employee employee1 = new Employee(name,surname,salary,company,position,id);
                    employeeStorage.add(employee1);
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    EmployeeStorage.search(keyword);
                    break;
            }
        }
    }
}
