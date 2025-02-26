package com.learning.JDBC_2;
import java.util.Scanner;
public class EmployeeManagementApp {
	    public static void main(String[] args) {
	        EmployeeDAO employeeDAO = new EmployeeDAO();
	        Scanner scanner = new Scanner(System.in);
	        
	        while (true) {
	            System.out.println("\n--- Employee Management System ---");
	            System.out.println("1. Add Employee");
	            System.out.println("2. View Employees");
	            System.out.println("3. Update Employee Salary");
	            System.out.println("4. Delete Employee");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            
	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Name: ");
	                    String name = scanner.next();
	                    System.out.print("Enter Age: ");
	                    int age = scanner.nextInt();
	                    System.out.print("Enter Department: ");
	                    String department = scanner.next();
	                    System.out.print("Enter Salary: ");
	                    double salary = scanner.nextDouble();
	                    employeeDAO.insertEmployee(name, age, department, salary);
	                    break;
	                case 2:
	                    employeeDAO.getAllEmployees();
	                    break;
	                case 3:
	                    System.out.print("Enter Employee ID to update salary: ");
	                    int id = scanner.nextInt();
	                    System.out.print("Enter New Salary: ");
	                    double newSalary = scanner.nextDouble();
	                    employeeDAO.updateEmployeeSalary(id, newSalary);
	                    break;
	                case 4:
	                    System.out.print("Enter Employee ID to delete: ");
	                    int deleteId = scanner.nextInt();
	                    employeeDAO.deleteEmployee(deleteId);
	                    break;
	                case 5:
	                    System.out.println("Exiting... Thank you!");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	}
