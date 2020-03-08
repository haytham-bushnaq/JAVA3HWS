/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3hws1;

import java.util.Scanner;

/**
 *
 * @author LAPTOP
 */
public class Java3Hw1Scanner {
     public static void main(String[] args) {
        Employee[] employee = new Employee[3];
        Scanner scan = new Scanner(System.in);
        for (int i = Employee.count; i < employee.length; i++) {
            System.out.println("Empolyee "+(i+1));
            Employee e = new Employee();
            System.out.println("Eneter name ");
            String name = scan.nextLine();
            e.setName(name);
            System.out.println("Eneter Department ");
            String de =scan.nextLine();
            e.setDepartment(de);
            System.out.println("Eneter Salary ");
            double s = scan.nextDouble();
            e.setSalary(s);
            scan.nextLine();
            employee[i] = e;

        }
        sortByName(employee);
        showData(employee);

    }

    public static void sortBySalary(Employee[] e) {

        for (int i = 0; i < e.length; i++) {
            for (int j = i + 1; j < e.length; j++) {
                if (e[j].getSalary() > e[i].getSalary()) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }

    }

    public static void sortByName(Employee[] e) {

        for (int i = 0; i < e.length - 1; i++) {
            for (int j = i + 1; j < e.length; j++) {
                if (e[i].getName().compareTo(e[j].getName()) > 0) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }

    }

    private static void showData(Employee[] employees) {
        System.out.println("==================");
        System.out.printf("%-10s%-12s%-13s\n", "Name", "Department", "Salary");
        for (Employee employee : employees) {
            System.out.printf("%-10s%-12s%-13.2f\n",
                    employee.getName(),
                    employee.getDepartment(), employee.getSalary());
        }
    }

}
