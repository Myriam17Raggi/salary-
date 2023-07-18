package salary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Employee data");
        //per costruire un oggetto Employee mi servono
        //firstName
        System.out.println("First name: ");
            String firstNameInput =  scan.nextLine();
        //lastName
        System.out.println("Last name: ");
        String lastNameInput =  scan.nextLine();
        //years
        System.out.println("Years: ");
        int yearsInput =  Integer.parseInt(scan.nextLine());
        //baseSalary
        System.out.println("Base salary: ");
        double baseSalaryInput =  Double.parseDouble(scan.nextLine());

        //con queste indomazione creo un oggetto EMpoyee
        Employee employee = new Employee(firstNameInput, lastNameInput, yearsInput, baseSalaryInput);
        //chiedo all'Employee di calcolare il salario attuale
        System.out.println("Actual salaty: " + employee.getActualSalary());
        scan.close();
    }
}
