import college.student.Student;
import college.faculty.Faculty;
public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Ankit Saraswat", "BT2025");
        Faculty f = new Faculty("Dr. Sharma", "Computer Science");
        s.displayStudent();
        f.displayFaculty();
    }
}