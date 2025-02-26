package com.learning.JDBC_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDAO {

	    // Method to insert a new employee
	    public void insertEmployee(String name, int age, String department, double salary) {
	        String query = "INSERT INTO Employee (name, age, department, salary) VALUES (?, ?, ?, ?)";
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(query)) {
	            pstmt.setString(1, name);
	            pstmt.setInt(2, age);
	            pstmt.setString(3, department);
	            pstmt.setDouble(4, salary);
	            pstmt.executeUpdate();
	            System.out.println("Employee added successfully!");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Method to read all employees
	    public void getAllEmployees() {
	        String query = "SELECT * FROM Employee";
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(query);
	             ResultSet rs = pstmt.executeQuery()) {
	            System.out.println("ID | Name | Age | Department | Salary");
	            while (rs.next()) {
	                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " +
	                        rs.getInt("age") + " | " + rs.getString("department") + " | " +
	                        rs.getDouble("salary"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Method to update an employee's salary
	    public void updateEmployeeSalary(int id, double newSalary) {
	        String query = "UPDATE Employee SET salary = ? WHERE id = ?";
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(query)) {
	            pstmt.setDouble(1, newSalary);
	            pstmt.setInt(2, id);
	            int rowsAffected = pstmt.executeUpdate();
	            if (rowsAffected > 0) {
	                System.out.println("Employee salary updated successfully!");
	            } else {
	                System.out.println("Employee not found.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Method to delete an employee
	    public void deleteEmployee(int id) {
	        String query = "DELETE FROM Employee WHERE id = ?";
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(query)) {
	            pstmt.setInt(1, id);
	            int rowsAffected = pstmt.executeUpdate();
	            if (rowsAffected > 0) {
	                System.out.println("Employee deleted successfully!");
	            } else {
	                System.out.println("Employee not found.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}



