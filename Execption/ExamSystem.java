package src;

import java.io.*;
import java.util.*;

public class ExamSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exam exam = new Exam();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student ID: ");
        String id = sc.nextLine();

        try {
            exam.submitExam(name, id);
            System.out.println("Exam submitted successfully!");
        } 
        catch (InvalidStudentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            System.out.println("Exam submission process completed.");
        }
    }
}

class Exam {
    void validateStudent(String name, String id) throws InvalidStudentException {
        if (name == null || name.trim().isEmpty() || id == null || id.trim().isEmpty()) {
            throw new InvalidStudentException("Invalid student details provided!");
        }
    }

    void submitExam(String name, String id) throws InvalidStudentException, IOException {
        validateStudent(name, id);

        
        Random rand = new Random();
        boolean ioFail = rand.nextBoolean();
        if (ioFail) {
            throw new IOException("Network error while submitting the exam!");
        }
    }
}

class InvalidStudentException extends Exception {
    InvalidStudentException(String msg) {
        super(msg);
    }
}