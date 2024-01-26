package models;

public class Employee {
    private String name;
    private Double grossSalary;

    public Employee(String name, Double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public Employee() {

    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.Double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(java.lang.Double grossSalary) {
        this.grossSalary = grossSalary;
    }
}
