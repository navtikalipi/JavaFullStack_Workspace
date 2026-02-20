package com.example;

import java.util.Scanner;

    public class Employee {

        private int id;
        private String name;
        private double salary;
        private String designation;
        private int leavesTaken;

        private static final int TOTAL_LEAVES = 32;


        public Employee(int id, String name, double salary, String designation, int leavesTaken) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.designation = designation;
            this.leavesTaken = leavesTaken;
        }

        // increment
        public double applyIncrement(double baseSalary, String designation) {

            if (designation.equalsIgnoreCase("Programmer")) {
                return baseSalary + (baseSalary * 0.10);
            }
            else if (designation.equalsIgnoreCase("Designer")) {
                return baseSalary + (baseSalary * 0.20);
            }

            return baseSalary;
        }

        // leave
        public double applyLeaveDeduction(double updatedSalary, int leavesTaken) {

            if (leavesTaken > TOTAL_LEAVES) {
                int extraLeaves = leavesTaken - TOTAL_LEAVES;
                double deductionPerLeave = updatedSalary / 30;
                updatedSalary -= (extraLeaves * deductionPerLeave);
            }

            return updatedSalary;
        }

        // Final salary
        public double calculateFinalSalary() {
            double updatedSalary = applyIncrement(salary, designation);
            return applyLeaveDeduction(updatedSalary, leavesTaken);
        }

        // Display method
        public void displayDetails() {
            System.out.println("\nEmployee Details:");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("Leaves Taken: " + leavesTaken);
            System.out.println("Final Salary: " + calculateFinalSalary());
        }

        // Main method
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Employee ID:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter Salary:");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter Designation (Programmer/Designer):");
            String designation = sc.nextLine();

            System.out.println("Enter Leaves Taken:");
            int leavesTaken = sc.nextInt();

            Employee emp = new Employee(id, name, salary, designation, leavesTaken);

            emp.displayDetails();

            sc.close();
        }
    }

