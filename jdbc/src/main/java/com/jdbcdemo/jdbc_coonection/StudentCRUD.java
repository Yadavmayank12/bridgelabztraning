package com.jdbcdemo.jdbc_coonection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
// run this code after conn
public class StudentCRUD {

    public static void main(String[] args) {
        insertStudent("Satya", 21);
        insertStudent("Shivam", 23);
        readStudents();
        updateStudent(1, "Amit  Singh  ", 22);
        deleteStudent(2);
        readStudents(); // see changes
    }

    // CREATE
    public static void insertStudent(String name, int age) {
        String query = "INSERT INTO students (name, age) VALUES (?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, name);
            ps.setInt(2, age);
            int rows = ps.executeUpdate();
            System.out.println(" " + rows + " Student Inserted Successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    public static void readStudents() {
        String query = "SELECT * FROM students";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            System.out.println(" Student Records:");
            System.out.println("----------------------------");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("age"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public static void updateStudent(int id, String newName, int newAge) {
        String query = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, newName);
            ps.setInt(2, newAge);
            ps.setInt(3, id);
            int rows = ps.executeUpdate();
            System.out.println(" " + rows + " Student Updated Successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    

    // DELETE
    public static void deleteStudent(int id) {
        String query = "DELETE FROM students WHERE id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(" " + rows + " Student Deleted Successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}