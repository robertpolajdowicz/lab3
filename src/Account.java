import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {
    public String getLogin() {
        return login;
    }

    public String getLastName() {
        return lastName;
    }

    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate lastlogin;

    public Account(String login, String password, String firstName, String lastName) {
        while (isLoginUsed(login)) {
            login += "1";
        }

        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastlogin = LocalDate.parse("1970-01-01");
        list.add(this);


    }

    public boolean authorize(String login, String password) {
        if (this.login.equals(login) && this.password.equals(password)) {
            this.lastlogin = LocalDate.now();
            return true;
        } else {
            return false;
        }
    }

    public final String toString() {
        return firstName + " " + lastName;
    }

    private static List<Account> list = new ArrayList<>();

    private boolean isLoginUsed(String login) {
        for (var l : list) {
            if (l.login.equals(login)) {
                return true;
            }
        }
        return false;
    }

    public Account(Account a) {
        this(a.login, a.password, a.firstName, a.lastName);
        this.lastlogin = a.lastlogin;
    }

}