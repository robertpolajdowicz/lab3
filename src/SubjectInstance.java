import java.util.ArrayList;
import java.util.List;

public class SubjectInstance {
    Subject subject;
    int year;
    Teacher teacher;
    List<Student> students = new ArrayList<>();
    int limit;

    public SubjectInstance(Subject subject, int year, Teacher teacher, int limit) {
        this.subject = subject;
        this.year = year;
        this.teacher = teacher;
        this.limit = limit;
    }

    public boolean enroll(Student s) {

        if (students.size() < limit) {
            students.add(s);
            return true;
        } else {
            return false;
        }
    }

    public List<Student> getCopy() {
        return List.copyOf(students);
    }


}
