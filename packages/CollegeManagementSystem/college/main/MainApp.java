import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;
public class MainApp {
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();
        Department d = new Department();
        s.displayStudent();
        f.displayFaculty();
        d.displayDepartment();
    }
}