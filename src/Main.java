import java.util.AbstractCollection;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("admin", "admin", "Marcin", "Mount");
        System.out.println(acc.authorize("1admin", "admin"));
        Teacher prof = new Teacher("admin", "admin", "Józef", "Smith", "Profesor");
        System.out.println(acc.toString());
        System.out.println(prof.toString());

        System.out.println(prof.getLogin());
        System.out.println(acc.getLogin());
        Account tea = new Account("admin", "admin", "marcin", "marcinowski");
        System.out.println(tea.getLogin());

        Student zak = new Student("admin123","1234","Jan","Kowalski","Informatyka",2019);
        Student zak2 = new Student("admin123","1234","Jan","Olsza","Informatyka",2019);
        Student zak3 = new Student("admin123","1234","Jan","Krzystof","Informatyka",2019);
        System.out.println(zak.semester());

        Subject sub= new Subject("Matematyka Dyskretna","Informatyka",2);
        SubjectInstance subi = new SubjectInstance(sub,2020,prof,2);
        //subi.enroll(zak);
        //subi.enroll(zak2);
        //subi.enroll(zak3);
        //System.out.println(subi.getCopy());

        Enroller interfejs= new AlphabeticEnroller();
        interfejs.setSubjectInstance(subi);
        interfejs.addStudent(zak);
        interfejs.addStudent(zak2);
        interfejs.addStudent(zak3);
        interfejs.process();
        System.out.println(subi.getCopy());



    }
}