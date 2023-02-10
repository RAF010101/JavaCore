package group1.homewrok.homework9;

import java.util.Objects;

public class Employee {

    private String name;
    private String surname;
    private String salary;
    private String company;
    private String position;
    private String id;

    public Employee(String name, String surname, String salary, String company, String position, String id) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.company = company;
        this.position = position;
        this.id = id;
    }

    public Employee() {
        System.out.println("Hello");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        group1.homewrok.homework9.Employee employee = (group1.homewrok.homework9.Employee) o;

        if (!Objects.equals(name, employee.name)) return false;
        if (!Objects.equals(surname, employee.surname)) return false;
        if (!Objects.equals(salary, employee.salary)) return false;
        if (!Objects.equals(company, employee.company)) return false;
        if (!Objects.equals(position, employee.position)) return false;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary='" + salary + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

}

