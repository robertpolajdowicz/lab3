import java.time.LocalDate;
import java.time.Month;

public class Student extends Account {

    private String course;
    private int startYear;

    public Student(String login, String password, String firstName, String lastName, String course, int startYear) {
        super(login, password, firstName, lastName);
        this.course = course;
        this.startYear = startYear;
    }

    public int semester(){
        LocalDate today = LocalDate.now();
        int todayYear = today.getYear();
        Month todayMonth = today.getMonth();

        if(todayMonth.compareTo(Month.OCTOBER) < 0){
            todayYear--;
        }
        int sem = (todayYear - startYear) * 2 + 1;
        if(todayMonth.compareTo(Month.FEBRUARY) >= 0 && todayMonth.compareTo(Month.OCTOBER) < 0){
            sem++;
        }
        return sem;
    }







}
