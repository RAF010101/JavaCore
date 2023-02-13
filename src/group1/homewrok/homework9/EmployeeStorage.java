package group1.homewrok.homework9;

public class EmployeeStorage {
    Employee employee = new Employee();
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee ob) {
        if (size == employees.length - 1) {
            extand();
        }
        employees[size++] = ob;
    }

    private void extand() {
        Employee[] tmp = new Employee[employees.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = employees[i];
        }
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i] + " ");
        }
    }

    public Employee searchById(String id1){
        for (int i = 0; i < size; i++) {
            if (employees[i].getId().contains(id1)){
                System.out.println(employees[i] + " ");
            }
        }return null;
    }

    public void searchByCompany(String company) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(company)) {
                System.out.println(employees[i] + " ");
            }
        }
    }

    public void searchBySalary(double salarySearch1, double salarySearch2) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= salarySearch1 || employees[i].getSalary() <= salarySearch2){
                System.out.println(employees[i] + " ");
            }
            System.out.println("You dont have a employee in this id");
        }
    }
    public void changeById(String id3,String position2){
        for (int i = 0; i < size; i++) {
            if (employees[i].getId().contains(id3)){
                employees[i].setPosition(position2);
                System.out.println(employees[i]);
            }
        }
    }
    public void searchByActive(){
        for (int i = 0; i <size ; i++) {
            if (employees[i].isActive()== true){
                System.out.println(employees[i] + " ");
            }
        }
    }
    public void searchByIdAndInactiveEmployee(String id4){
        for (int i = 0; i < size; i++) {
            if (employees[i].getId().contains(id4)){
                employees[i].setActive(false);
            }
            System.out.println("You dont have a employee in this id");
        }
    }
    public void searchByIdAndActiveEmployee1(String id5){
        for (int i = 0; i < size; i++) {
            if (employees[i].getId().contains(id5)){
                employees[i].setActive(true);
            }
            System.out.println("You dont have a employee in this id");
        }
    }
}


