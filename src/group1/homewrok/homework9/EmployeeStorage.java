package group1.homewrok.homework9;

public class EmployeeStorage {
    private static Employee[] employees = new Employee[10];
    private static int size = 0;

    public void add(Employee ob) {
        if (size == employees.length - 1) {
            extand();
        }
        employees[size] = ob;
        size++;
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

    public static void search(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getId().contains(keyword)) {
                found = true;
                System.out.println(employee);
            }
        }
    }
}

