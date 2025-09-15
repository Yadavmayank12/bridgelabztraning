import java.util.Scanner;
class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks for student " + (i+1) + ": ");
            marks[i][0] = sc.nextDouble();
            System.out.print("Enter Chemistry marks for student " + (i+1) + ": ");
            marks[i][1] = sc.nextDouble();
            System.out.print("Enter Maths marks for student " + (i+1) + ": ");
            marks[i][2] = sc.nextDouble();
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 50) grade[i] = "C";
            else grade[i] = "D";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " Percentage: " + percentage[i] + " Grade: " + grade[i]);
        }
    }
}