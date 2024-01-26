import models.Employee;
import services.SalaryService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("name: ");
        employee.setName(sc.nextLine());

        System.out.print("salary: ");
        employee.setGrossSalary(sc.nextDouble());

        System.out.println(new SalaryService().netSalary(employee));

        sc.close();
    }
}