package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID:");
        int id = input.nextInt();
        System.out.println("Enter Name:");
        String name = input.next();
        System.out.println("Enter salary:");
        int salary = input.nextInt();
        EmployPayRoll employeePayroll = new EmployPayRoll(id, name, salary);
        System.out.println(employeePayroll.getId());
        System.out.println(employeePayroll.getName());
        System.out.println(employeePayroll.getSalary());

    }

}
