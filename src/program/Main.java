package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----Welcome to the company's server-----");

        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employees:");
        int N = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Employee #" + (i + 1));
            String isOutSourced;
            while (true) {
                System.out.println("Outsourced (y/n)?");
                isOutSourced = scan.nextLine();
                if (isOutSourced.equalsIgnoreCase("y") || isOutSourced.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Put a valid answer please");
                }
            }
            System.out.print("Id: ");
            Integer id = scan.nextInt();
            scan.nextLine();

            System.out.print("Name: ");
            String name = scan.nextLine();

            System.out.print("Hours:");
            Integer hour = scan.nextInt();

            System.out.println("Value per hour: ");
            Double valuePerHour = scan.nextDouble();

            if (isOutSourced.equalsIgnoreCase("y")) {
                System.out.println("Additional charge :");
                double additionalCharge = scan.nextDouble();
                employees.add(new OutsourcedEmployee(id, name, hour, valuePerHour, additionalCharge));

            } else if (isOutSourced.equalsIgnoreCase("n")) {
                employees.add(new Employee(id, name, hour, valuePerHour));
            }
        }

        System.out.println("--------- PAYMENTS--------- ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        scan.close();
    }
}
