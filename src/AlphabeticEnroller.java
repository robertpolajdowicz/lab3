import java.util.ArrayList;
import java.util.List;

public class AlphabeticEnroller implements Enroller {

    SubjectInstance subi;
    List<Student> studentsList = new ArrayList<>();

    @Override
    public void clear() {
        studentsList.clear();
    }

    @Override
    public void setSubjectInstance(SubjectInstance subinst) {
        subi = subinst;
    }

    @Override
    public void addStudent(Student stu) {
        studentsList.add(stu);
    }

    @Override
    public void process() {
        studentsList.sort((Student a, Student b) -> a.getLastName().compareTo(b.getLastName()));
        subi.students = studentsList.subList(0, subi.limit);
    }
}
