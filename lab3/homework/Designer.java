package lab3.homework;
import lab3.homework.Person;
public class Designer extends Person{
    private String[] appsUsed;
    public Designer(String name, String birthDate, String[] appsUsed) {
        super(name, birthDate);
        this.appsUsed = appsUsed;
    }

    public String[] getAppsUsed() {
        return appsUsed;
    }
}
