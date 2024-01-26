package services;

import models.Employee;

public class SalaryService {
    public Double netSalary(Employee employee) {
        Double resultingAmount = new TaxService().tax(employee.getGrossSalary()) + new PensionService().discount(employee.getGrossSalary());
        return employee.getGrossSalary() - resultingAmount;
    }

}
