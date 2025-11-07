package src;

import java.time.*;
import java.util.*;

public class OnlineExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExamSubmission exam = new ExamSubmission();

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter submission hour (24hr format): ");
        int hour = sc.nextInt();
        System.out.print("Enter submission minute: ");
        int minute = sc.nextInt();

        LocalDateTime submissionTime = LocalDateTime.of(2025, 11, 6, hour, minute);

        try {
            exam.submitExam(fileName, submissionTime);
            System.out.println("Submission successful!");
        } catch (LateSubmissionException e) {
            System.out.println(e.getMessage());
        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}

class ExamSubmission {
    LocalDateTime deadline = LocalDateTime.of(2025, 11, 6, 18, 0);

    void submitExam(String fileName, LocalDateTime submissionTime)
            throws LateSubmissionException, InvalidFileFormatException {
        if (!fileName.endsWith(".pdf")) {
            throw new InvalidFileFormatException("Submission failed: invalid file format");
        }
        if (submissionTime.isAfter(deadline)) {
            throw new LateSubmissionException("Submission failed: you missed the deadline");
        }
        System.out.println("File " + fileName + " uploaded at " + submissionTime);
    }
}

class LateSubmissionException extends Exception {
    LateSubmissionException(String msg) {
        super(msg);
    }
}

class InvalidFileFormatException extends Exception {
    InvalidFileFormatException(String msg) {
        super(msg);
    }
}